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
public class SearchClassificationGVAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<String> mClassNames;
    public SearchClassificationGVAdapter(Context context,ArrayList<String> mClassNames){
        this.context=context;
        this.mClassNames=mClassNames;
    }
    @Override
    public int getCount() {
        return mClassNames.size();
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
                    .inflate(R.layout.adapter_gv_searchclassification, null);
            mViewHolder.mTextView = (TextView) view.findViewById(R.id.adapter_gv_searchclassification_name_tv);
            view.setTag(mViewHolder);
        }else{
            mViewHolder = (ViewHolder) view.getTag();
        }
        mViewHolder.mTextView.setText(mClassNames.get(i));
        return view;
    }
    public class ViewHolder {
        TextView mTextView;
    }
}
