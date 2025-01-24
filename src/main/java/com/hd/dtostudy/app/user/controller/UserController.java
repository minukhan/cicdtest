package com.hd.dtostudy.app.user.controller;


import com.hd.dtostudy.app.user.dto.UserResponse;
import com.hd.dtostudy.app.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/teste")
    public UserResponse test(@RequestParam Long userId) {
        System.out.println("Received userId: " + userId);
        UserResponse response = userService.getAllUser(userId);
        return response;
    }

}
