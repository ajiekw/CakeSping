package com.example.CakeSpring;

import org.springframework.data.repository.CrudRepository;

import com.example.CakeSpring.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
