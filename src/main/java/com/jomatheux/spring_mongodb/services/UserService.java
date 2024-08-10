package com.jomatheux.spring_mongodb.services;

import com.jomatheux.spring_mongodb.domain.User;
import com.jomatheux.spring_mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
