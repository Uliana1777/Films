package com.example.uliana.filmlist;

import java.io.Serializable;

public class Film implements Serializable {
    private String filmTitle;
    private String genre;
    private String filmYear;
    private Integer posterId;
  public Film (String filmTitle,String genre, String filmYear , int posterId)  {
      this.filmTitle = filmTitle;
      this.genre = genre;
      this.filmYear = filmYear;
      this.posterId = posterId;
  }

    public int getPosterId() {
        return posterId;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFilmYear() {
        return filmYear;
    }

    public void setFilmYear(String filmYear) {
        this.filmYear = filmYear;
    }
}
