package sexycat.android.com.sexycatandroid20.dialog;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import sexycat.android.com.sexycatandroid20.R;


/**
 * Created by liukai on 2015/1/27.
 */
public class ReportDialog extends Dialog {
    Context context;

    public ReportDialog(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        this.context = context;
    }

    public ReportDialog(Context context, int theme) {
        super(context, theme);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main_dialog_report);
        init();
    }

    public void init() {
        RelativeLayout mGoRL = (RelativeLayout) findViewById(R.id.activity_main_dialog_report_go_rl);
        mGoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReportDialog.this.dismiss();
            }
        });
        //
        final ImageView mReportIV = (ImageView) findViewById(R.id.activity_main_dialog_report_report_iv);
        mReportIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("sdsd","sdsd");
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
}
