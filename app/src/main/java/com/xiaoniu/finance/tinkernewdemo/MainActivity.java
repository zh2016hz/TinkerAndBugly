package com.xiaoniu.finance.tinkernewdemo;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;

public class MainActivity extends AppCompatActivity {

    private TextView mText;
    private Button mClick;
    private Button mClicks;
    private Button mClickss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = (TextView) findViewById(R.id.text_show);
        mClick = (Button) findViewById(R.id.click);
        mClicks = (Button) findViewById(R.id.clicks);
        mClickss = (Button) findViewById(R.id.clicksss);

        mClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mText.setText("我是zhouyuhan!!!");
                mText.setText("我是来自贵州平困山区的蒙二娃同学!!!");
                Toast.makeText(getApplicationContext(), "婆婆包  mmmmmmmmmmm", Toast.LENGTH_SHORT).show();
            }
        });mClicks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(),
                        Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed_7zip.apk");
            }
        });mClickss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShareTinkerInternals.killAllOtherProcess(getApplicationContext());
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }
}
