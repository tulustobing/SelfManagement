package com.self.management.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.self.management.model.Item;

@Component
@Repository
public class ItemDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<Item> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Item").list();
	}

	public Item getItem(int id) {
		return (Item) sessionFactory.getCurrentSession().get(Item.class, id);
	}

	public int save(Item item) {
		return (int) sessionFactory.getCurrentSession().save(item);
	}

	public void update(Item item) {
		sessionFactory.getCurrentSession().update(item);
	}

	public void delete(int id) {
		sessionFactory.getCurrentSession().delete(getItem(id));
	}
}
