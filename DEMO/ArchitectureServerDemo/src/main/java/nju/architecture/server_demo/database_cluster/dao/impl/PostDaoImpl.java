package nju.architecture.server_demo.database_cluster.dao.impl;

import nju.architecture.server_demo.database_cluster.dao.PostDao;
import nju.architecture.server_demo.database_cluster.entity.Post;

import java.util.List;

public class PostDaoImpl implements PostDao {
    @Override
    public List<String> getPostsByMovieId(long movieId) {
        return null;
    }

    @Override
    public boolean createPost(Post post) {
        return false;
    }

    @Override
    public boolean deletePost(Post post) {
        return false;
    }
}
