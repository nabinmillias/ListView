package com.example.hp.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mob=(ListView)findViewById(R.id.list);
        ArrayList<String>mobiles=new ArrayList<>();
        ArrayAdapter<String>adapt=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,mobiles);
        mobiles.add("Samsung");
        mobiles.add("Htc");
        mobiles.add("Moto");
        mobiles.add("Iphone");
        mob.setAdapter(adapt);
        mob.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String itemvalue= (String) mob.getItemAtPosition(position);

                if (itemvalue=="Samsung")
                {
                    Toast.makeText(MainActivity.this, "Samsung", Toast.LENGTH_SHORT).show();
                }
                else if (itemvalue=="Htc"){
                    Toast.makeText(MainActivity.this, "Htc", Toast.LENGTH_SHORT).show();
                }
                else if (itemvalue=="Moto"){
                    Toast.makeText(MainActivity.this, "Moto", Toast.LENGTH_SHORT).show();
                }
                else if (itemvalue=="Iphone"){
                    Toast.makeText(MainActivity.this, "Iphone", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
