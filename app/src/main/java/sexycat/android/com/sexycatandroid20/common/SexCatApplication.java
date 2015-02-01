package sexycat.android.com.sexycatandroid20.common;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;

/**
 * Created by liukai on 2015/1/29.
 */
public class SexCatApplication extends Application {

    public static ActivityManager activityManager;

    private static SexCatApplication instance = null;

    public static SexCatApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    @Override
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

}
