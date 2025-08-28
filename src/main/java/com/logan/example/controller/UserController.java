package com.logan.example.controller;

import com.logan.example.dto.UserDTO;
import com.logan.example.service.UserService;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor

public class UserController {

    private final UserService service;

    @GetMapping
    public ResponseEntity<Page<UserDTO>> findAll() {
        return null;
    }

    @GetMapping("{/id}")
    public ResponseEntity<UserDTO> findById(@RequestParam final Long id) {
        return null;
    }

    @GetMapping
    public ResponseEntity<Void> create(@RequestBody final UserDTO newuser) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> put() {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete() {
        return null;
    }
}
