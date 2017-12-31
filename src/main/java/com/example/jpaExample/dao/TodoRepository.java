package com.example.jpaExample.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.jpaExample.Entity.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
