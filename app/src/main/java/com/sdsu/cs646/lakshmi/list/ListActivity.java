package com.sdsu.cs646.lakshmi.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity
{
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","Max OS X"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.adaptor, mobileArray);

        ListView listView = ( ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }
}
