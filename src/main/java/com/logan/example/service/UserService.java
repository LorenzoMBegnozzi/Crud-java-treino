package com.logan.example.service;

import com.logan.example.adapter.UserAdapter;
import com.logan.example.dto.UserDTO;
import com.logan.example.entity.User;
import com.logan.example.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserAdapter adapter;

    public Page<UserDTO> findAll(final Pageable pageable) {
        return repository.findAll(pageable)
                .map(adapter::toDTO);
    }

    public UserDTO findById(final Long id) {
        final User user = find(id);
        return adapter.toDTO(user);
    }

    public User create(final UserDTO newUser) {
        final User user = adapter.toEntity(newUser);
        return repository.save(user);
    }

    public void put(final Long id, final UserDTO user) {
         find(id);

         user.
    }

    public Page<UserDTO> delete(final Long id) {
        return null;
    }

    private User find(final Long id) {
        repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
    }

}
