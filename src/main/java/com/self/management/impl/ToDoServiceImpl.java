/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.management.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.self.management.dao.ToDoDao;
import com.self.management.model.ToDo;
import com.self.management.service.ToDoService;

/**
 *
 * @author tlumbantobing
 */
@Component
@Service
@Transactional
public class ToDoServiceImpl implements ToDoService {

	@Autowired
	ToDoDao toDoDao;

	@Override
	public ToDo getToDo(int id) {
		return toDoDao.getToDo(id);
	}

	@Override
	public int save(ToDo todo) {
		return toDoDao.save(todo);
	}

	@Override
	public void update(ToDo todo) {
		toDoDao.update(todo);
		
	}

	@Override
	public void delete(int id) {
		toDoDao.delete(id);		
	}

	@Override
	public List<ToDo> getAll() {
		return toDoDao.getAll();
	}

}
