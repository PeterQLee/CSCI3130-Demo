package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
	/* 
	   Function: sendMessage
	   Called on send_button.onClick():
	   ---------
	   Grabs text from editText and displays it on the main textview.
	 */
	EditText editText = (EditText) findViewById(R.id.edit_message);
	String message = editText.getText().toString();
	TextView textview = (TextView) findViewById(R.id.textView_disp);
	textview.setText(message);
	
    }
}
