package com.example.meesh.hiworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final  String TAG= MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.i(TAG, "onCreate: in oncreate method ");
        Toast.makeText(MainActivity.this, "ONCREATE", Toast.LENGTH_LONG).show();




        Button btn =findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Welcome to Android", Toast.LENGTH_LONG).show();

                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        }

        protected void onStart(){
            super.onStart();
//            Log.i(TAG, "onStart: in start method ");
            Toast.makeText(MainActivity.this, "ONSTART", Toast.LENGTH_LONG).show();


        }
        protected void onRestart() {
            super.onRestart();
//            Log.i(TAG, "onRestart: in restart method ");
            Toast.makeText(MainActivity.this, "ON RESTART", Toast.LENGTH_LONG).show();


        }
        protected void onResume() {
            super.onResume();
//            Log.i(TAG, "onResume: in resume method ");
            Toast.makeText(MainActivity.this, "ON RESUME", Toast.LENGTH_LONG).show();


        }
        protected void onPause() {
            super.onPause();
//            Log.i(TAG, "onPause: in pause method ");
            Toast.makeText(MainActivity.this, "ON PAUSE", Toast.LENGTH_LONG).show();


        }
        protected void onStop() {
            super.onStop();
//            Log.i(TAG, "onStop: in stop method ");
            Toast.makeText(MainActivity.this, "ON STOP", Toast.LENGTH_LONG).show();


        }
        protected void onDestroy() {
            super.onDestroy();
//            Log.i(TAG, "onDestroy: in destroy method ");
            Toast.makeText(MainActivity.this, "ON DESTROY", Toast.LENGTH_LONG).show();


        }
    }
