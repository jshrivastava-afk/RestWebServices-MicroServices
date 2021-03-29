package com.ltts.Library1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.Library1.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

	Author findById(String email);

}
