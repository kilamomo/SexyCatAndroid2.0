package sexycat.android.com.sexycatandroid20.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

import sexycat.android.com.sexycatandroid20.R;
import sexycat.android.com.sexycatandroid20.activity.ClassificationDetailsListActivity;
import sexycat.android.com.sexycatandroid20.activity.GoodDetailsActivity;
import sexycat.android.com.sexycatandroid20.adapter.SearchClassificationGVAdapter;

/**
 * Created by liukai on 2015/1/27.
 */
public class SearchClassificationDialog extends Dialog {
    private GridView mClassificationGridView;
    private ArrayList<String> nameLists;
    private SearchClassificationGVAdapter mSearchClassificationGVAdapter;
    public SearchClassificationDialog(Context context) {
        super(context);
    }

    public SearchClassificationDialog(Context context, int theme) {
        super(context, theme);
    }

    protected SearchClassificationDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dialog_searchclassification);
        init();
    }

    public void init() {
        initModle();
        //返回按钮
        Button mBack = (Button) findViewById(R.id.activity_main_dialog_searchclassification_back_bt);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SearchClassificationDialog.this.dismiss();
            }
        });
        //键入按钮
        TextView mhotspot = (TextView) findViewById(R.id.activity_main_dialog_searchclassification_hotspot_tv);
        mhotspot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getContext(), ClassificationDetailsListActivity.class);
                getContext().startActivity(intent);
            }
        });
        //GridView
        mClassificationGridView=(GridView)findViewById(R.id.activity_main_dialog_searchclassification_gv);
        mSearchClassificationGVAdapter=new SearchClassificationGVAdapter(getContext(),nameLists);
        mClassificationGridView.setAdapter(mSearchClassificationGVAdapter);
        mClassificationGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(getContext(),ClassificationDetailsListActivity.class);
                getContext().startActivity(intent);
//                SearchClassificationDialog.this.dismiss();
            }
        });
    }
    /*测试例子*/
    public void initModle() {
        nameLists = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            nameLists.add("Item: " + i);
        }
    }
}
