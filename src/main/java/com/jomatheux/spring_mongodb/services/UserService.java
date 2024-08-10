package com.jomatheux.spring_mongodb.services;

import com.jomatheux.spring_mongodb.domain.User;
import com.jomatheux.spring_mongodb.dto.UserDTO;
import com.jomatheux.spring_mongodb.repository.UserRepository;
import com.jomatheux.spring_mongodb.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findOne(String id) {
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User user) {
        return repository.insert(user);
    }

    public User fromDTO(UserDTO dto) {
        return new User(dto.getId(), dto.getName(), dto.getEmail());
    }
}
