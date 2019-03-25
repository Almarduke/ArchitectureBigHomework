package nju.architecture.server_demo.service_cluster.service;

import nju.architecture.server_demo.database_cluster.entity.Movie;
import nju.architecture.server_demo.database_cluster.entity.Post;

import java.util.List;

public interface PostService {

    long addPost(Post post);

    boolean deletePost(long id);

    List<Movie> getMoviePosts(long movieId);
}
