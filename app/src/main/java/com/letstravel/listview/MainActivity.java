package com.letstravel.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
private ListView listView;

public static final String Countries[]={

        "Nepal","Kathamandu",
        "Japan","Tokyo",
        "India","New Delhi",
        "Chiana","Bejing",
        "USA","California",
};
private Map<String, String> country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listview1);


        country=new HashMap<>();
        for(int i=0;i<Countries.length;i+=2){
            country.put(Countries[i], Countries[i+1]);
        }


        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,new ArrayList<String>(country.keySet()));
        listView.setAdapter(arrayAdapter1);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String cont=parent.getItemAtPosition(position).toString();
                String capital=country.get(cont);
              //  Toast.makeText(MainActivity.this, "Capital of" +cont+ "is :"+capital, Toast.LENGTH_SHORT).show();


            }
        });
    }
}
