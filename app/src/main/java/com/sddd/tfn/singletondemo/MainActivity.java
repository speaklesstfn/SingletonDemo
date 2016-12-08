package com.sddd.tfn.singletondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton1 s11 = Singleton1.getInstance();
                s11.setName("线程1创建的对象");
                Log.d(TAG, s11.toString());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton1 s12 = Singleton1.getInstance();
                s12.setName("线程2创建的对象");
                Log.d(TAG, s12.toString());
            }
        }).start();

    }
}
