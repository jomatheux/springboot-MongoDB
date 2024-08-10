package com.jomatheux.spring_mongodb.repository;

import com.jomatheux.spring_mongodb.domain.Post;
import com.jomatheux.spring_mongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgnoreCase(String text);
}
