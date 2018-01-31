package com.example.kazukoba.csvimportlistviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CsvReader parser = new CsvReader();
        parser.reader(getApplicationContext());
        ListViewAdapter listViewAdapter = new ListViewAdapter(this, 0, parser.objects);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(listViewAdapter);
    }
}
