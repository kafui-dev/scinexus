package com.kafuidev.scinexus.repository;

import com.kafuidev.scinexus.model.post.Post;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PostRepository {

    private final List<Post> postsList = new ArrayList<>();

    public PostRepository() {}

    public List<Post> findAll() {
        return postsList;
    }

    public Optional<Post> findById(Integer id) {
        return postsList.stream().filter(post -> post.id().equals(id)).findFirst();
    }

    public void save(Post post) {
        postsList.removeIf(post1 -> post1.id().equals(post.id()));
        postsList.add(post);
    }

    @PostConstruct
    public void init() {
        List<Integer> categoryIds = new ArrayList<>();
        categoryIds.add(1);categoryIds.add(2);categoryIds.add(3);categoryIds.add(4);
        List<Integer> imageIds = new ArrayList<>();
        imageIds.add(1);imageIds.add(2);imageIds.add(3);imageIds.add(4);
        Post post = new Post(
                1,
                "First Post Title",
                "This is the subheading of post 1",
                "/first-post",
                LocalDateTime.now(),
                null,
                categoryIds,
                "Kafui Homevo",
                "# This is the title of the content." +
                        "## Formatted H2" +
                        "And text now. Great, let's keep going !",
                imageIds
        );
        postsList.add(post);
    }

    public void delete(Integer id) {
        postsList.removeIf(post -> post.id().equals(id));
    }
}
