package com.example.sjcet.expint;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openSecondActivity(View view) {
        Intent intent = new Intent(this, Act2.class);
        startActivity(intent);
    }
}

