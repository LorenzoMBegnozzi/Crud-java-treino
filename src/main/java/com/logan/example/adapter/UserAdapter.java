package com.logan.example.adapter;

import com.logan.example.dto.UserDTO;
import com.logan.example.entity.User;

public class UserAdapter implements Adapter<User, UserDTO >{
    @Override
    public User toEntity(UserDTO dto) {
        return null;
    }

    @Override
    public UserDTO toDTO(User entity) {
        return null;
    }
}
