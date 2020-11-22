package com.itplus.model;

public class CategoryDTO {
	private String CategoryName;
	private String Description;
	public CategoryDTO() {
	
	}
	
	public String getCategoryName() {
		return CategoryName;
	}
	public String getDescription() {
		return Description;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public void setDescription(String description) {
		Description = description;
	}
}
