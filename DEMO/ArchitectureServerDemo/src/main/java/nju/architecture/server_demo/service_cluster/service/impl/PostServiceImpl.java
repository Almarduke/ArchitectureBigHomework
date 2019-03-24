package nju.architecture.server_demo.service_cluster.service.impl;

import nju.architecture.server_demo.database_cluster.entity.Movie;
import nju.architecture.server_demo.database_cluster.entity.Post;
import nju.architecture.server_demo.service_cluster.ConcreteServiceImpl;
import nju.architecture.server_demo.service_cluster.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl extends ConcreteServiceImpl implements PostService {
    @Override
    public long addPost(Post post) {
        return 0;
    }

    @Override
    public boolean deletePost(long id) {
        return false;
    }

    @Override
    public List<Movie> getMoviePosts(long movieId) {
        return null;
    }
}
