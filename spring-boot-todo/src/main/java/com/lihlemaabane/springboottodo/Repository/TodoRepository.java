package com.lihlemaabane.springboottodo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lihlemaabane.springboottodo.Module.Todo;


public interface TodoRepository extends JpaRepository<Todo,Long>  {

}
