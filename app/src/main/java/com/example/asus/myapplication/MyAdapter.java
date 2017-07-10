package com.example.asus.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 冯玉苗 on 2017/7/6.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Student> list;
    public MyAdapter(Context context, ArrayList<Student> list){
        this.context=context;
        this.list=list;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHodler hodler;
        if(convertView==null){
            hodler=new MyViewHodler();
            convertView=View.inflate(context,R.layout.mitem,null);

            hodler.mtitle= (TextView) convertView.findViewById(R.id.mtitle);
            hodler.mcontent= (TextView) convertView.findViewById(R.id.mcontent);
            convertView.setTag(hodler);
        }else{
            hodler= (MyViewHodler) convertView.getTag();
        }

        Student student = list.get(position);
        hodler.mtitle.setText(student.getName());
        hodler.mcontent.setText(student.getContent());

        return convertView;
    }

    static class MyViewHodler{
        TextView mtitle;
        TextView mcontent;
    }
}