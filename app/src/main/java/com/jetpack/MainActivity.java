package com.jetpack;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jetpack.databind.DataBindSampleActivity;
import com.jetpack.viewbind.ViewBindSampleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void jumpToViewBind(View view) {
        startActivity(new Intent(this, ViewBindSampleActivity.class));
    }

    public void jumpToDataBind(View view) {
        startActivity(new Intent(this, DataBindSampleActivity.class));
    }
}