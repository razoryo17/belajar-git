package com.example.ali.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView txtvi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.edt1);
        txtvi = (TextView)findViewById(R.id.textid);

    }

    public void btn(View view){

        String temp;
        temp = editText.getText().toString();
        txtvi.setText(temp);

    }
}
