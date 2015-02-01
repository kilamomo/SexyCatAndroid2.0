package sexycat.android.com.sexycatandroid20.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sexycat.android.com.sexycatandroid20.R;


/**
 * Created by liukai on 2015/1/28.
 */
public class ClassificationDetailsLVAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> mModleList;

    public ClassificationDetailsLVAdapter(Context context, ArrayList<String> mModleList) {
        this.context = context;
        this.mModleList = mModleList;

    }

    @Override
    public int getCount() {
        return mModleList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder mViewHolder;
        if (view == null) {
            mViewHolder = new ViewHolder();
            view = LayoutInflater.from(context.getApplicationContext())
                    .inflate(R.layout.adapter_lv_classificationdetails, null);
            mViewHolder.mTextView = (TextView) view.findViewById(R.id.adapter_lv_classificationdetails_name_tv);
            view.setTag(mViewHolder);
        }else{
            mViewHolder = (ViewHolder) view.getTag();
        }
        mViewHolder.mTextView.setText(mModleList.get(i));
        return view;
    }

    public class ViewHolder {
        TextView mTextView;
    }
}
