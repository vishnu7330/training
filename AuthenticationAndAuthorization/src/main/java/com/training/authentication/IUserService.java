package com.training.authentication;

import com.training.authentication.entity.User;
import com.training.authentication.entity.UserDto;

public interface IUserService {
    User registerNewUserAccount(UserDto userDto);
}