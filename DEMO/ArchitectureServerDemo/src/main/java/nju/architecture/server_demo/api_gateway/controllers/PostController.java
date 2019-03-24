package nju.architecture.server_demo.api_gateway.controllers;

import nju.architecture.server_demo.api_gateway.RPCProxy;
import nju.architecture.server_demo.database_cluster.entity.Movie;
import nju.architecture.server_demo.database_cluster.entity.Post;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    private RPCProxy proxy;

    @PostMapping(value = "/addPost")
    public long addPost(@RequestParam Post post) {
        return 1232324345L;
    }

    @PostMapping(value = "/deletePost")
    public boolean deletePost(@RequestParam long id) {
        return true;
    }

    @GetMapping(value = "/getMoviePosts")
    public List<Movie> getMoviePosts(@RequestParam long movieId) {
        return new ArrayList<>();
    }
}
