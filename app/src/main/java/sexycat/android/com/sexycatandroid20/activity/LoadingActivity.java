package sexycat.android.com.sexycatandroid20.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import sexycat.android.com.sexycatandroid20.R;
import sexycat.android.com.sexycatandroid20.common.SexCatApplication;
import sexycat.android.com.sexycatandroid20.utils.PrefUtils;


public class LoadingActivity extends BaseActivity {
    //间隔次数
    private final int TIME = 2;
    //Loading启动
    private final int START = 1;
    //Loading结束
    private final int END = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        new LoadingThread().start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_loading, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*判断用户信息进行跳转*/
    public void getAppName() {
        //用户信息
       String isNull= PrefUtils.ReadSharedPreferencesString("UserInformation","name");
        Log.v("getAppName:",isNull+"");
        Intent intent;
        if (isNull == null) {
            intent = new Intent(LoadingActivity.this, RegisterActivity.class);
        } else {
            intent = new Intent(LoadingActivity.this, MainActivity.class);
        }
        startActivity(intent);
        LoadingActivity.this.finish();
    }

    /*Loading页线程*/
    class LoadingThread extends Thread implements Runnable {
        @Override
        public void run() {
            super.run();
            for (int i = 1; i <= TIME; i++) {
                handler.sendEmptyMessage(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    /*Loading Handler 处理延迟跳转*/
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            // TODO Auto-generated method stub
            super.handleMessage(msg);
            switch (msg.what) {
                case START:
                    break;
                case END:
                getAppName();
                    break;
            }
        }
    };
}
