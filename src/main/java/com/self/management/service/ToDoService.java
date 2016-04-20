package com.self.management.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.self.management.model.ToDo;

@Component
public interface ToDoService {
	public ToDo getToDo(int id);
	public int save(ToDo todo);
	public void update(ToDo todo);
	public void delete(int id);
	public List<ToDo> getAll();
}
