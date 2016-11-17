package com.example.robin.drawer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends Activity {

    public static Intent newIntent(Context context){
        Intent i = new Intent(context, ListActivity.class);
        return i;
    }

    String[] noms_onglets= new String[] {"ABC", "DEF", "GHI"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listview= (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, noms_onglets);
        listview.setAdapter(adapter);
    }
}