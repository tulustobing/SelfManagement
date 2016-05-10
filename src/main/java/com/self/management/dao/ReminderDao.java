package com.self.management.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.self.management.model.Reminder;

@Component
@Repository
public class ReminderDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Reminder> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Reminder").list();
	}

	public Reminder getReminder(int id) {
		return (Reminder) sessionFactory.getCurrentSession().get(Reminder.class, id);
	}

	public int save(Reminder reminder) {
		return (int) sessionFactory.getCurrentSession().save(reminder);
	}

	public void update(Reminder reminder) {
		sessionFactory.getCurrentSession().update(reminder);
	}

	public void delete(int id) {
		sessionFactory.getCurrentSession().delete(getReminder(id));
	}

}
