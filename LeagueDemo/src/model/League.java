package model;

public class League {
	String name;
	String year;
	String title;
	
	public League(String name, String year,String title)
	{
		this.name=name;
		this.year=year;
		this.title=title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return title;
	}
	
	


}
