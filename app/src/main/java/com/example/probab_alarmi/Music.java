package com.example.probab_alarmi;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.widget.EditText;
import androidx.annotation.Nullable;


public class Music extends Service {
    private MediaPlayer mediaPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);

        mediaPlayer.start();
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        new rndmNumGen();
        int sum = rndmNumGen.sum;

        EditText sol = null;
        EditText editText = sol.findViewById(R.id.solution);
        int solution = Integer.parseInt(String.valueOf(editText));

        if(sum == solution) {
            mediaPlayer.stop();
        }else{
            new rndmNumGen();
            sum = rndmNumGen.sum;
            editText = sol.findViewById(R.id.solution);
            solution = Integer.parseInt(String.valueOf(editText));

        }
    }
}
