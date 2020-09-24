package model;

import java.time.LocalDate;

// Type your code
public class Blog
{
	String BlogTitle;
	String BlogDescription;
	LocalDate Date;
	public Blog(String title, String description, LocalDate postedOn) {
		super();
		this.BlogTitle = title;
		this.BlogDescription = description;
		this.Date = postedOn;
	}
	public String getBlogTitle() {
		return BlogTitle;
	}
	public void setBlogTitle(String title) {
		this.BlogTitle =title;
	}
	public String getBlogDescription() {
		return BlogDescription;
	}
	public void setBlogDescription(String description) {
		this.BlogDescription = description;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate postedOn) {
		this.Date = postedOn;
	}
	
	
}