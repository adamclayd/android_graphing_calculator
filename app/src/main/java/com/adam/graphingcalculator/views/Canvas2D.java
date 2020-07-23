package com.adam.graphingcalculator.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.Log;
import android.view.View;

import org.mariuszgromada.math.mxparser.Function;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <h1>Canvas</h1>
 *
 * A 2d coordnate plane to
 * graph equations on
 */
public class Canvas2D extends View {
    private final int UNIT_SIZE = 100;
    private final float GRAPH_INCREMENT = (float)0.01;
    private final String F_OF_X_PATTERN = "^f\\(x\\)";

    private Paint mPaint, otherPaint, outerPaint;
    private Point origin;

    private String function;

    private int minX,maxX,minY,maxY;

    public Canvas2D(Context context, String function) {
        super(context);

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(((float)0.6));

        otherPaint = new Paint();
        otherPaint.setAntiAlias(true);
        otherPaint.setStyle(Paint.Style.STROKE);
        otherPaint.setStrokeWidth(3);


        outerPaint = new Paint();
        outerPaint.setStyle(Paint.Style.FILL);
        outerPaint.setColor(Color.YELLOW);

        this.function = function;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPaint(outerPaint);
        drawGraph(50, 250, 1050, 1250, canvas, otherPaint, mPaint);

    }

    public static float pxFromDp(final Context context, final float dp) {
        return dp * context.getResources().getDisplayMetrics().density;
    }

    private void drawGraph(int left, int top, int right, int bottom, Canvas canvas, Paint paint, Paint unitPaint) {
        // calculate what {0, 0} is on the graph
        origin = new Point((left + right) / 2, (top + bottom) / 2);

        // draw a square to contain the graph
        canvas.drawLine(left, top, right, top, paint);
        canvas.drawLine(left, top, left, bottom, paint);
        canvas.drawLine(left, bottom, right, bottom, paint);
        canvas.drawLine(right, bottom, right, top, paint);

        // draw the origin x and y lines
        canvas.drawLine(left, origin.y, right, origin.y, paint);
        canvas.drawLine(origin.x, top, origin.x, bottom, paint);

        // draw the graph x units
        int count = 2; // start at 2 to take the borders of the graph into account
        for(int i = left + UNIT_SIZE; i < right; i += UNIT_SIZE) {
            canvas.drawLine(i, top, i, bottom, unitPaint);
            count++;
        }

        // +x and -x
        maxX = count / 2;
        minX = -(count / 2);

        // draw the graph y units
        count = 2; // start at 2 to take the borders of the graph into account
        for(int i = top + UNIT_SIZE; i < bottom; i += UNIT_SIZE) {
            canvas.drawLine(left, i, right, i, unitPaint);
            count++;
        }

        // +y and -y
        maxY = count / 2;
        minY = -(count / 2);


        // check for f(x) or f(y)
        Pattern p = Pattern.compile(F_OF_X_PATTERN);
        Matcher m = p.matcher(function);

        Function f = new Function(function);

        // store the previous point so a line can be drawn from it
        Point prev = null;

        // f(x)
        if(m.find()) {
            for(float x = minX; x <= maxX; x += GRAPH_INCREMENT) {
                // calculate the function for the value of x
                double y = f.calculate(x);

                // convert to pixels
                double p1y = origin.y - (y * UNIT_SIZE);
                double p1x = origin.x + (x * UNIT_SIZE);

                if(prev == null) {
                    prev = new Point((int)p1x, (int)p1y);
                }
                else {
                    // draw a line to from the previous point to the current one
                    Point p1 = new Point((int) p1x, (int) p1y);
                    canvas.drawLine(prev.x, prev.y, p1.x, p1.y, paint);
                    prev = p1;
                }
            }
        }
        // f(y)
        else {
            for(float y = minY; y <= maxY; y += GRAPH_INCREMENT) {
                // calculate the function for the value of y
                double x = f.calculate(y);

                // convert to pixels
                double p1x = origin.x - (x * UNIT_SIZE);
                double p1y = origin.y + (y * UNIT_SIZE);

                if(prev == null) {
                    prev = new Point((int)p1x,(int)p1y);
                }
                else {
                    // draw a line to from the previous point to the current one
                    Point p1 = new Point((int) p1x, (int) p1y);
                    canvas.drawLine(prev.x, prev.y, p1.x, p1.y, paint);
                    prev = p1;
                }
            }
        }
    }
}
