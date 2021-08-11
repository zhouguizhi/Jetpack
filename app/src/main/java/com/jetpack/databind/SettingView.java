package com.jetpack.databind;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.jetpack.R;
import com.jetpack.databinding.LayoutSettingViewBinding;
/**
 * @Description: java类作用描述
 * @Author: zhouguizhi
 * @CreateDate: 2021/8/3 上午12:18
 * @Version: 1.0
 */
public class SettingView extends LinearLayout {
    public SettingView(Context context) {
        this(context,null);
    }
    public SettingView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SettingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflateView(context);

    }
    public void inflateView(Context context){
        if(null==context){
            return;
        }
        LayoutSettingViewBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.layout_setting_view,this,false);
        binding.setTitle("jsjs");
    }
}
