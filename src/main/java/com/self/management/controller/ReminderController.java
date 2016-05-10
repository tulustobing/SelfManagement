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

import com.self.management.model.Reminder;
import com.self.management.model.ToDo;
import com.self.management.service.ReminderService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@Api(basePath = "/reminder", value = "Reminder", description = "Operations with Reminder", produces = "application/json")
@RequestMapping(value = "/reminder", produces = MediaType.APPLICATION_JSON_VALUE)

public class ReminderController {

	@Autowired
	ReminderService reminderService;
	
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "getAll", notes = "Get All")
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody List<Reminder> getAll() {
		return reminderService.getAll();
	}
	
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "getByID", notes = "Get Reminder by Id")
	@RequestMapping(value = "/getByID/{id}", method = RequestMethod.GET)
	public @ResponseBody Reminder getReminder(@PathVariable("id") int id) {
		return reminderService.getReminder(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Create", notes = "Create new Reminder")
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ResponseBody int save(@RequestBody Reminder reminder, UriComponentsBuilder ucBuilder) {
		int idGenerated = reminderService.save(reminder);
		return idGenerated;
	}
	
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Update", notes = "Update Reminder")
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity update(@RequestBody Reminder reminder, UriComponentsBuilder ucBuilder) {
		reminderService.update(reminder);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity delete(@PathVariable("id") int id) {
		reminderService.delete(id);
		return new ResponseEntity(HttpStatus.OK);
	}
}
