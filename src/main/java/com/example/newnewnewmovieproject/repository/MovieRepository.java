package com.example.newnewnewmovieproject.repository;

import com.example.newnewnewmovieproject.model.Movies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieRepository {

    ArrayList<Movies> movieList = new ArrayList<Movies>();

    private void populateList(){
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\ded_1\\Documents\\Java 2022\\SpringMovieDatabase\\NewNewNewMovieProject\\src\\main\\java\\com\\example\\newnewnewmovieproject\\repository\\movie.csv"));
            scanner.useDelimiter(";|\n");
            while (scanner.hasNext()){
                //Year;Length;Title;Subject;Popularity;Awards
                String year = scanner.next();
                String length = scanner.next();
                String title = scanner.next();
                String subject = scanner.next();
                String popularity = scanner.next();
                String awards = scanner.next();
                movieList.add(new Movies(year, length, title, subject, popularity, awards));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public MovieRepository() {
        populateList();
    }
}
