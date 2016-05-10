package com.self.management.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.self.management.dao.ReminderDao;
import com.self.management.model.Reminder;
import com.self.management.service.ReminderService;

@Component
@Service
@Transactional
public class ReminderServiceImpl implements ReminderService {

	@Autowired 
	ReminderDao reminderDao;
	
	@Override
	public List<Reminder> getAll() {
		return reminderDao.getAll();
	}

	@Override
	public Reminder getReminder(int id) {
		return reminderDao.getReminder(id);
	}

	@Override
	public int save(Reminder reminder) {
		return reminderDao.save(reminder);
	}

	@Override
	public void update(Reminder reminder) {
		reminderDao.update(reminder);
	}

	@Override
	public void delete(int id) {
		reminderDao.delete(id);
	}

}
