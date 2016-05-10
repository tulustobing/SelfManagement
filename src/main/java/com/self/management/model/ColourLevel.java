package com.self.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "colour_level")
public class ColourLevel {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int id;
	private String colour;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
