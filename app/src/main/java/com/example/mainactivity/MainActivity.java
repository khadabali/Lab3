package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent nextPage = new Intent(this, NameActivity.class);
        Button btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(click -> startActivity(nextPage));
    }



    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data){


        super.onActivityResult(requestCode,resultCode,data);


    }


    SharedPreferences sharedPref = getSharedPreferences("myPrefs", Context.MODE_PRIVATE);

    @Override
    protected void  onStart(){super.onStart();}

    @Override
    protected void onPause(){ super.onPause();}

    @Override
    protected void  onResume(){super.onResume();}

    @Override
    protected void  onStop(){super.onStop();}

    @Override
    protected void  onDestroy(){super.onDestroy();}
/*
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(ACTIVITY_NAME, "onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(ACTIVITY_NAME, "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(ACTIVITY_NAME, "onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(ACTIVITY_NAME, "onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(ACTIVITY_NAME, "onDestroy()");
    }
*/

    }
