package ru.chernyshev.MyEighthTestAppSpringBoot.service;

import ru.chernyshev.MyEighthTestAppSpringBoot.dto.UserDto;
import ru.chernyshev.MyEighthTestAppSpringBoot.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
