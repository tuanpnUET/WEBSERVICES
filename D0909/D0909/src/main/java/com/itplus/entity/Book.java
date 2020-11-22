package com.itplus.entity;

public class Book {
	private int BookID;
	private String BookCode;
	private String Title;
	private int NumOfPage;
	private String Author;
	private int Price;
	private String ReleaseDate;
	private int CategoryID;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public String getBookCode() {
		return BookCode;
	}
	public int getBookID() {
		return BookID;
	}
	public int getCategoryID() {
		return CategoryID;
	}
	public int getNumOfPage() {
		return NumOfPage;
	}
	public int getPrice() {
		return Price;
	}
	public String getReleaseDate() {
		return ReleaseDate;
	}
	public String getTitle() {
		return Title;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public void setBookCode(String bookCode) {
		BookCode = bookCode;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	public void setNumOfPage(int numOfPage) {
		NumOfPage = numOfPage;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public void setReleaseDate(String releaseDate) {
		ReleaseDate = releaseDate;
	}
	
}
