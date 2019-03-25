package nju.architecture.server_demo.database_cluster.dao;

import nju.architecture.server_demo.database_cluster.entity.Post;

import java.util.List;

public interface PostDao {

    List<String> getPostsByMovieId(long movieId);

    boolean createPost(Post post);

    boolean deletePost(Post post);
}
