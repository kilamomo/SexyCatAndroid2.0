package sexycat.android.com.sexycatandroid20.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import sexycat.android.com.sexycatandroid20.R;
import sexycat.android.com.sexycatandroid20.adapter.ClassificationDetailsLVAdapter;
import sexycat.android.com.sexycatandroid20.dialog.SearchClassificationDialog;

/**
 * Created by liukai on 2015/1/26.
 */
public class ClassificationDetailsListActivity extends BaseActivity {
    private ListView mClassificationDetailsLV;
    private ClassificationDetailsLVAdapter mClassificationDetailsLVAdapter;
    private ArrayList<String> nameLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classificationdetailslist);
        init();
    }
/*初始化界面*/
    private void init() {
        initModle();
        //
        Button mBackBT=(Button)findViewById(R.id.activity_classificationdetailslist_back_bt);
        mBackBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              ClassificationDetailsListActivity.this.finish();

            }
        });
        //
        mClassificationDetailsLV = (ListView) findViewById(R.id.activity_classificationdetailslist_lv);
        mClassificationDetailsLVAdapter = new ClassificationDetailsLVAdapter(ClassificationDetailsListActivity.this, nameLists);
        mClassificationDetailsLV.setAdapter(mClassificationDetailsLVAdapter);
        mClassificationDetailsLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(ClassificationDetailsListActivity.this,GoodDetailsActivity.class);
                startActivity(intent);
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
