package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
   RecyclerView r ;
   String[] titre ;
   String[] soust ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r=findViewById(R.id.RV);
        titre=getResources().getStringArray(R.array.titre);
        soust=getResources().getStringArray(R.array.stitre);
        Integer[] img = {R.drawable.home, R.drawable.search,R.drawable.home,R.drawable.search };
        ListeAdaptateur ad ;
        ad = new ListeAdaptateur(MainActivity.this,titre,soust,img);
        r.setLayoutManager(new LinearLayoutManager(this));
        r.setAdapter(ad);
    }
}