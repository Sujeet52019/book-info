package com.book.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.info.entity.BookInfo;
import com.book.info.service.BookInfoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/v1")
public class BookInfoController {
	
	
	@Autowired
	private BookInfoService bookInfoService;
	
	@GetMapping("/book-info")
	public ResponseEntity<List<BookInfo>> getAllBookInfos(){
		return new ResponseEntity<List<BookInfo>> ( 
				bookInfoService.getAllBookInfos(), 
				HttpStatus.OK);
	}
	
	@GetMapping("/book-info/{id}")
	public ResponseEntity<BookInfo> getAllBookInfoById(@PathVariable("id") int id){
		return new ResponseEntity<BookInfo> ( 
				bookInfoService.getAllBookInfoById(id), 
				HttpStatus.OK);
	}
	
	@PostMapping("/book-info")
	public ResponseEntity<BookInfo> addBookInfo(@RequestBody BookInfo bookInfo){
		
		return new ResponseEntity<BookInfo>(
				bookInfoService.addBookInfo(bookInfo), 
				HttpStatus.CREATED);
	}
	
	@PutMapping("/book-info/{id}")
	public ResponseEntity<BookInfo> modifyBookInfo(@RequestBody BookInfo bookInfo,
										@PathVariable("id") int id){
		
		return new ResponseEntity<BookInfo>(
				bookInfoService.modifyBookInfo(id, bookInfo), 
				HttpStatus.OK);
	}
	
	@DeleteMapping("/book-info/{id}")
	public ResponseEntity<BookInfo> removeBookInfoById(@PathVariable("id") int id){
		bookInfoService.deleteMovieInfoById(id);
		return new ResponseEntity<BookInfo> (  
				HttpStatus.NO_CONTENT);
	}

}
