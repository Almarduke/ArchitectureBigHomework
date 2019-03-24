package nju.architecture.server_demo.database_cluster.dao;


import nju.architecture.server_demo.database_cluster.entity.Movie;

import java.util.List;

public interface MovieDao {

    Movie getMovieById(long id);

    boolean createMovie(Movie movie);

    boolean updateMovie(Movie movie);

    boolean deleteMovie(Movie movie);

    List<Movie> searchMovies(String keyword);
}
