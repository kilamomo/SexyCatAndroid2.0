package sexycat.android.com.sexycatandroid20.activity;

import android.app.Activity;

import sexycat.android.com.sexycatandroid20.iface.IHttpReqListener;
import sexycat.android.com.sexycatandroid20.bean.Bean;

/**
 * Created by liukai on 2015/1/26.
 */
public class BaseActivity extends Activity implements IHttpReqListener{
    @Override
    public <T> void OnComplete(int action, Bean<T> bean) {

    }
}
