package com.gxy.gxypermisson;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.gxy.permissonlib.PermissionUtils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        checkCameraPermission();
    }

    private void checkCameraPermission() {
        PermissionUtils.getInstance().request(this,
                PermissionUtils.Type.CAMERA, new PermissionUtils.Callback() {
                    @Override
                    public void onResult(boolean grant) {

                        Log.e("grant","="+grant);
                        if (grant) {
                           //继续授权下一个权限
                        } else {
                           //跳转
                        }
                    }
                });
    }
}
