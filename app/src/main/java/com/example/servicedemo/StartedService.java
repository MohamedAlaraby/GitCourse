package com.example.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class StartedService extends Service {
    private static String TAG="SERVICE";
    public StartedService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG,"ON CREATE");
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"ON START COMMAND");
        return Service.START_STICKY;

    }
    @Override
    public void onDestroy() {
        Log.i(TAG,"ON DESTROY");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
           return null;
    }
}