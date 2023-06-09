package com.bca6sem;



import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;


public class DialogActivity extends AppCompatActivity {
    MaterialButton calcBtn, sibtn , tbtn ,circlebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        calcBtn = findViewById(R.id.calculateBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
        circlebtn=findViewById(R.id.circleBtn);
        sibtn=findViewById(R.id.interestBtn);
        sibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displaySimple();
            }
        });
        circlebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayAreaOfCircle();
            }
        });
        tbtn=findViewById(R.id.triangleBtn);
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displaytriangle();
            }
        });

    }

    private void displaytriangle(){
        AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
        builder.setTitle("Calculate Number");
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.areaoftriangle, null);
        builder.setView(view);
        EditText b = view.findViewById(R.id.baseEt);
        EditText h= view.findViewById(R.id.heightEt);
        MaterialButton calcBtn = view.findViewById(R.id.calBtn);
        TextView resultTv = view.findViewById(R.id.resultTv);

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float  result;
                result = (Float.parseFloat(b.getText().toString())*Float.parseFloat(h.getText().toString())/2);
                resultTv.setText(String.valueOf(result));

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    private void displaySimple(){
        AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
        builder.setTitle("Calculate Number");
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.interest, null);
        builder.setView(view);

        EditText p = view.findViewById(R.id.principleEt);
        EditText t= view.findViewById(R.id.timeEt);
        EditText r= view.findViewById(R.id.rateEt);
        MaterialButton calcBtn = view.findViewById(R.id.calBtn);
        TextView resultTv = view.findViewById(R.id.resultTv);

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float  result;
                result = (Float.parseFloat(p.getText().toString())*Float.parseFloat(t.getText().toString())*Float.parseFloat(r.getText().toString())/100);
                resultTv.setText(String.valueOf(result));

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    private void displayAreaOfCircle(){
        AlertDialog.Builder builder=new AlertDialog.Builder(DialogActivity.this);
        builder.setTitle("Calculate Area of Circle");
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.areaofcircle,null);
        builder.setView(view);

        EditText r= view.findViewById(R.id.radius);
        MaterialButton add=view.findViewById(R.id.circlebtn);
        TextView result=view.findViewById(R.id.resultcircle);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float output;
                output= (float) (Float.parseFloat(r.getText().toString())*Float.parseFloat(r.getText().toString())*Math.PI);
                result.setText(String.valueOf(output));
            }
        });
        builder.show();
    }


    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
        builder.setTitle("Calculate Number");
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_dialog, null);
        builder.setView(view);

        EditText firstEt = view.findViewById(R.id.firstEt);
        EditText secondEt = view.findViewById(R.id.secondEt);
        MaterialButton calcBtn = view.findViewById(R.id.calBtn);
        TextView resultTv = view.findViewById(R.id.resultTv);

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first, second, result;
                first = Integer.parseInt(firstEt.getText().toString());
                second = Integer.parseInt(secondEt.getText().toString());
                result = first + second;
                resultTv.setText(String.valueOf(result));

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }



}