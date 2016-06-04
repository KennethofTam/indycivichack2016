package com.example.kenny.indycivichack2016;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Kenny on 6/4/2016.
 */
public class HomePageActivity extends Activity {
    String[] testArray = {"1","2", "3", "4"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        ArrayAdapter testAdapter = new ArrayAdapter(this, R.layout.activity_listview, testArray);

        ListView testListView = (ListView) findViewById(R.id.listView);
        testListView.setAdapter(testAdapter);
    }
}
