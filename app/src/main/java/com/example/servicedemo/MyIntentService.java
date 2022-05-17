package com.example.servicedemo;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

public class MyIntentService extends IntentService {


    public MyIntentService() {
        super("MyIntentService");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i("SERVICE","my handle intent started");
        long endTime=System.currentTimeMillis()+20*1000;
        while (System.currentTimeMillis()<endTime)
        {
            synchronized (this)
            {
                try{
                    wait(endTime-System.currentTimeMillis());
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("SERVICE","on Destroy");
    }
}