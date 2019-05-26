package com.shaitco.gridtest;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private int[] numberWord;
    private int[] numberImage;

    public MainAdapter(Context c, int[] numberWord, int[] numberImage){

        context=c;
        this.numberWord=numberWord;
        this.numberImage=numberImage;
    }

    @Override
    public int getCount() {
        return numberWord.length;
    }



    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater==null){
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }
        if (convertView==null){
            convertView=inflater.inflate(R.layout.row_item,null);
        }
        ImageView imageView=convertView.findViewById(R.id.image_view);

        imageView.setImageResource(numberImage[position]);

        return convertView;
    }
}
