package com.ltts.Library1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.Library1.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
