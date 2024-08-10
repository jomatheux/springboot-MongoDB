package com.jomatheux.spring_mongodb.repository;

import com.jomatheux.spring_mongodb.domain.Post;
import com.jomatheux.spring_mongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
