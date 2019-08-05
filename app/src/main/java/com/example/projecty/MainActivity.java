package com.example.projecty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void secondAct(View view){
        Intent intent = new Intent(MainActivity.this,AddReminder.class);

        startActivity(intent);
    }
    public void reminder(View view){
        Intent intent = new Intent(MainActivity.this,Reminder.class);

        startActivity(intent);
    }
    public void dis(View view){
        Intent intent = new Intent(MainActivity.this, ViewReminder.class);

        startActivity(intent);
    }
    public void complted(View view){
        Intent intent = new Intent(MainActivity.this, Completed.class);

        startActivity(intent);
    }
}
