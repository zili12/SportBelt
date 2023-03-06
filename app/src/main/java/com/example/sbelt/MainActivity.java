package com.example.sbelt;

import androidx.appcompat.app.AppCompatActivity;

import android.media.metrics.Event;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void LoginPressed(View v){
        try {
            EditText username = (EditText) findViewById(R.id.UsernameText);
            EditText password = (EditText) findViewById(R.id.PasswordText);

            // After making the engine should be replaced to:
            // Engine.login(username.getText(),password.getText());
            System.out.println("Username: "+username.getText());
            System.out.println("Password: "+password.getText());

        }catch(Exception e){
            TextView errorLabel = (TextView) findViewById(R.id.Error);
            errorLabel.setText(String.format("Error: \"%s\"", e.getMessage()));
            e.printStackTrace();
        }
    }
}