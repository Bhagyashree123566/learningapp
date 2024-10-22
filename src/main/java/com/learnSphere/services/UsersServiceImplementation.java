package com.learnSphere.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entities.Users;
import com.learnSphere.repositories.UsersRepository;
@Service
public class UsersServiceImplementation 
                    implements UsersService {
	@Autowired
    UsersRepository repo;
	
	public String addUser(Users user) {
		repo.save(user);
		return "user added!";
	}
	
	@Override
	public Users findUserByEmail(String email)
	{
		return repo.findByEmail(email);
	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return repo.existsByEmail(email);
	}

	@Override
	public String saveUsers(Users user) {
		repo.save(user);
		return "updated successfully";
	}
}
