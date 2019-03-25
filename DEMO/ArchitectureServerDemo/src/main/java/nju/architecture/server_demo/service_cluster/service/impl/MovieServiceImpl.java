package nju.architecture.server_demo.service_cluster.service.impl;

import nju.architecture.server_demo.database_cluster.entity.Movie;
import nju.architecture.server_demo.service_cluster.ConcreteServiceImpl;
import nju.architecture.server_demo.service_cluster.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl extends ConcreteServiceImpl implements MovieService {
    @Override
    public long addMovie(Movie movie) {
        return 0;
    }

    @Override
    public boolean editMovieInfo(Movie movie) {
        return false;
    }

    @Override
    public List<Movie> getAllMovies() {
        return null;
    }

    @Override
    public List<Movie> getMovieList(String keyword) {
        return null;
    }
}
