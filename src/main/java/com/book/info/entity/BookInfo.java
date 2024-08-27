package com.book.info.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "book-info")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BookInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "book-name")
	private String bookName;
	@Column(name = "book-author")
	private String author;
	@Column(name = "book-release-date")
	private String releaseDate;
	@Column(name = "book-page")
	private int noOfPage;
	@Column(name = "book-price")
	private int price;

}
