package com.example.spring1.entities;

public class Course {
	private long id;
	private String titles;
	private String description;

	public Course(long id, String titles, String description) {
		super();
		this.id = id;
		this.titles = titles;
		this.description = description;
	}

	public Course() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitles() {
		return titles;
	}

	public void setTitles(String titles) {
		this.titles = titles;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", titles=" + titles + ", description=" + description + "]";
	}

}
