package com.leewug.src.diff.test;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.leewug.src.diff.DiffUtils;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("_---------", "onCreate: ");
        setContentView(R.layout.activity_main);
        long start = System.currentTimeMillis();
        File oldApkPath = new File(Environment.getExternalStorageDirectory(), "oldApk.apk");
        File newApkPath = new File(Environment.getExternalStorageDirectory(), "newApk.apk");
        File patchFile = new File(Environment.getExternalStorageDirectory(), "patch.patch");
        int ret = DiffUtils.patch(oldApkPath.getAbsolutePath(), newApkPath.getAbsolutePath(), patchFile.getAbsolutePath());
        long diff = System.currentTimeMillis() - start;
        Toast.makeText(getApplicationContext(), "apk合并完成" + diff, 0).show();
        Log.e("----------", "apk合并完成" + diff);
    }
}
