package com.example.amritesh.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edi1;
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.buttonOne);
        Button b2 = (Button) findViewById(R.id.buttonTwo);
        Button b3 = (Button) findViewById(R.id.buttonThree);
        Button b4 = (Button) findViewById(R.id.buttonFour);
        Button b5 = (Button) findViewById(R.id.buttonFive);
        Button b6 = (Button) findViewById(R.id.buttonSix);
        Button b7 = (Button) findViewById(R.id.buttonSeven);
        Button b8 = (Button) findViewById(R.id.buttonEight);
        Button b9 = (Button) findViewById(R.id.buttonNine);
        Button b0 = (Button) findViewById(R.id.buttonZero);
        Button b_dot = (Button) findViewById(R.id.buttonDot);
        Button b_add = (Button) findViewById(R.id.buttonAdd);
        Button b_sub = (Button) findViewById(R.id.buttonSubtract);
        Button b_mul = (Button) findViewById(R.id.buttonMultiply);
        Button b_div = (Button) findViewById(R.id.buttonDivide);
        Button b_equal = (Button) findViewById(R.id.buttonEqual);
        Button b_clear = (Button) findViewById(R.id.buttonClear);
        edi1 = (EditText) findViewById(R.id.editText);
        text = (TextView) findViewById(R.id.infoTextView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edi1.getText().toString() + "1";
                edi1.setText(str);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edi1.getText().toString() + "2";
                edi1.setText(str);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edi1.getText().toString() + "3";
                edi1.setText(str);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edi1.getText().toString() + "4";
                edi1.setText(str);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edi1.getText().toString() + "5";
                edi1.setText(str);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edi1.getText().toString() + "6";
                edi1.setText(str);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edi1.getText().toString() + "7";
                edi1.setText(str);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edi1.getText().toString() + "8";
                edi1.setText(str);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edi1.getText().toString() + "9";
                edi1.setText(str);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edi1.getText().toString() + "0";
                edi1.setText(str);
            }
        });
        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edi1.getText().toString() + ".";
                edi1.setText(str);
            }
        });
        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((edi1.getText().toString()).charAt(0)=='+'||(edi1.getText().toString()).charAt(0)=='/'||(edi1.getText().toString()).charAt(0)=='-'||(edi1.getText().toString()).charAt(0)=='*')
                {
                    calculate();
                }
                text.setText(edi1.getText().toString());
                edi1.setText("+");

                //calculate();
            }
        });
        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((edi1.getText().toString()).charAt(0)=='+'||(edi1.getText().toString()).charAt(0)=='/'||(edi1.getText().toString()).charAt(0)=='-'||(edi1.getText().toString()).charAt(0)=='*')
                {
                    calculate();
                }
                text.setText(edi1.getText().toString());
                edi1.setText("-");
            }
        });
        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((edi1.getText().toString()).charAt(0)=='+'||(edi1.getText().toString()).charAt(0)=='/'||(edi1.getText().toString()).charAt(0)=='-'||(edi1.getText().toString()).charAt(0)=='*')
                {
                    calculate();
                }
                text.setText(edi1.getText().toString());
                edi1.setText("/");
            }
        });
        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((edi1.getText().toString()).charAt(0)=='+'||(edi1.getText().toString()).charAt(0)=='/'||(edi1.getText().toString()).charAt(0)=='-'||(edi1.getText().toString()).charAt(0)=='*')
                {
                    calculate();
                }
                text.setText(edi1.getText().toString());
                edi1.setText("*");
            }
        });
        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("");
                edi1.setText("");
            }
        });
        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
    }
        public void calculate()
    {
        double d1=0,d2=0;
        d1=Double.parseDouble(text.getText().toString());
        char ch=edi1.getText().toString().charAt(0);
        String str = edi1.getText().toString().substring(1);
        if(ch=='+')
        {
            if(str=="")
            {
                d2=0;
            }
            else
                d2=Double.parseDouble(str);
            d1 = d1 + d2;
        }
        else if(ch=='-') {
            if (str == "") {
                d2 = 0;
            } else
                d2 = Double.parseDouble(str);
            d1 = d1 - d2;
        }
        else if(ch=='*')
        {
            if(str=="")
            {
                d2=1;
            }
            else
                d2=Double.parseDouble(str);
            d1 = d1 * d2;
        }
        else if(ch=='/')
        {
            if(str=="")
            {
                d2=1;
            }
            else
                d2=Double.parseDouble(str);
            d1 = d1 / d2;
        }
        text.setText(Double.toString(d1));
        edi1.setText(Double.toString(d1));
    }


}
