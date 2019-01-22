package com.example.uliana.filmlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TapActivity extends AppCompatActivity {
Film film;
ImageView imageView;
TextView filmTitle;
TextView filmGenre;
TextView filmYEAR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap);

        film = (Film) getIntent().getSerializableExtra("filmObj");

        imageView = findViewById(R.id.filmPoster);
        filmTitle = findViewById(R.id.textViewTitle);
        filmGenre= findViewById(R.id.textViewGenre);
        filmYEAR = findViewById(R.id.textViewYear);



        imageView.setImageResource(film.getPosterId());
        filmTitle.setText(film.getFilmTitle());
        filmGenre.setText(film.getGenre());
        filmYEAR.setText(film.getFilmYear());
    }
}
