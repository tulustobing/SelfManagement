package com.self.management;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.self.management.model.ToDo;
import com.self.management.service.ToDoService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

//@Api(basePath = "swagger-demo/person", value = "Person", description = "Operations with person", produces = "application/json")
//@RequestMapping(value = "swagger-demo/person", produces = MediaType.APPLICATION_JSON_VALUE)
//@RequestMapping("/hello-world")

@RestController
@Api(basePath = "/todo", value = "Hello", description = "Operations with hello", produces = "application/json")
@RequestMapping(value = "/todo", produces = MediaType.APPLICATION_JSON_VALUE)

public class ToDoController {

	@Autowired
	ToDoService toDoService;

	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "getByID", notes = "Get ToDo by Id")
	@RequestMapping(value = "/getByID/{id}", method = RequestMethod.GET)
	public @ResponseBody ToDo getToDo(@PathVariable("id") int id) {
		return toDoService.getToDo(id);
	}

	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Create", notes = "Create new Todo")
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ResponseBody int save(@RequestBody ToDo todo, UriComponentsBuilder ucBuilder) {
		int idGenerated = toDoService.save(todo);
		return idGenerated;
	}
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity update(@RequestBody ToDo todo, UriComponentsBuilder ucBuilder) {
		toDoService.update(todo);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity delete(@PathVariable("id") int id) {
		toDoService.delete(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "getAll", notes = "Get All")
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody List<ToDo> getAll() {
		return toDoService.getAll();
	}

}