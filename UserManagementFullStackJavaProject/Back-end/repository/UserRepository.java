package com.userManagementProject.fullstack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userManagementProject.fullstack_backend.mmodel.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
