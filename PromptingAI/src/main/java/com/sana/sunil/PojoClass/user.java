package com.sana.sunil.PojoClass;

public class user {

	private String title;
	private String details;
	private int number;
	public user() {
		super();
	}
	@Override
	public String toString() {
		return "user [title=" + title + ", details=" + details + ", number=" + number + "]";
	}
	public user(String title, String details, int number) {
		super();
		this.title = title;
		this.details = details;
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
