package com.hd.dtostudy.app.user.dto;


import com.hd.dtostudy.app.user.entity.User;

public record UserResponse(

        Long id,
        String name,
        String password,
        String email,
        String phone,
        String address

) {
    public static UserResponse of(User user){
        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getPassword(),
                user.getEmail(),
                user.getPhone(),
                user.getAddress()
        );
    }
}

