package com.jetpack.databind;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.jetpack.R;
import com.jetpack.databinding.ActivityDataBindSampleBinding;
/**
 * @Description: java类作用描述
 * @Author: zhouguizhi
 * @CreateDate: 2021/8/2 下午9:58
 * @Version: 1.0
 */
public class DataBindSampleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDataBindSampleBinding activityDataBindSampleBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_bind_sample);
        final User user = new User("zhou",18);
        //绑定数据 才会在布局文件中使用表达式@{}数据才显示
        activityDataBindSampleBinding.setUser(user);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                user.firstName.set("我改变了");
            }
        },2000);
        UserEntity userEntity = new UserEntity();
        activityDataBindSampleBinding.setUserEntity(userEntity);
//        userEntity.setName("Android开发者");
    }
}
