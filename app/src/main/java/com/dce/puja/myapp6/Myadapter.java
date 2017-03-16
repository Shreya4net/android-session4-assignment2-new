package com.dce.puja.myapp6;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Devendra on 3/15/2017.
 */

public class Myadapter extends BaseAdapter {
    ArrayList<Person>list;
    LayoutInflater layoutInflater;
    private String TAG =Myadapter.class.getSimpleName();
    public Myadapter(Context context, ArrayList<Person> list)
    {
        this.list=list;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        return list.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Person person= (Person) getItem(position);
        Log.i(TAG,"get view" +position);
        View view= layoutInflater.inflate(R.layout.person_layout,null);
       TextView tvname=(TextView) view.findViewById(R.id.tvname);
        TextView tvcity=(TextView) view.findViewById(R.id.tvcity);
        TextView tvphone=(TextView) view.findViewById(R.id.tvphone);
        tvname.setText(person.getName());
        tvcity.setText(person.getCity());
        tvphone.setText(String.valueOf(person.getPhoneno()));
        return view;
    }
}
