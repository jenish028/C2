package com.example.c2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.c2.R;

public class MainActivity extends AppCompatActivity {
    TextView ans_txt;
    int a,b,c,k;
    String d;
    Button equal_btn, ce_btn,del_btn,one_btn, two_btn,three_btn ,four_btn,five_btn,six_btn,seven_btn, eight_btn, nine_btn;
    Button  multi_btn,sub_btn,plus_btn, dot_btn, zero_btn,modul_btn,divied_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ID BUINDING
        blinding();
        // BTN CLICk

        ce_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                 temp = ans_txt.getText().toString();
                ans_txt.setText("");
                a=0;b=0;c=0;
            }
        });

        one_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=ans_txt.getText().toString();
                ans_txt.setText(temp+"1");
                b=1;
//                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_LONG).show();
            }
        });
        two_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  temp = ans_txt.getText().toString();
                b=2;
                ans_txt.setText(temp+"2");

//                Toast.makeText(MainActivity.this, ""+b, Toast.LENGTH_SHORT).show();
            }
        });
        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
//                String d=temp+"+";
                a=Integer.parseInt(temp);
                ans_txt.setText(temp+"+");
                b=Integer.parseInt(temp);
                k=1;
//                Toast.makeText(MainActivity.this,""+a,Toast.LENGTH_SHORT).show();
            }
        });
        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              b=Integer.parseInt(temp);
                if(k==1)
                {
                    Add();
                }
                else if(k==2)
                {
                    Mul();
                }
                else if(k==3)
                {
                    Sub();
                }
                else if(k==4)
                {
                    Div();
                }
                else if (k==5)
                {
                    Mod();

                }


//                c=a+b;
//                ans_txt.setText(""+c);
//                Toast.makeText(MainActivity.this, ""+c, Toast.LENGTH_SHORT).show();
            }
        });
        three_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  temp = ans_txt.getText().toString();
                ans_txt.setText(temp+"3");
                b=3;
//                Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
            }
        });
        four_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=ans_txt.getText().toString();
                ans_txt.setText(temp+"4");
                b=4;
//                Toast.makeText(MainActivity.this,"4",Toast.LENGTH_SHORT).show();
            }
        });
        five_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
                ans_txt.setText(temp+"5");
                b=5;
//                Toast.makeText(MainActivity.this,"5",Toast.LENGTH_SHORT).show();
            }
        });
        six_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
                ans_txt.setText(temp+"6");
                b=6;
//                Toast.makeText(MainActivity.this,"6",Toast.LENGTH_SHORT).show();
            }
        });
        seven_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
                ans_txt.setText(temp+"7");
                b=7;
//                Toast.makeText(MainActivity.this,"7",Toast.LENGTH_SHORT).show();
            }
        });
        eight_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
                ans_txt.setText(temp+"8");
                b=8;
//                Toast.makeText(MainActivity.this,"8",Toast.LENGTH_SHORT).show();
            }
        });
        nine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
                ans_txt.setText(temp+"9");
                b=9;
//                Toast.makeText(MainActivity.this,"9",Toast.LENGTH_SHORT).show();
            }
        });
        zero_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
                ans_txt.setText(temp+"0");
                b=0;
//                Toast.makeText(MainActivity.this,"0",Toast.LENGTH_SHORT).show();
            }
        });
        modul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
                a=Integer.parseInt(temp);
                ans_txt.setText(temp+"%");
                k=5;
//                Toast.makeText(MainActivity.this,"%",Toast.LENGTH_SHORT).show();
            }
        });
        divied_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
                a=Integer.parseInt(temp);
                ans_txt.setText(temp+"/");
                k=4;
//                Toast.makeText(MainActivity.this,"/",Toast.LENGTH_SHORT).show();
            }
        });
        multi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
                a=Integer.parseInt(temp);
                ans_txt.setText(temp+"*");
                k=2;
//                Toast.makeText(MainActivity.this,"*",Toast.LENGTH_SHORT).show();
            }
        });
        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp;
                temp = ans_txt.getText().toString();
                a=Integer.parseInt(temp);
                ans_txt.setText(temp+"-");
                k=3;
//                Toast.makeText(MainActivity.this,"-",Toast.LENGTH_SHORT).show();
            }
        });

        dot_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
                ans_txt.setText(temp+".");
//                Toast.makeText(MainActivity.this,".",Toast.LENGTH_SHORT).show();
            }
        });
        del_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
                ans_txt.setText(" ");
                a=0;b=0;c=0;
//                Toast.makeText(MainActivity.this,"Delete",Toast.LENGTH_SHORT).show();
            }
        });

    }
    void Add() {
        c=a+b;
        ans_txt.setText(""+c);
//        Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();
    }
    void Sub() {
        c=a-b;
        ans_txt.setText(""+c);
//        Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();
    }
    void Mul() {
        c=a*b;
        ans_txt.setText(""+c);
//        Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();
    }
    void Div() {
        c=a/b;
        ans_txt.setText(""+c);
//        Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();
    }
    void Mod()
    {
        c= a%b;
        ans_txt.setText(""+c);
    }

    void blinding() {
        ce_btn = findViewById(R.id.ce_btn);
        del_btn = findViewById(R.id.del_btn);
        one_btn = findViewById(R.id.one_btn);
        two_btn = findViewById(R.id.two_btn);
        three_btn = findViewById(R.id.three_btn);
        four_btn = findViewById(R.id.four_btn);
        five_btn = findViewById(R.id.five_btn);
        six_btn = findViewById(R.id.six_btn);
        seven_btn = findViewById(R.id.seven_btn);
        eight_btn = findViewById(R.id.eight_btn);
        nine_btn = findViewById(R.id.nine_btn);
        zero_btn = findViewById(R.id.zero_btn);
        modul_btn = findViewById(R.id.modul_btn);
        divied_btn = findViewById(R.id.divied_btn);
        multi_btn = findViewById(R.id.multi_btn);
        sub_btn = findViewById(R.id.sub_btn);
        plus_btn = findViewById(R.id.plus_btn);
        dot_btn = findViewById(R.id.dot_btn);
        equal_btn = findViewById(R.id.equal_btn);
        ans_txt = findViewById(R.id.ans_txt);
    }
}