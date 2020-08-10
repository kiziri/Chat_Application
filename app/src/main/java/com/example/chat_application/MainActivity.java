package com.example.chat_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mainPageCLick(View view) {
        switch (view.getId()) {
            case R.id.userLoginBtn :
                intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.userJoinBtn :

                break;
        }
    }
}