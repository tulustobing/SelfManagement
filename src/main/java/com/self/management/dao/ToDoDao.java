package com.self.management.dao;
import org.hibernate.SessionFactory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.self.management.model.ToDo;

@Component
@Repository
public class ToDoDao {
	  
	  @Autowired
	  private SessionFactory sessionFactory;
	  
	  public ToDo getToDo(int id) {
		  return (ToDo)sessionFactory.getCurrentSession().get(ToDo.class,id);
	  }
	  
	  public int save(ToDo todo){
		  return (int) sessionFactory.getCurrentSession().save(todo);
	  }
	  
	  public void update(ToDo todo){
		  sessionFactory.getCurrentSession().update(todo);
	  }
	  
	  public void delete(int id){
		  sessionFactory.getCurrentSession().delete(getToDo(id));
	  }
	  
	  public List<ToDo> getAll(){
		  return sessionFactory.getCurrentSession().createQuery("from ToDo").list();
	  }
}
