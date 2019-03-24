package nju.architecture.server_demo.database_cluster.dao.impl;

import nju.architecture.server_demo.database_cluster.dao.CinemaDao;
import nju.architecture.server_demo.database_cluster.entity.Cinema;

import java.util.List;

public class CinemaDaoImpl implements CinemaDao {
    @Override
    public Cinema getCinemaById(long id) {
        return null;
    }

    @Override
    public boolean createCinema(Cinema cinema) {
        return false;
    }

    @Override
    public boolean updateCinema(Cinema cinema) {
        return false;
    }

    @Override
    public boolean deleteCinema(Cinema cinema) {
        return false;
    }

    @Override
    public List<Cinema> searchCinemas(String keyword) {
        return null;
    }

    @Override
    public List<String> getSeatsByMovieId(long movieId) {
        return null;
    }
}
