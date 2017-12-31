package com.example.jpaExample.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="todo_table")
public class Todo implements Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id @GeneratedValue(strategy=GenerationType.AUTO)
Long id;
@Column(name="name")
String name;
public Todo() {
	super();
	// TODO Auto-generated constructor stub
}
public Todo(Long id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Todo [id=" + id + ", name=" + name + "]";
}


}
