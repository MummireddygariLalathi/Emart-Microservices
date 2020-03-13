package com.cts.model;

public class Category {
private int CategoryId;
private String CategoryName;
private int gstPercentage;
private int description;


public Category() {
	
}



public Category(int categoryId, String categoryName, int gstPercentage, int description) {
	super();
	CategoryId = categoryId;
	CategoryName = categoryName;
	this.gstPercentage = gstPercentage;
	this.description = description;
}





public int getCategoryId() {
	return CategoryId;
}


public void setCategoryId(int categoryId) {
	CategoryId = categoryId;
}


public String getCategoryName() {
	return CategoryName;
}


public void setCategoryName(String categoryName) {
	CategoryName = categoryName;
}


public int getGstPercentage() {
	return gstPercentage;
}


public void setGstPercentage(int gstPercentage) {
	this.gstPercentage = gstPercentage;
}

public int getDescription() {
	return description;
}


public void setDescription(int description) {
	this.description = description;
}



}
