package com.example.asus.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Main22Activity extends AppCompatActivity {
    private TextView mnumber;
    private ViewPager viewPager;
    private MyViewpage myViewpage;
    private ArrayList<Fragment> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        viewPager= (ViewPager) findViewById(R.id.mviewpage);
        mnumber= (TextView) findViewById(R.id.mnumber);
        for(int i=0;i<10;i++) {
            list.add(new Fragmentone());

            myViewpage = new MyViewpage(getSupportFragmentManager(), list);
            viewPager.setAdapter(myViewpage);
            if(i==0){
                mnumber.setText("1");
            }

        }
    }
}
