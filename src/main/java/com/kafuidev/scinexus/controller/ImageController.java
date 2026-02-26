package com.kafuidev.scinexus.controller;

import com.kafuidev.scinexus.model.image.Image;
import com.kafuidev.scinexus.repository.ImageRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/images")
@CrossOrigin
public class ImageController {

    private final ImageRepository imageRepository;

    public ImageController(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @GetMapping("/")
    public List<Image> findAll(){
        return imageRepository.findAll();
    }

    @GetMapping("/{id}")
    public Image findById(@PathVariable Integer id){
        return imageRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Image not found !"));
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Valid @RequestBody Image image){
        imageRepository.save(image);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@RequestBody Image image, @PathVariable Integer id){
        if(imageRepository.findById(id).isPresent()){
            imageRepository.save(image);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Image not found !");
        }
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        if(imageRepository.findById(id).isPresent()){
            imageRepository.delete(id);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Image not found !");
        }
    }
}
