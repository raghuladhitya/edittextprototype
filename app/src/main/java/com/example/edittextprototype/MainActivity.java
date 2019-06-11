package com.example.edittextprototype;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText e1,e2,e3,e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.edFirstName);
        e2 = (EditText)findViewById(R.id.edLastName);
        e3 = (EditText)findViewById(R.id.edEmailAdress);
        e4 = (EditText)findViewById(R.id.edPhone);
    }

}
