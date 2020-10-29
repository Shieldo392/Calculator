package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    String dau = "";
    String ketQua = "";
    int dem = 0;
    TextView tvResult;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnCancel;
    Button btnDot, btnCong, btnTru, btnNhan, btnChia, btnDel, btnBang;
    double s1, s2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tvResult);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnCancel = findViewById(R.id.btnCancel);
        btnDot = findViewById(R.id.btnDot);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        btnDel = findViewById(R.id.btnDel);
        btnBang = findViewById(R.id.btnBang);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketQua = "";
                tvResult.setText("");
            }
        });
        ketQua = tvResult.getText() + "";
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ketQua != "0") {
                    ketQua += "0";
                    double num = Double.valueOf(ketQua);
                    tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketQua += "1";
                double num = Double.valueOf(ketQua);
                tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketQua += "2";
                double num = Double.valueOf(ketQua);
                tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketQua += "3";
                double num = Double.valueOf(ketQua);
                tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketQua += "4";
                double num = Double.valueOf(ketQua);
                tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketQua += "5";
                double num = Double.valueOf(ketQua);
                tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketQua += "6";
                ketQua.split(",");
                double num = Double.valueOf(ketQua);
                tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketQua += "7";
                ketQua.split(",");
                double num = Double.valueOf(ketQua);
                tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketQua += "8";
                double num = Double.valueOf(ketQua);
//                ++dem;
//                if(dem == 3){
//                    String str1 = ketQua.substring(0, ketQua.length()-3);
//                    String str2 = ketQua.substring(ketQua.length()-3);
//                    ketQua = "";
//                    ketQua+= str1 + "," + str2;
//                    dem = 0;
//                }
                tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketQua += "9";

                double num = Double.valueOf(ketQua);
                tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (ketQua.length() == 1) {
                        ketQua = "";
                        tvResult.setText("");
                    } else {
                        ketQua = ketQua.substring(0, ketQua.length() - 1);
                        double num = Double.parseDouble(ketQua);
                        tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
                    }
                } catch (Exception e) {
                    Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_LONG);
                }
            }
        });
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = Double.valueOf(ketQua);
                ketQua = "";
                tvResult.setText("");
                dau = "+";
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = Double.valueOf(ketQua);
                ketQua = "";
                tvResult.setText("");
                dau = "-";
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = Double.valueOf(ketQua);
                ketQua = "";
                tvResult.setText("");
                dau = "*";
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = Double.valueOf(ketQua);
                ketQua = "";
                tvResult.setText("");
                dau = "/";
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ketQua != "" && ketQua.contains(".") ==  false)
                {
                    ketQua+=".";
                    double num = Double.valueOf(ketQua);
                    tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
                }
            }
        });
        btnBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2 = Double.valueOf(ketQua);
                switch (dau) {
                    case "+":
                        double num = (s1 + s2);
                        tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
                        ketQua = num+"";
                        break;
                    case "-":
                        num = (s1 - s2);
                        tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
                        ketQua = num+"";
                        break;
                    case "*":
                        num = (s1 * s2);
                        ketQua = num+"";
                        tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
                        break;
                    case "/":
                        num = (s1 / s2);
                        tvResult.setText(NumberFormat.getNumberInstance(Locale.US).format(num));
                        ketQua = num+"";
                        break;
                }
            }
        });

    }
}