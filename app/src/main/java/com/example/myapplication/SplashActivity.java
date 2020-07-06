package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        displaySplash();
    }
        public void displaySplash(){
            Thread mythread = new Thread(){
                @Override
                public void run() {
                    try {
                        int displaytime = 8000;
                        int waittime = 0;
                        while (waittime < displaytime) {
                            sleep(100);
                            waittime = waittime + 100;
                        }
                        super.run();
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finally {
                        Intent a = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(a);
                        finish();
                    }
                }
            };
            mythread.start();
        }
    }

