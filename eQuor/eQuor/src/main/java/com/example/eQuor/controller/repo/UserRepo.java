package com.example.eQuor.controller.repo;

import com.example.eQuor.controller.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
