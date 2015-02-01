package sexycat.android.com.sexycatandroid20.attribute;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import sexycat.android.com.sexycatandroid20.R;

/**
 * Created by liukai on 2015/1/30.
 */
public class SexyCatToast extends Toast {
    private Context context;

    public SexyCatToast(Context context) {
        super(context);
        this.context = context;
    }

    /*自定义Toast显示*/
    public void showFuaction(String CharSequence, int duration) {
        Toast mToast = SexyCatToast.makeText(context, CharSequence, duration);
        View mToastView = LayoutInflater.from(context.getApplicationContext())
                .inflate(R.layout.toast_view, null);
        TextView mContextTV = (TextView) mToastView.findViewById(R.id.toast_context_tv);
        mContextTV.setText(CharSequence);
        mToast.setView(mToastView);
        mToast.show();
    }
}
