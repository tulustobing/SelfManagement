package com.self.management.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "reminder")
public class Reminder {

	private int id;
	private String title;
	private String description;
	private Date startDate;
	private Date dueDate;
	private ColourLevel colourLevel;
	
	@Id
    @Column(name = "ID")
    @GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LEVEL_ID")
	public ColourLevel getColourLevel() {
		return colourLevel;
	}
	public void setColourLevel(ColourLevel colourLevel) {
		this.colourLevel = colourLevel;
	}
		
}
