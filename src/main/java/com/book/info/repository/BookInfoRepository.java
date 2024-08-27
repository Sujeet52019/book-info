package com.book.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.info.entity.BookInfo;


@Repository
public interface BookInfoRepository extends JpaRepository<BookInfo, Integer> {

}
