package com.manikandansethuraj.servicebound;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by MANIKANDAN_SETHURAJ on 2016-08-16.
 */
public class PlayerService extends Service {

    private static final String TAG = PlayerService.class.getSimpleName();
    private MediaPlayer mediaPlayer;

    @Override
    public void onCreate() {
        Log.d(TAG,"onCreate");
        mediaPlayer = MediaPlayer.create(this,R.raw.kabali);

        // super.onCreate();
    }

    @Nullable



    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG,"onBind");
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG,"onStart");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG,"onUnBind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        Log.d(TAG,"onDestroy");
        super.onDestroy();
        mediaPlayer.release();
    }

    //Cilent methods
    public void play(){
       mediaPlayer.start();
    }

    public  void pause(){
       mediaPlayer.pause();
    }

}
