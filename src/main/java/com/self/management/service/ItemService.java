package com.self.management.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.self.management.model.Item;

@Component
public interface ItemService {
	public List<Item> getAll();

	public Item getItem(int id);

	public int save(Item item);

	public void update(Item item);

	public void delete(int id);
}
