package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonClicked(View v) {
        switch (v.getId()){
            case R.id.btn_share:
                Intent share = new Intent(getApplicationContext(),ShareActivity.class);
                        startActivity(share);
                        break;
            case R.id.btnabout:
                Intent about = new Intent(getApplicationContext(),AboutActivity.class);
                startActivity(about);
                break;
            case R.id.btnhelp:
                Intent help = new Intent(getApplicationContext(),HelpActivity.class);
                startActivity(help);
                break;
            default:
                break;
        }

    }
}