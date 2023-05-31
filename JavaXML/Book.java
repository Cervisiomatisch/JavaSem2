/*package JavaXML;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "book")
@XmlType(propOrder = { "title", "author", "year", "price" })
public class Book {
	private String title;
	private String author;
	private int year;
	private double price;

	// Konstruktor
	public Book(String title, String author, int year, double price) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.price = price;
	}

	public Book() {
		this.title = "unknown";
		this.author = "unknown";
		this.year = 0;
		this.price = 0.0;
	}

	// Getter- und Setter-Methoden
	@XmlElement(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@XmlElement(name = "author")
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@XmlElement(name = "year")
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@XmlElement(name = "price")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
*/