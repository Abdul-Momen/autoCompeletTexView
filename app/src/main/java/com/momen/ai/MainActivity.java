package com.momen.ai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private AutoCompleteTextView autoCompleteTextView;
  private  String [] naame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        naame=getResources().getStringArray(R.array.name);

        autoCompleteTextView=findViewById(R.id.autoTV);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,naame);

        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=autoCompleteTextView.getText().toString();
                Toast.makeText(getApplicationContext(), "Roll: 3"+position, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
