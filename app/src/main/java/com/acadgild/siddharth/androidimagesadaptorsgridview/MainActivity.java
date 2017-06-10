package com.acadgild.siddharth.androidimagesadaptorsgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView mlv;
    private ArrayList<Integer> min;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlv = (GridView) findViewById(R.id.lv_view);

        min = new ArrayList<>();
        min.add(R.drawable.gingerbread);
        min.add(R.drawable.honeycomb);
        min.add(R.drawable.androidjellybean);
        min.add(R.drawable.androidkitkat);
        min.add(R.drawable.icecreamsandwich);
        min.add(R.drawable.lollipop);

        mlv.setAdapter(new MyAdapter());
    }
    class MyAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return min.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = getLayoutInflater().inflate(R.layout.view,viewGroup,false);
            ImageView iv = (ImageView)v.findViewById(R.id.iv);
            iv.setImageResource(min.get(i));
            return v;
        }
    }
}
