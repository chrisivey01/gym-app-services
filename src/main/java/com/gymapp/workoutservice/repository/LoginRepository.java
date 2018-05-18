package com.gymapp.workoutservice.repository;

import com.gymapp.workoutservice.entity.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Login, Integer>{
    Login findLoginByUsername(String username);
    Login findLoginByPassword(String password);

}
