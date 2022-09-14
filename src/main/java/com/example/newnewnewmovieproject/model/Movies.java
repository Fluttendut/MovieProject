package com.example.newnewnewmovieproject.model;

public class Movies {
    //Year;Length;Title;Subject;Popularity;Awards
    private String year;
    private String length;
    private String title;
    private String subject;
    private String popularity;
    private String awards;

    public Movies(String year, String length, String title, String subject, String popularity, String awards) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.awards = awards;
    }
}
