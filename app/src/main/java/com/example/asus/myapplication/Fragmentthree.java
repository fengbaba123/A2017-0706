package com.example.asus.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by 冯玉苗 on 2017/7/6.
 */

public class Fragmentthree extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getContext(),R.layout.fragthr,null);
        ImageView imageView= (ImageView) view.findViewById(R.id.fragthree);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),Main22Activity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
