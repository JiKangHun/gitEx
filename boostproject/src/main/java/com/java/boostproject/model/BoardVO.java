package com.java.boostproject.model;

import java.util.Date;

public class BoardVO {
	private int no;
	private int contentno;
	private String title;
	private String content;
	private String regi_date;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public int getContentno() {
		return contentno;
	}
	public void setContentno(int contentno) {
		this.contentno = contentno;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegi_date() {
		return regi_date;
	}
	public void setRegi_date(String regi_date) {
		this.regi_date = regi_date;
	}
	
	
	

}
