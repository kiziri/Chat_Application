package com.example.chat_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mainPageCLick(View view) {
        switch (view.getId()) {
            case R.id.userLoginBtn :

                break;
            case R.id.userJoinBtn :

                break;
        }
    }
}