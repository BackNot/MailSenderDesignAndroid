package com.example.mailsender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mailsender.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, MailSendActivity.class);
        startActivity(intent);
    }
    public void goToInboxActivity(View view) {
        Intent intent = new Intent(this, activity_inbox.class);
        startActivity(intent);
    }
    public void goToLoginActivity(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
