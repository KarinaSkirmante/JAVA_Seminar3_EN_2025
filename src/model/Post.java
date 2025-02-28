package model;

import java.time.LocalDateTime;

public class Post {
	// variables, getters, setters, both constructors, toString + other functions(if necessary)
	private String msg;
	private LocalDateTime datetime;
	private int countOfLikes;//TODO can be changed to arraylist of register users
	
	public String getMsg() {
		return msg;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public int getCountOfLikes() {
		return countOfLikes;
	}
	
	public void setMsg(String inputMsg) {
		if(inputMsg != null && inputMsg.matches("[A-Za-z0-9!@#$%^&*()? .,]{1,160}")) {
			msg = inputMsg;
		}
		else
		{
			msg = "No message";
		}
	}
	public void setDatetime() {
		datetime = LocalDateTime.now();
	}
	
	public void increaseLikes() {
		countOfLikes++;
	}
	
	
	
	
	
}
