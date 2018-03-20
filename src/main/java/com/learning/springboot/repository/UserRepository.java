package com.learning.springboot.repository;

import com.learning.springboot.data.User;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository  extends JpaRepository<User,Long>{

    public User findUserByName(String name);

}


