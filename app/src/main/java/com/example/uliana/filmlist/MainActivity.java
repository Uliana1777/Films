package com.example.uliana.filmlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList <Film> filmsArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        RecyclerView recyclerViewFilms = findViewById(R.id.recyclerView1);

        filmsArray = new ArrayList<>();
        filmsArray.add(new Film("Titanic", "Drama","1997", R.drawable.titanicposter));
        filmsArray.add(new Film("Donnie Darko", "Fantasy","2001", R.drawable.donniedarkoposter));
        filmsArray.add(new Film("Non-Stop", "Thriller","2014", R.drawable.nonstopposter));
        filmsArray.add(new Film("What We Do in the Shadows", "Comedy","2014", R.drawable.whatwedointheshadowsposter));
        filmsArray.add(new Film("10 Things I Hate About You", "Melodrama","1999",R.drawable.tenthingsihateaboutyouposter));
        filmsArray.add(new Film("Passengers", "Fantasy","2016",R.drawable.passengersposter));
        filmsArray.add(new Film("Pulp Fiction","Thriller","1994",R.drawable.pulpfictionposter));
        filmsArray.add(new Film("Interstellar","Fantasy","2014",R.drawable.interstellarposter));



        FilmsAdapter filmsAdapter = new FilmsAdapter(filmsArray);
        recyclerViewFilms.setAdapter(filmsAdapter);
        recyclerViewFilms.setLayoutManager(new LinearLayoutManager(this));
    }
}
