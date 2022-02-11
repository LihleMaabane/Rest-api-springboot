package com.lihlemaabane.springboottodo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lihlemaabane.springboottodo.Module.User;

public interface UserRepository extends JpaRepository<User,Long>  {

}
