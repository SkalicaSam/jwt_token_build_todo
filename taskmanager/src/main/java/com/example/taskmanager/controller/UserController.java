package com.example.taskmanager.controller;

import com.example.taskmanager.dto.UserDto;
import com.example.taskmanager.entity.User;
import com.example.taskmanager.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {



    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody UserDto userDto) {
        User createdUser = userService.register(userDto);
        return ResponseEntity.ok(createdUser);
    }
}

