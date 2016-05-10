package com.self.management.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.self.management.model.Reminder;
import com.self.management.model.ToDo;

@Component
public interface ReminderService {
	public List<Reminder> getAll();

	public Reminder getReminder(int id);

	public int save(Reminder reminder);

	public void update(Reminder reminder);

	public void delete(int id);
}
