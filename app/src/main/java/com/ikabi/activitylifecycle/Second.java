package com.ikabi.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Heinilup on 2015/8/18.
 */
public class Second extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        System.out.println("二onCreat方法调用");
        Intent intent = getIntent();
        String maleName = intent.getStringExtra("malename");
        String femaleName = intent.getStringExtra("femalename");

        Random rd = new Random();
        int yanzhi = rd.nextInt(100);

        TextView tv = (TextView) findViewById(R.id.sectext);
        tv.setText(maleName + "和" + femaleName + "的婚姻颜值为" + yanzhi);

    }
    public void click2(View v){
        Intent intent = new Intent();
        intent.setClass(this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("二Start方法调用");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("二Resume方法调用");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("二Pause方法调用");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("二Stop方法调用");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("二Destory方法调用");
    }
}
