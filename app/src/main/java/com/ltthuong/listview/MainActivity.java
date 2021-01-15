package com.ltthuong.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ListView lstViewHoa;
    public ArrayList<String> arrayList;
    public ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstViewHoa = (ListView) findViewById(R.id.lstView);
        arrayList = new ArrayList<>();
        arrayList.add("1 - Hoa Tulip");
        arrayList.add("2 - Hoa Hồng");
        arrayList.add("3 - Hoa Violet");
        arrayList.add("4 - Hoa Oải hương");
        arrayList.add("5 - Hoa Uất kim hương");
        arrayList.add("6 - Hoa Ngọc lan tây");
        arrayList.add("7 - Hoa Linh lan");
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        lstViewHoa.setAdapter(arrayAdapter);
    }
}