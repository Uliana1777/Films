package com.example.uliana.filmlist;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

import static android.support.v4.content.ContextCompat.startActivity;

public class FilmsAdapter extends RecyclerView.Adapter<FilmsAdapter.ViewHolder> {
   List<Film> listFilm;
   Context context;

    public FilmsAdapter(List<Film> listFilm) {
        this.listFilm = listFilm;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View filmsView = layoutInflater.inflate(R.layout.item_contact, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(filmsView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
// получаем информацию о филме
         final Film film = listFilm.get(i);


        // прицепляем вьюшкам значения
        TextView textView1 = viewHolder.textViewTitle;
        textView1.setText(film.getFilmTitle());
        TextView textView2 = viewHolder.textViewGenre;
        textView2.setText(film.getGenre());
        TextView textView3 = viewHolder. textViewYear;
        textView3.setText(film.getFilmYear());
        final ImageView imageView1 = viewHolder.filmPoster;
        imageView1.setImageResource(film.getPosterId());
        CardView cardView1 = viewHolder.filmCard;



        cardView1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                listFilm.remove(i);
                notifyItemRemoved(i);
                notifyItemChanged(i);
                return false;
            }
        });

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), TapActivity.class);
                intent.setAction(Intent.ACTION_SEND_MULTIPLE);
                intent.putExtra("filmObj", film);
               v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFilm.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewTitle;
        public TextView textViewGenre;
        public TextView textViewYear;
        public ImageView filmPoster;
        public CardView filmCard;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewGenre = itemView.findViewById(R.id.textViewGenre);
            textViewYear = itemView.findViewById(R.id.textViewYear);
            filmPoster = itemView.findViewById(R.id.filmPoster);
            filmCard = itemView.findViewById(R.id.filmCard);
        }
    }
}
