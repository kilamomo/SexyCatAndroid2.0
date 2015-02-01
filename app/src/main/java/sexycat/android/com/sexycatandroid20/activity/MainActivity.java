package sexycat.android.com.sexycatandroid20.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import sexycat.android.com.sexycatandroid20.R;
import sexycat.android.com.sexycatandroid20.dialog.ReportDialog;
import sexycat.android.com.sexycatandroid20.dialog.SearchClassificationDialog;

/**
 * Created by liukai on 2015/1/26.
 */
public class MainActivity extends BaseActivity {
    ReportDialog mReportDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        //弹出签到对话框
        mReportDialog = new ReportDialog(MainActivity.this, R.style.Dialog_normal);
        mReportDialog.show();
        //分类菜单
        Button menu = (Button) findViewById(R.id.activity_main_menu_bt);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击弹出搜索分类页面
                SearchClassificationDialog mSearchClassificationDialog = new SearchClassificationDialog(MainActivity.this, R.style.Dialog_Full);
                mSearchClassificationDialog.show();
            }
        });
        //
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.v("OnkeyDown:",String.valueOf(keyCode));
        return super.onKeyDown(keyCode, event);
    }
}
