package nju.architecture.server_demo.service_cluster.service.impl;

import nju.architecture.server_demo.database_cluster.entity.Cinema;
import nju.architecture.server_demo.database_cluster.entity.Movie;
import nju.architecture.server_demo.external_interface.ExternalInterface;
import nju.architecture.server_demo.service_cluster.ConcreteServiceImpl;
import nju.architecture.server_demo.service_cluster.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl extends ConcreteServiceImpl implements CinemaService {

    @Autowired
    private ExternalInterface cinemaInfoManager;

    @Override
    public long addCinema(Cinema cinema) {
        return 0;
    }

    @Override
    public boolean editCinemaInfo(Cinema cinema) {
        return false;
    }

    @Override
    public List<Cinema> getAllCinemas() {
        return null;
    }

    @Override
    public List<Cinema> getCinemaList(Movie movie) {
        return null;
    }
}
