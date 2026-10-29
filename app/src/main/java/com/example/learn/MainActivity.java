package com.example.learn;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.carousel.Arrangement;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList <Item> items;
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        items = new ArrayList<Item>();
        Item item1 = new Item ("aa", "aaaaaa", 1);
        items.add(item1);
        Item item2 = new Item ("bb", "bbbbbb", 2);
        items.add(item2);
        Item item3 = new Item ("cc", "cccccc", 3);
        items.add(item3);
        Item item4 = new Item ("dd", "dddddd", 4);
        items.add(item4);
        Item item5 = new Item ("ee", "eeeeee", 5);
        items.add(item5);
        Item item6 = new Item ("ee", "eeeeee", 6);
        items.add(item6);

        recyclerView = findViewById(R.id.recycler);
        MyAdapter adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}