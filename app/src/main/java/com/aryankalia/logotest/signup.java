package com.aryankalia.logotest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Aryan Kalia on 2018-03-21.
 */

public class signup extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signupscreen);
    }

    public void signupsuccessful(View view) {
        Intent getSignUpSuccess = new Intent(this, signupsuccess.class);
        final int result = 1;

        startActivity(getSignUpSuccess);
    }
}
