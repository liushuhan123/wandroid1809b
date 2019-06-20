package com.example.project_text.utile;

import android.app.Application;

public class MyApp extends Application {
    public static Application mApplicationContext;
    public static boolean mIsLogin=false;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationContext=this;
    }
}
