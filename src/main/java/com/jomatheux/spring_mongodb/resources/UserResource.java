package com.jomatheux.spring_mongodb.resources;

import com.jomatheux.spring_mongodb.domain.User;
import com.jomatheux.spring_mongodb.dto.UserDTO;
import com.jomatheux.spring_mongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll(){
        List<User> users = userService.findAll();
        List<UserDTO> userDTOs = users.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(userDTOs);
    }
}
