package com.aryankalia.logotest;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class messaging extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaging);
    }

    public void messengertoken(View view) {
        Intent getMessenger = new Intent(this, johnnyappleseed.class);

        final int result = 1;
        startActivity(getMessenger);
    }
}