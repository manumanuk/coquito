package com.aryankalia.logotest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class featured extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_featured);
    }

    public void featuredMessengerToken(View view) {
        Intent getMessenger = new Intent(this, messaging.class);

        final int result = 1;
        startActivity(getMessenger);
    }

    public void johnnyappleseedtoken(View view) {
        Intent getMessenger = new Intent(this, messaging.class);

        final int result = 1;
        startActivity(getMessenger);
    }
}