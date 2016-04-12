package org.chzz.update.demo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.chzz.update.UpdateHelper;
import org.chzz.update.pojo.UpdateInfo;

public class MainActivity extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UpdateInfo u = new UpdateInfo();
        u.setAppName("FED41B7BB13E380592D3404CC6D4D085");
        u.setApkUrl("http://183.56.150.166/dd.myapp.com/16891/FED41B7BB13E380592D3404CC6D4D085.apk");
        u.setUpdateTips("更新提示");
        u.setChangeLog("1.修复内容");
        u.setVersionCode("2");

        UpdateHelper updateHelper = new UpdateHelper.Builder(this)
                .isAutoInstall(true) //设置为false需在下载完手动点击安装;默认值为true，下载后自动安装。
                .build();

        updateHelper.check(u,true);

    }

}
