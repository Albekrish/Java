package com.mailapplication.dto;

import java.sql.Time;
import java.util.Date;

public class MailHistory {
	private String from;
	private String content;
	private Date date;
	private Time time;	

	public MailHistory(String from, String content, Date date, Time time) {		
		this.from = from;
		this.content = content;
		this.date = date;
		this.time = time;
	}

	public MailHistory() {
		
	}

	public String getFrom() {
		return from;
	}

	public String getContent() {
		return content;
	}

	public Date getDate() {
		return date;
	}

	public Time getTime() {
		return time;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	

	@Override
	public String toString() {
		return "MailHistory [from=" + from + ", content=" + content + ", date=" + date + ", time=" + time  + "]";
	}
}
