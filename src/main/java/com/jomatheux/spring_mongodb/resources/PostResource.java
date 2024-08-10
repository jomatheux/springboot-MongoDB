package com.jomatheux.spring_mongodb.resources;

import com.jomatheux.spring_mongodb.domain.Post;
import com.jomatheux.spring_mongodb.domain.User;
import com.jomatheux.spring_mongodb.dto.UserDTO;
import com.jomatheux.spring_mongodb.services.PostService;
import com.jomatheux.spring_mongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/posts")
public class PostResource {
    @Autowired
    private PostService postService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post obj = postService.findOne(id);
        return ResponseEntity.ok().body((obj));
    }
}
