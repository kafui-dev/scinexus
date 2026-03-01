package com.kafuidev.scinexus.config;

import com.kafuidev.scinexus.model.post.Post;
import com.kafuidev.scinexus.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final PostRepository postRepository;
    private final ObjectMapper objectMapper;

    public DataLoader(PostRepository postRepository, ObjectMapper objectMapper) {
        this.postRepository = postRepository;
        this.objectMapper = objectMapper;
    }


    @Override
    public void run(String... args) throws Exception {
        try(InputStream inputStream = getClass().getResourceAsStream("/data/posts.json")) {
            postRepository.saveAll(objectMapper.readValue(inputStream, new TypeReference<List<Post>>(){}));
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }


}
