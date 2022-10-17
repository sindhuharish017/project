package com.example.demo.boot.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Table(name = "allBook")
//@DiscriminatorColumn(name = "disc")
//@DiscriminatorValue("book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int whenPublishing;
	 @ManyToMany(targetEntity=Author.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
	 private Set<Author> authors;
//	 @JoinTable(name="book_author",joinColumns=@JoinColumn(name="book_id",referencedColumnName="id"),inverseJoinColumns=@JoinColumn(name="author_id",referencedColumnName="id"))
//
//	 @ManyToOne(targetEntity=Publisher.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.EAGER)
//	 @JoinColumn(name="publisher_id",referencedColumnName="id")
//	 Publisher publisher;

	public Book(String name, int whenPublishing) {
		super();
		this.name = name;
		this.whenPublishing = whenPublishing;
	}

	public Book() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWhenPublishing() {
		return whenPublishing;
	}

	public void setWhenPublishing(int whenPublishing) {
		this.whenPublishing = whenPublishing;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", whenPublishing=" + whenPublishing + "]";
	}

}
