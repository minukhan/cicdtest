package com.hd.dtostudy.app.user.service;

import com.hd.dtostudy.app.user.dto.UserResponse;
import com.hd.dtostudy.app.user.entity.User;
import com.hd.dtostudy.app.user.repositroy.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponse getAllUser(Long userId){
        System.out.println("Service: " +userId);
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("뭐가문제야?"));

        return UserResponse.of(user);
    }

}

