package sexycat.android.com.sexycatandroid20.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import sexycat.android.com.sexycatandroid20.R;

/**
 * Created by liukai on 2015/1/28.
 */
public class GoodDetailsActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gooddetails);
        init();
    }
    public void init(){
        //返回按钮
        Button mBackBT=(Button)findViewById(R.id.activity_gooddetails_back_bt);
        mBackBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoodDetailsActivity.this.finish();
            }
        });
        //
    }
}
