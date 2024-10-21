package com.example.seance4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Animal> AnimalList;
    ListView maListe;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        maListe = findViewById(R.id.listView);

        AnimalList = new ArrayList<Animal>();
        AnimalList.add(new Animal(R.drawable.a, "exemple de nom1", "exemple de description1"));
        AnimalList.add(new Animal(R.drawable.b, "exemple de nom2", "exemple de description2"));
        AnimalList.add(new Animal(R.drawable.c, "exemple de nom3", "exemple de description3"));
        AnimalList.add(new Animal(R.drawable.d, "exemple de nom4", "exemple de description4"));
        AnimalList.add(new Animal(R.drawable.e, "exemple de nom5", "exemple de description5"));
        AnimalList.add(new Animal(R.drawable.a, "exemple de nom1", "exemple de description1"));
        AnimalList.add(new Animal(R.drawable.b, "exemple de nom2", "exemple de description2"));
        AnimalList.add(new Animal(R.drawable.c, "exemple de nom3", "exemple de description3"));
        AnimalList.add(new Animal(R.drawable.d, "exemple de nom4", "exemple de description4"));
        AnimalList.add(new Animal(R.drawable.e, "exemple de nom5", "exemple de description5"));
        AnimalList.add(new Animal(R.drawable.f, "exemple de nom5", "exemple de description5"));
        AnimalList.add(new Animal(R.drawable.a, "exemple de nom1", "exemple de description1"));
        AnimalList.add(new Animal(R.drawable.b, "exemple de nom2", "exemple de description2"));
        AnimalList.add(new Animal(R.drawable.c, "exemple de nom3", "exemple de description3"));
        AnimalList.add(new Animal(R.drawable.d, "exemple de nom4", "exemple de description4"));
        AnimalList.add(new Animal(R.drawable.e, "exemple de nom5", "exemple de description5"));
        AnimalList.add(new Animal(R.drawable.a, "exemple de nom1", "exemple de description1"));
        AnimalList.add(new Animal(R.drawable.b, "exemple de nom2", "exemple de description2"));
        AnimalList.add(new Animal(R.drawable.c, "exemple de nom3", "exemple de description3"));
        AnimalList.add(new Animal(R.drawable.d, "exemple de nom4", "exemple de description4"));
        AnimalList.add(new Animal(R.drawable.e, "exemple de nom5", "exemple de description5"));
        AnimalList.add(new Animal(R.drawable.f, "exemple de nom5", "exemple de description5"));

        adapter = new CustomAdapter(getApplicationContext(), AnimalList);
        maListe.setAdapter(adapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}