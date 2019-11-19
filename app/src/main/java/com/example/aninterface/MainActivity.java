package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("RRRRRRR", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("RRRRRRR", "onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("RRRRRRR", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("RRRRRRR", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("RRRRRRR", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("RRRRRRR", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("RRRRRRR", "onStop");
    }


}
