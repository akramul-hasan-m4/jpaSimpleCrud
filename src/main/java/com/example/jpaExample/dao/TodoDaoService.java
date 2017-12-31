package com.example.jpaExample.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpaExample.Entity.Todo;

@Service
public class TodoDaoService {
	
	@Autowired
	TodoRepository repo;
	
	public List<Todo> getAll(){
		List<Todo> list=new ArrayList<>();
		repo.findAll().forEach(list::add);
		return list;
	}
	
	public void savedata(Todo todo) {
		repo.save(todo);
	}
	public void updatedata(Todo todo) {
		repo.save(todo);
	}
	public void deletedata(Long id) {
		repo.delete(id);
	}
	public Todo findById(Long id) {
		return repo.findOne(id);
	}

}
