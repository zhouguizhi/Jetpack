package com.jetpack.databind;
import androidx.databinding.ObservableField;
/**
 * @Description: java类作用描述
 * @Author: zhouguizhi
 * @CreateDate: 2021/8/2 下午10:01
 * @Version: 1.0
 */
public class User {
    public final ObservableField<String> firstName = new ObservableField<>("我是firstName字段");
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
