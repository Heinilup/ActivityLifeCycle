package com.ikabi.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("主Create方法调用");
    }
    public void click1(View v){
        Intent intent = new Intent(this, Second.class);
        intent.putExtra("malename","邓超");
        intent.putExtra("femalename", "孙俪");
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("主Start方法调用");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("主Resume方法调用");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("主Pause方法调用");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("主Stop方法调用");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("主Destory方法调用");
    }
}
