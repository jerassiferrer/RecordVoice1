package com.example.jera.recordvoice;

import android.util.Log;

/**
 * Created by jera on 04/04/16.
 */
public class AppLog {

    private  static  final String APP_TAG = "AudioRecorder";

    public static  int logString (String message){
        return Log.i(APP_TAG, message);
    }

}
