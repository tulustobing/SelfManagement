package com.self.management.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.self.management.dao.ItemDao;
import com.self.management.model.Item;
import com.self.management.service.ItemService;

@Component
@Service
@Transactional
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemDao itemDao;

	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}

	@Override
	public Item getItem(int id) {
		return itemDao.getItem(id);
	}

	@Override
	public int save(Item item) {
		return itemDao.save(item);
	}

	@Override
	public void update(Item item) {
		itemDao.update(item);
	}

	@Override
	public void delete(int id) {
		itemDao.delete(id);
	}
}
