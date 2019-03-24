package nju.architecture.server_demo.database_cluster.dao.impl;

import nju.architecture.server_demo.database_cluster.dao.MovieDao;
import nju.architecture.server_demo.database_cluster.entity.Movie;

import java.util.List;

public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie getMovieById(long id) {
        return null;
    }

    @Override
    public boolean createMovie(Movie movie) {
        return false;
    }

    @Override
    public boolean updateMovie(Movie movie) {
        return false;
    }

    @Override
    public boolean deleteMovie(Movie movie) {
        return false;
    }

    @Override
    public List<Movie> searchMovies(String keyword) {
        return null;
    }
}
