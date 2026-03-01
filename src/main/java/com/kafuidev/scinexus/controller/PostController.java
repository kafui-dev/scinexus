package com.kafuidev.scinexus.controller;

import com.kafuidev.scinexus.model.post.Post;
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
    private final PostRepository postRepository;

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
    public Post create(@Valid @RequestBody Post post){
        return postRepository.save(post);
    }

    //Update
    @PutMapping("/post-{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@RequestBody Post post, @PathVariable Integer id){
        //Making sure it already exists
        if(postRepository.findById(id).isPresent()){
            postRepository.save(post);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found !");
        }
    }

    //Delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("post-{id}")
    public void delete(@PathVariable Integer id){
        if(postRepository.findById(id).isPresent()){
            postRepository.deleteById(id);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found !");
        }
    }

}
