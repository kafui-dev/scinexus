package com.kafuidev.scinexus.repository;

import com.kafuidev.scinexus.model.post.Post;
import jakarta.annotation.PostConstruct;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface PostRepository extends ListCrudRepository<Post, Integer> {
    @Override
    <S extends Post> List<S> saveAll(Iterable<S> entities);

    //    private final List<Post> postsList = new ArrayList<>();
//
//    public PostRepository() {}
//
//    public List<Post> findAll() {
//        return postsList;
//    }
//
//    public Optional<Post> findById(Integer id) {
//        return postsList.stream().filter(post -> post.id().equals(id)).findFirst();
//    }
//
//    public void save(Post post) {
//        postsList.removeIf(post1 -> post1.id().equals(post.id()));
//        postsList.add(post);
//    }
//
//    @PostConstruct
//    public void init() {
//        Post post = new Post(
//                1,
//                "First Post Title",
//                "This is the subheading of post 1",
//                "/first-post",
//                LocalDateTime.now(),
//                null,
//                1,
//                "Kafui Homevo",
//                "# This is the title of the content." +
//                        "## Formatted H2" +
//                        "And text now. Great, let's keep going !",
//                "https://example.com/image1.jpg"
//        );
//        postsList.add(post);
//    }
//
//    public void delete(Integer id) {
//        postsList.removeIf(post -> post.id().equals(id));
//    }
}
