package nju.architecture.server_demo.api_gateway.controllers;

import nju.architecture.server_demo.api_gateway.RPCProxy;
import nju.architecture.server_demo.database_cluster.entity.Cinema;
import nju.architecture.server_demo.database_cluster.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class CinemaController {

    private RPCProxy proxy;

    @PostMapping(value = "/addCinema")
    public long addCinema(@RequestParam Cinema cinema) {
        return 1232324345L;
    }

    @PutMapping(value = "/editCinemaInfo")
    public boolean editCinemaInfo(@RequestParam Cinema cinema) {
        return true;
    }

    @GetMapping(value = "/getAllCinemas")
    public List<Cinema> getAllCinemas() {
        return new ArrayList<>();
    }

    @GetMapping(value = "/getCinemaList")
    public List<Cinema> getCinemaList(@RequestParam Movie movie) {
        return new ArrayList<>();
    }
}
