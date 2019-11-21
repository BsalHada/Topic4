package com.example.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
public static String countries[]={
        "Nepal",
        "India",
        "China",
        "US",
        "Canada"
};
private Map<String,String>dictionary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lstCountries =findViewById(R.id.lstCountires);

        ArrayAdapter countryAdapters = new ArrayAdapter(this,android.R.layout.simple_list_item_1,countries);
        lstCountries.setAdapter(countryAdapters);


        dictionary= new HashMap<>();
        for(int i=0; i<countries.length;i+=2){dictionary.put(countries[i],countries[i+1]);}

        ArrayAdapter countryAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, new ArrayList<String>(dictionary.keySet()));
        lstCountries.setAdapter(countryAdapter);






    }
}
