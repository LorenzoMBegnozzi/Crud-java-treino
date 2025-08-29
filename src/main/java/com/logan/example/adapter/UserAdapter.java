package com.logan.example.adapter;

import com.logan.example.dto.UserDTO;
import com.logan.example.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserAdapter implements Adapter<User, UserDTO> {
    @Override
    public User toEntity(UserDTO dto) {
        User user = new User();

        user.setId(dto.id());
        user.setName(dto.name());
        user.setPassword(dto.password());
        user.setCpf(dto.cpf());
        user.setAge(dto.age());
        user.setEmail(dto.email());
        user.setStatus(dto.status());

        return user;
    }

    @Override
    public UserDTO toDTO(User entity) {

        return UserDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .password(entity.getPassword())
                .age(entity.getAge())
                .cpf(entity.getCpf())
                .email(entity.getEmail())
                .status(entity.getStatus())
                .build();
    }
}
