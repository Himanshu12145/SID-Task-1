package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    TextView Name,Branch,Year,RegdNo;
    String name,branch,year,regdno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Name= findViewById(R.id.N);
        Branch= findViewById(R.id.B);
        Year= findViewById(R.id.Y);
        RegdNo= findViewById(R.id.R);


        Intent i = getIntent();
        name = i.getStringExtra("name");
         branch = i.getStringExtra("branch");
         year = i.getStringExtra("year");
         regdno = i.getStringExtra("regdno");

        Log.i("info", "onCreate: "+ name);
        Log.i("info", "onCreate: "+ branch);
        Log.i("info", "onCreate: "+ regdno);
        Log.i("info", "onCreate: "+ year);
        Name.setText(name);
        Branch.setText(branch);
        Year.setText(year);
        RegdNo.setText(regdno);





    }
}