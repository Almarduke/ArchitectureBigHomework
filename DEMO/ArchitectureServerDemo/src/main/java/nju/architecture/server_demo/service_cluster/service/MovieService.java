package nju.architecture.server_demo.service_cluster.service;

import nju.architecture.server_demo.database_cluster.entity.Movie;

import java.util.List;

public interface MovieService {

    long addMovie(Movie movie);

    boolean editMovieInfo(Movie movie);

    List<Movie> getAllMovies();

    List<Movie> getMovieList(String keyword);
}
