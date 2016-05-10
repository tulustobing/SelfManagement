package com.self.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.self.management.model.Item;
import com.self.management.service.ItemService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@Api(basePath = "/item", value = "Item", description = "Operations with Item", produces = "application/json")
@RequestMapping(value = "/item", produces = MediaType.APPLICATION_JSON_VALUE)

public class ItemController {

	@Autowired
	ItemService itemService;

	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "getAll", notes = "Get All")
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody List<Item> getAll() {
		return itemService.getAll();
	}

	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "getByID", notes = "Get Item by Id")
	@RequestMapping(value = "/getByID/{id}", method = RequestMethod.GET)
	public @ResponseBody Item getItem(@PathVariable("id") int id) {
		return itemService.getItem(id);
	}

	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Create", notes = "Create new Item")
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ResponseBody int save(@RequestBody Item item, UriComponentsBuilder ucBuilder) {
		int idGenerated = itemService.save(item);
		return idGenerated;
	}

	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Update", notes = "Update Item")
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity update(@RequestBody Item item, UriComponentsBuilder ucBuilder) {
		itemService.update(item);
		return new ResponseEntity(HttpStatus.OK);
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity delete(@PathVariable("id") int id) {
		itemService.delete(id);
		return new ResponseEntity(HttpStatus.OK);
	}
}
