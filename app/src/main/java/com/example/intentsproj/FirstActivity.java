package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.intenstproj.R;


public class FirstActivity extends AppCompatActivity {

    private Button button;
    EditText editText;
    String  x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);



        button =(Button) findViewById(R.id.button);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OK();
            }
        });
    }

    public void OK(){

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);


    }


}
