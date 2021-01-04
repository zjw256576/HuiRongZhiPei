package com.yunxuan.huirongzhipei;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class IndexActivity extends AppCompatActivity {
    private ImageView iv_message;
    private LinearLayout ll_tonggao;
    private ImageView iv_match;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        initView();
    }

    private void initView() {
        iv_message=findViewById(R.id.iv_message);
        ll_tonggao=findViewById(R.id.ll_tonggao);
        iv_match=findViewById(R.id.iv_match);
        iv_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndexActivity.this,MessageActivity.class);
                startActivity(intent);
            }
        });
        ll_tonggao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IndexActivity.this,SystemNoticeActivity.class);
                startActivity(intent);
            }
        });
        iv_match.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupWindow popupWindow=new PopupWindow();
            }
        });
    }
}
