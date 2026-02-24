package com.kafuidev.scinexus.controller;

import com.kafuidev.scinexus.model.Post;
import com.kafuidev.scinexus.repository.ImageRepository;
import com.kafuidev.scinexus.repository.PostRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin
/**
 * Controller for the post model
 */
public class PostController {

    private PostRepository postRepository;
    private ImageRepository imageRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    //implementing the CRUD operations

    // Read operations
    @GetMapping("")
    public List<Post> findAll(){
        return postRepository.findAll();
    }

    @GetMapping("/post-{id}")
    public Post findById(@PathVariable Integer id){
        return postRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found !"));
    }

    //Create
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Valid @RequestBody Post post){
        postRepository.save(post);
    }






}
