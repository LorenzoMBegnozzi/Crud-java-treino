package com.logan.example.service;

import com.logan.example.dto.UserDTO;
import com.logan.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public Page<UserDTO> findAll() {
         return null;
    }
}
