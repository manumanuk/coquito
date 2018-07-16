package com.aryankalia.logotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class johnnyappleseed extends AppCompatActivity {
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_johnnyappleseed);
        editText = (EditText) findViewById(R.id.sentMessage);
        textView=(TextView) findViewById(R.id.response);

    }

    public void sendButton(View view) {
        String value = editText.getText().toString();
        textView.setText(value);
    }
}
