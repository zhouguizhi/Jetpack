package com.jetpack.databind;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
/**
 * @Description: java类作用描述
 * @Author: zhouguizhi
 * @CreateDate: 2021/8/3 下午4:09
 * @Version: 1.0
 */
public class CustomBindingAdapter {
    @BindingAdapter("android:paddingLeft")
    public static void setPaddingLeft(View view, int padding) {
        view.setPadding(padding,
                view.getPaddingTop(),
                view.getPaddingRight(),
                view.getPaddingBottom());
    }
    @BindingAdapter({"imageUrl", "error"})
    public static void loadImage(ImageView view, String url, Drawable error) {
//        Picasso.get().load(url).error(error).into(view);
    }
}
