package com.aryankalia.logotest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logintoken(View view) {
        Intent getHomeScreen = new Intent(this, homescreen.class);

        final int result = 1;
        startActivity(getHomeScreen);

    }

    public void signuptoken(View view) {
        Intent getSignUp = new Intent(this, signup.class);

        final int result = 1;
        startActivity(getSignUp);
    }
}
