package com.uay.components;

import com.uay.beans.Movie;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MovieService {
    public Movie generateMovie() {
        Movie movie = new Movie();
        movie.setDirector("Quentin Tarantino");
        movie.setTitle("Reservoir Dogs");
        movie.setStars(5);
        movie.setProducer("Lawrence Bender");
        movie.setActors(Arrays.asList("Harvey Keitel", "Tim Roth", "Steve Buscemi", "Michael Madson"));
        return movie;
    }
}
