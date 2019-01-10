package com.clas.mukil.add;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // class created for each palettes used
    private EditText mNum1;
    private EditText mNum2;
    private Button mAdd;
    private TextView mAns;

    //over writing the process
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNum1 = (EditText)findViewById(R.id.num1);
        mNum2 = (EditText)findViewById(R.id.num2);
        mAdd = (Button) findViewById(R.id.add);
        mAns = (TextView) findViewById(R.id.ans);
/*TODO: add the number click the button*/
        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(mNum1.getText().toString());
                int number2 = Integer.parseInt(mNum2.getText().toString());
                int sum = number1 + number2;
                mAns.setText("Answer:  " + String.valueOf(sum));

            }
        });
    }
}
