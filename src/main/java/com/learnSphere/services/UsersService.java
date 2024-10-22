package com.learnSphere.services;

import com.learnSphere.entities.Users;

public interface UsersService {
      String addUser(Users user);
      Users findUserByEmail(String email);
      
      String saveUsers(Users user);
      boolean checkEmail(String email);
}
