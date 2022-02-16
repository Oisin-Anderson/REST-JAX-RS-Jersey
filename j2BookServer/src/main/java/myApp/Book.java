package myApp;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="book")
@XmlType(propOrder = {"id", "title", "author", "year"})
public class Book {
	private int id;
	private String title;
	private String author;
	private String year;
	
	public Book(int id, String title, String author, String year) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public Book() {
		
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getYear() {
		return year;
	}

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + '}';
    }
}
