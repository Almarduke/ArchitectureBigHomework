package nju.architecture.server_demo.database_cluster.dao;

import nju.architecture.server_demo.database_cluster.entity.Cinema;

import java.util.List;

public interface CinemaDao {

    Cinema getCinemaById(long id);

    boolean createCinema(Cinema cinema);

    boolean updateCinema(Cinema cinema);

    boolean deleteCinema(Cinema cinema);

    List<Cinema> searchCinemas(String keyword);

    List<String> getSeatsByMovieId(long movieId);
}
