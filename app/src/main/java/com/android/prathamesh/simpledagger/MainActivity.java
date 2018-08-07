package com.android.prathamesh.simpledagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject MyExample myExample;

    TextView dateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateTextView = (TextView)findViewById(R.id.tvDate);
        ((MyApplication)getApplication()).getMyComponent().inject(MainActivity.this);
//        MyExample myExample = MyExample.getInstance();
        dateTextView.setText((new Date(myExample.getDate())).toString());
    }
}
