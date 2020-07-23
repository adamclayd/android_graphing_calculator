package com.adam.graphingcalculator.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.adam.graphingcalculator.R;

import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.Function;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    public static final String FUNCTION = "com.adam.graphingcalculator.FUNCTION";

    // f(x) or f(y) pattern
    private final String F_OF_X_OR_Y_PATTERN = "^f\\([xy]\\)";

    // f(x, y) or f(y, x) pattern
    private final String F_OF_X_Y_PATTERN = "^f\\([xy],\\s*[xy]\\)";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupInputButtons();
        setupCeButton();
        setupBackspaceButton();
        setupCalcBtn();
        setupGraphBtn();
    }

    /**
     * Assign the input buttons onclick event
     */
    private void setupInputButtons() {
        Button dotBtn = findViewById(R.id.dotBtn);
        Button zeroBtn = findViewById(R.id.zeroBtn);
        Button equalsBtn = findViewById(R.id.equalsBtn);
        Button oneBtn = findViewById(R.id.oneBtn);
        Button twoBtn = findViewById(R.id.twoBtn);
        Button threeBtn = findViewById(R.id.threeBtn);
        Button fourBtn = findViewById(R.id.fourBtn);
        Button fiveBtn = findViewById(R.id.fiveBtn);
        Button sixBtn = findViewById(R.id.sixBtn);
        Button sevenBtn = findViewById(R.id.sevenBtn);
        Button eightBtn = findViewById(R.id.eightBtn);
        Button nineBtn = findViewById(R.id.nineBtn);
        Button plusBtn = findViewById(R.id.plusBtn);
        Button minusBtn = findViewById(R.id.minusBtn);
        Button starBtn = findViewById(R.id.starBtn);
        Button sinBtn = findViewById(R.id.sinBtn);
        Button cosBtn = findViewById(R.id.cosBtn);
        Button slashBtn = findViewById(R.id.slashBtn);
        Button tanBtn = findViewById(R.id.tanBtn);
        Button openParBtn = findViewById(R.id.openParBtn);
        Button closeParBtn = findViewById(R.id.closeParBtn);
        Button fBtn = findViewById(R.id.fBtn);
        Button xBtn = findViewById(R.id.xBtn);
        Button yBtn = findViewById(R.id.yBtn);
        Button powBtn = findViewById(R.id.powBtn);
        Button commaBtn = findViewById(R.id.commaBtn);

        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        equalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        starBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        sinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        cosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        slashBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        tanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        openParBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        closeParBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        fBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        xBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        yBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        powBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });

        commaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupInputButtonsOnClick(view);
            }
        });
    }

    /**
     * Input buttons onclick method
     * @param view
     */
    private void setupInputButtonsOnClick(View view) {
        TextView input = findViewById(R.id.input);

        String existing = input.getText().toString();
        String in = (String)view.getTag();
        input.setText(existing + in);
    }

    /**
     * Set the clear buttons onclick event
     */
    private void setupCeButton() {
        Button ceBtn = findViewById(R.id.ceBtn);

        ceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView input = findViewById(R.id.input);
                input.setText("");
            }
        });
    }

    /**
     * Set the backspace buttons onclick event
     */
    private void setupBackspaceButton() {
        Button backspaceBtn = findViewById(R.id.backspaceBtn);
        backspaceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView input = findViewById(R.id.input);
                String in = input.getText().toString();

                // remove one character from the end of the input
                if(!in.isEmpty()) {
                    input.setText(in.substring(0, in.length() - 1));
                }
            }
        });
    }

    /**
     * Set the calculate buttons onclick event
     */
    public void setupCalcBtn() {
        Button calcBtn = findViewById(R.id.calcBtn);

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView input = findViewById(R.id.input);
                String in = input.getText().toString();

                Resources r = getResources();

                if(!in.isEmpty()) {
                    // cannot calculate an expression with variables in it
                    if(in.contains(r.getString(R.string.x)) || in.contains(r.getString(R.string.y)) || in.contains(r.getString(R.string.f))) {
                        alert(R.string.cant_cal_function);
                    }
                    else {
                        Expression ex = new Expression(in);

                        if(!ex.checkLexSyntax())
                            input.setText(ex.getErrorMessage());
                        else
                            input.setText(String.valueOf(ex.calculate()));
                    }
                }
            }
        });
    }

    /**
     * Set the graph button onclick event
     */
    private void setupGraphBtn() {
        Button graphBtn = findViewById(R.id.graphBtn);

        graphBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView input = findViewById(R.id.input);
                String in = input.getText().toString();
                Resources r = getResources();

                // check function with regex to see if it can be graphed on a 2D coordnate plane
                Pattern fOfXOrYPattern = Pattern.compile(F_OF_X_OR_Y_PATTERN);
                Pattern fOfXYPattern = Pattern.compile(F_OF_X_Y_PATTERN);
                Matcher fOfXOrYMatcher = fOfXOrYPattern.matcher(in);
                Matcher fOfXYMatcher = fOfXYPattern.matcher(in);

                // cannot graph if there are no variables
                if(!in.contains(r.getString(R.string.f)) && !in.contains(r.getString(R.string.x)) && !in.contains(r.getString(R.string.y))) {
                    alert(R.string.cant_graph_expression);
                }
                else {
                    Function function = new Function(in);

                    if(!in.startsWith("f")) {
                        alert(R.string.wrong_function_format);
                    }
                    else if(fOfXYMatcher.find()) {
                        alert(R.string.cant_graph_3d);
                    }
                    else if(!function.checkSyntax() || !fOfXOrYMatcher.find()) {
                        alert(R.string.invalid_input);
                    }
                    else {
                        Intent intent = new Intent(MainActivity.this, CanvasActivity.class);
                        intent.putExtra(FUNCTION, in);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    /**
     * Shows an alert dialog with the given message
     * @param resMessage
     */
    private void alert(int resMessage) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.alert);
        builder.setMessage(resMessage);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }

    /**
     * Shows an alert dialog with the given message
     * @param message
     */
    private void alert(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.alert);
        builder.setMessage(message);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }
}