package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.panxw.android.imageindicator.AutoPlayManager;
import com.panxw.android.imageindicator.ImageIndicatorView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private TextView mname,mcontent;
    private ViewPager viewPager;
    private MyViewpage myViewpage;
    private ArrayList<Fragment> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        viewPager= (ViewPager) findViewById(R.id.view_page);

        list.add(new Fragmentone());
        list.add(new Fragmenttwo());
        list.add(new Fragmentthree());
        myViewpage=new MyViewpage(getSupportFragmentManager(),list);
        viewPager.setAdapter(myViewpage);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String content = intent.getStringExtra("content");


        mname= (TextView) findViewById(R.id.mname);
        mcontent= (TextView) findViewById(R.id.mcontent);

        mname.setText(name);
        mcontent.setText(content);

    }




}
