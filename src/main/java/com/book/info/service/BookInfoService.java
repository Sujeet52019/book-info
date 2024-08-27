package com.book.info.service;

import java.util.List;

import com.book.info.entity.BookInfo;

public interface BookInfoService {

	BookInfo addBookInfo(BookInfo bookInfo);

	List<BookInfo> getAllBookInfos();

	BookInfo getAllBookInfoById(int id);

	BookInfo modifyBookInfo(int id, BookInfo bookInfo);

	void deleteMovieInfoById(int id);
	

}
