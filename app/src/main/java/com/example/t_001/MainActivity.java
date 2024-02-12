//This file was updated last at Feb/10/2024 06:37:46

package com.example.t_001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button submit;
    private TextView instruction;
    private TextView result;
    private EditText inputValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //object detection
        submit = findViewById(R.id.submit);
        instruction = findViewById(R.id.instruction);
        inputValue = findViewById(R.id.inputValue);
        result = findViewById(R.id.result);



//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////              Toast.makeText(MainActivity.this , "Hello", Toast.LENGTH_SHORT).show();
//
//                String str = inputValue.getText().toString();
//                int val = Integer.parseInt(str);
//                double output = val/1609.344;
//
//                result.setText("The ans is: " + output );
//
//            }
//        });

    }

    // using onclick attribute in xml file by
    // write android:onClick="Calculate" in xml file and define
    // public void Calculate (View view){ //.. code for action here }
    public void Calculate(View view){

        String str = inputValue.getText().toString();
        int val = Integer.parseInt(str);
        double output = val/1609.344;

        result.setText("The ans is: " + output );

    }


}