package com.learnSphere.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphere.entities.Users;

public interface UsersRepository extends JpaRepository<Users, String> {
	    Users findByEmail(String email);
	    
        boolean existsByEmail(String email);
}
