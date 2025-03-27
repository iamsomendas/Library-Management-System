package com.diatoz.assignment.repository;

import com.diatoz.assignment.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {

}
