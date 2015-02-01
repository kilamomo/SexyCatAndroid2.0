package sexycat.android.com.sexycatandroid20.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import sexycat.android.com.sexycatandroid20.R;
import sexycat.android.com.sexycatandroid20.attribute.SexyCatToast;

/**
 * Created by liukai on 2015/1/27.
 */
public class RegisterActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
    }

    public void init() {
        //昵称
        EditText mNameET = (EditText) findViewById(R.id.activity_register_name_et);
        //进入
        RelativeLayout mEnterRL = (RelativeLayout) findViewById(R.id.activity_register_enter_rl);
        mEnterRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(RegisterActivity.this,"完成注册",Toast.LENGTH_SHORT).show();
                RegisterActivity.this.finish();
            }
        });
        //
        RelativeLayout mSkipRL = (RelativeLayout) findViewById(R.id.activity_register_skip_rl);
        mSkipRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
//                Toast.makeText(RegisterActivity.this,"跳过注册",Toast.LENGTH_SHORT).show();
                SexyCatToast mSexCatToast = new SexyCatToast(RegisterActivity.this);
                mSexCatToast.showFuaction("咯咯哒~咯咯~咯咯~哒",Toast.LENGTH_LONG);
                RegisterActivity.this.finish();
            }
        });
    }
}
