package com.example.m10ga.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    Button btn_ac, btn_root, btn_clear, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_divide, btn_multiply, btn_1, btn_2, btn_3, btn_minus, btn_0, btn_decimal, btn_equals, btn_plus, btn_plus_minus;
    TextView tv_formula, result, tv_formula2;

    boolean Addition, Subtraction, Multiplication, Division, SquareRoot, PlusMinus;
    double value;
    float valueOne, valueTwo;
    String text1, text2;
    String ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_formula = (TextView) findViewById(R.id.tv_formula);
        result = (TextView) findViewById(R.id.result);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_ac = (Button) findViewById(R.id.btn_ac);
        btn_root = (Button) findViewById(R.id.btn_root);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_decimal = (Button) findViewById(R.id.btn_decimal);
        btn_equals = (Button) findViewById(R.id.btn_equals);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_plus_minus = (Button) findViewById(R.id.btn_percentage);
//[1]
        tv_formula.setText("");

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_formula.setText("");
                result.setText("");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_formula.setText(tv_formula.getText() + "0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_formula.setText(tv_formula.getText() + "1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_formula.setText(tv_formula.getText() + "2");
//                value=tv_formula.getText().toString();
//                tv_formula.setText(value+"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_formula.setText(tv_formula.getText() + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_formula.setText(tv_formula.getText() + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_formula.setText(tv_formula.getText() + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_formula.setText(tv_formula.getText() + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_formula.setText(tv_formula.getText() + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_formula.setText(tv_formula.getText() + "8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_formula.setText(tv_formula.getText() + "9");
            }
        });

        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tv_formula.getText().toString().contains(".")) {
                    tv_formula.setText(tv_formula.getText() + ".");
                }
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                value=tv_formula.getText().toString();
//                tv_formula.setText("+");
                valueOne = Float.parseFloat(tv_formula.getText() + "");
                Addition = true;
              tv_formula.setText(null);

            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                value=tv_formula.getText().toString();
//                tv_formula.setText("+");
                valueOne = Float.parseFloat(tv_formula.getText() + "");
                Subtraction = true;
                tv_formula.setText(null);
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                value=tv_formula.getText().toString();
//                tv_formula.setText("+");
                valueOne = Float.parseFloat(tv_formula.getText() + "");
                Multiplication = true;
                tv_formula.setText(null);
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                value=tv_formula.getText().toString();
//                tv_formula.setText("+");
                valueOne = Float.parseFloat(tv_formula.getText() + "");
                Division = true;
                tv_formula.setText(null);
            }
        });

        btn_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = Double.parseDouble(tv_formula.getText() + "");
                SquareRoot = true;
                tv_formula.setText(null);
            }
        });

        btn_plus_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tv_formula.getText().toString().isEmpty()) {
                    valueOne = Float.parseFloat(tv_formula.getText() + "");
                    if (valueOne > 0) {
                        valueOne = Float.parseFloat("-" + String.valueOf(valueOne));
                    } else if (valueOne <= 0) {
                        valueOne = Float.parseFloat(String.valueOf(valueOne));
                    }
                    PlusMinus = true;
                    tv_formula.setText(String.format(Locale.getDefault(), "%f", valueOne));
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1 = tv_formula.getText().toString();
                if (text1.length() > 0) {
                    String newText1 = text1.substring(0, text1.length() - 1);
                    tv_formula.setText(newText1);
                }
            }
        });


        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlusMinus == false) {
                    if (Addition == true) {
                        valueTwo = Float.parseFloat(tv_formula.getText() + "");
                        result.setText(valueOne + valueTwo + "");
                        Addition = false;
                    }
                    if (Subtraction == true) {
                        valueTwo = Float.parseFloat(tv_formula.getText() + "");
                        result.setText(valueOne - valueTwo + "");
                        Subtraction = false;
                    }
                    if (Multiplication == true) {
                        valueTwo = Float.parseFloat(tv_formula.getText() + "");
                        result.setText(valueOne * valueTwo + "");
                        Multiplication = false;
                    }
                    if (Division == true) {
                        valueTwo = Float.parseFloat(tv_formula.getText() + "");
                        result.setText(valueOne / valueTwo + "");
                        Division = false;
                    }
                    if (SquareRoot == true) {
                        value = Math.sqrt(value);
                        ans = Double.toString(value);
                        result.setText(ans);
                    }
                }
                if (PlusMinus == true) {
                    if (Addition == true) {
                        valueTwo = Float.parseFloat(tv_formula.getText() + "");
                        result.setText(valueOne + valueTwo + "");
                        Addition = false;
                    }
                    if (Subtraction == true) {
                        valueTwo = Float.parseFloat(tv_formula.getText() + "");
                        result.setText(valueOne - valueTwo + "");
                        Subtraction = false;
                    }
                    if (Multiplication == true) {
                        valueTwo = Float.parseFloat(tv_formula.getText() + "");
                        result.setText(valueOne * valueTwo + "");
                        Multiplication = false;
                    }
                    if (Division == true) {
                        valueTwo = Float.parseFloat(tv_formula.getText() + "");
                        result.setText(valueOne / valueTwo + "");
                        Division = false;
                    }
                    if (SquareRoot == true) {
                        value = Math.sqrt(value);
                        ans = Double.toString(value);
                        result.setText(ans);
                    }
                }
            }
        });


    }

}

//[1]
//[2]