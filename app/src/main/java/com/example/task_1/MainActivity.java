package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Name,Year,Branch,Regdno;
    boolean isAllFieldsChecked = false;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name = (EditText) findViewById(R.id.name);
        Branch =(EditText) findViewById(R.id.branch);
        Year =(EditText) findViewById(R.id.year);
        Regdno = (EditText)findViewById(R.id.regdno);

    }

    public  void onCli(View view)
    {
//        Log.i("info", "onCli: "+name);
//        Log.i("info", "onCli32: "+year);
//        Log.i("info", "onCl43i: "+branch);
//        Log.i("info", "onCl432i: "+regdno);
//        Log.i("info", "onCli2324342: "+Regdno);
//        Log.i("info", "onCli2324342: "+Name.getText().toString());
//        Log.i("info", "onCli: "+name);

        isAllFieldsChecked = CheckAllFields();
                if (isAllFieldsChecked) {
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("name",Name.getText().toString());
        i.putExtra("branch", Branch.getText().toString());
        i.putExtra("year",Year.getText().toString());
        i.putExtra("regdno",Regdno.getText().toString());
        startActivity(i);
                }

    }
    private boolean CheckAllFields() {
        if (Name.getText().toString().length() == 0) {
            Name.setError("Name is required");
            return false;
        }

        if (Branch.getText().toString().length() == 0) {
            Branch.setError("Branch is required");
            return false;
        }

        if (Year.getText().toString().length() == 0) {
            Year.setError("Year is required");
            return false;
        }


        if ( Regdno.getText().toString().length() == 0) {
            Regdno.setError("Registration is required");
            return false;
        }
        if ( Regdno.getText().toString().length() > 10) {
            Regdno.setError("Registration Number must be 10 digits");
            return false;
        }

        else if ( Regdno.getText().toString().length() < 10 ) {
            Regdno.setError("Registration Number must be 10 digits");
            return false;
        }

        // after all validation return true.
        return true;
    }
}