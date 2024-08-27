package com.book.info.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.info.entity.BookInfo;
import com.book.info.repository.BookInfoRepository;

@Service
public class BookInfoServiceImp implements BookInfoService {

	@Autowired
	private BookInfoRepository bookInfoRepository;
	
	@Override
	public BookInfo addBookInfo(BookInfo bookInfo) {
		
		return bookInfoRepository.save(bookInfo);
	}

	@Override
	public List<BookInfo> getAllBookInfos() {
		
		return bookInfoRepository.findAll();
	}

	@Override
	public BookInfo getAllBookInfoById(int id) {
		// TODO Auto-generated method stub
		return bookInfoRepository.findById(id).get();
	}

	@Override
	public BookInfo modifyBookInfo(int id, BookInfo bookInfo) {
		BookInfo bookInfoOld = bookInfoRepository.findById(id).get();
		bookInfoOld.setBookName(bookInfo.getBookName());
		bookInfoOld.setAuthor(bookInfo.getAuthor());
		bookInfoOld.setNoOfPage(bookInfo.getNoOfPage());
		bookInfoOld.setPrice(bookInfo.getPrice());
		bookInfoOld.setReleaseDate(bookInfo.getReleaseDate());
		
		return bookInfoRepository.save(bookInfoOld);
	}

	@Override
	public void deleteMovieInfoById(int id) {
		bookInfoRepository.deleteById(id);
	}

	

}
