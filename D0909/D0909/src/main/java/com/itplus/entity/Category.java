package com.itplus.entity;

public class Category {
	private int CategoryID;
	private String CategoryName;
	private String Description;
	public Category() {
	
	}
	public int getCategoryId() {
		return CategoryID;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public String getDescription() {
		return Description;
	}
	public void setCategoryID(int categoryId) {
		CategoryID = categoryId;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public void setDescription(String description) {
		Description = description;
	}
}
