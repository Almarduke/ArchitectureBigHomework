package nju.architecture.server_demo.service_cluster.service;

import nju.architecture.server_demo.database_cluster.entity.Cinema;
import nju.architecture.server_demo.database_cluster.entity.Movie;

import java.util.List;

public interface CinemaService {

    long addCinema(Cinema cinema);

    boolean editCinemaInfo(Cinema cinema);

    List<Cinema> getAllCinemas();

    List<Cinema> getCinemaList(Movie movie);
}
