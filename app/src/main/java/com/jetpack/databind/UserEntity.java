package com.jetpack.databind;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import com.jetpack.BR;
/**
 * @Description: java类作用描述
 * @Author: zhouguizhi
 * @CreateDate: 2021/8/3 上午12:56
 * @Version: 1.0
 */
public class UserEntity extends BaseObservable {
    private String  name = "default";
    private int age;
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
