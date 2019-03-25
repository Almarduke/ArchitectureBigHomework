package nju.architecture.server_demo.api_gateway.controllers;

import nju.architecture.server_demo.api_gateway.RPCProxy;
import nju.architecture.server_demo.database_cluster.entity.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private RPCProxy proxy;

    @PostMapping(value = "/addMovie")
    public long addMovie(@RequestParam Movie movie) {
        return 1232324345L;
    }

    @PutMapping(value = "/editMovieInfo")
    public boolean editMovieInfo(@RequestParam Movie movie) {
        return true;
    }

    @GetMapping(value = "/getAllMovies")
    public List<Movie> getAllMovies() {
        return new ArrayList<>();
    }

    @GetMapping(value = "/getMovieList")
    public List<Movie> getMovieList(@RequestParam String keyword) {
        return new ArrayList<>();
    }
}
