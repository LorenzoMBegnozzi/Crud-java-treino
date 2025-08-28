package com.logan.example.service;

import com.logan.example.dto.UserDTO;
import com.logan.example.entity.User;
import com.logan.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.action.internal.EntityActionVetoException;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public Page<UserDTO> findAll() {
        return null;
    }

    public UserDTO findById(final Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityActionVetoException("User not found"));
    }

    public User create(final UserDTO newUser) {
        return null;
    }

    public void put(final Long id, final UserDTO user) {
        return null;
    }

    public Page<UserDTO> delete(final Long id) {
        return null;
    }

    public find(final Long id) {

    }

}
