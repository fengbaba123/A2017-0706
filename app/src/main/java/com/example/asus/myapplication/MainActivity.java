package com.example.asus.myapplication;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private MyAdapter myListView;
    private ArrayList<Student> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initView();
        initData();
    }

    private void initData() {
        MyDatabase myDatabase=new MyDatabase(this,"sqp.db",null,1);
        SQLiteDatabase writableDatabase = myDatabase.getWritableDatabase();
        for(int i=0;i<10;i++){
            ContentValues contchValus=new ContentValues();
            contchValus.put("name","新闻"+i);
            contchValus.put("content","新闻内容！"+i);
            writableDatabase.insert("user",null,contchValus);

        }
        Cursor user = writableDatabase.query("user", null, null, null, null, null, null);
        while (user.moveToNext()){
            Student student=new Student();
            student.setName(user.getString(0));
            student.setContent(user.getString(1));
            list.add(student);
        }


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",list.get(i).getName());
                intent.putExtra("content",list.get(i).getContent());
                startActivity(intent);
            }
        });
    }

    private void initView() {

        lv= (ListView) findViewById(R.id.lv);
        myListView=new MyAdapter(MainActivity.this,list);
        lv.setAdapter(myListView);
    }
}
