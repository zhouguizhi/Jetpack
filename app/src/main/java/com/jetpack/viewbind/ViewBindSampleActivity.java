package com.jetpack.viewbind;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.jetpack.databinding.ActivityViewBindSampleBinding;
/**
 * @Description: view bind学习
 * @Author: zhouguizhi
 * @CreateDate: 2021/8/2 下午2:15
 * @Version: 1.0
 */
public class ViewBindSampleActivity extends AppCompatActivity {
    private ActivityViewBindSampleBinding activityViewBindSampleBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityViewBindSampleBinding = ActivityViewBindSampleBinding.inflate(getLayoutInflater());
        setContentView(activityViewBindSampleBinding.getRoot());
    }

    public void onLogin(View view) {
        String userName = activityViewBindSampleBinding.activityViewBindSampleEtUserName.getText().toString();
        String pwd = activityViewBindSampleBinding.activityViewBindSampleEtPwd.getText().toString();
        if(TextUtils.isEmpty(userName)){
            Toast.makeText(this,"请输入用户名",Toast.LENGTH_SHORT).show();
        }
        if(TextUtils.isEmpty(pwd)){
            Toast.makeText(this,"请输入密码",Toast.LENGTH_SHORT).show();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(ViewBindSampleActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
            }
        },1500);
    }
}
