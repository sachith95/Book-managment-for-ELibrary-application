package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book  implements java.io.Serializable   {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	@Column (nullable=false)
	private String Name;
	@Column (nullable=false)
	private String Author;
	@Column (nullable=false)
	private String BookLocation;
	@Column (nullable=false)
	private String Category;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getBookLocation() {
		return BookLocation;
	}
	public void setBookLocation(String bookLocation) {
		BookLocation = bookLocation;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	
	
}
