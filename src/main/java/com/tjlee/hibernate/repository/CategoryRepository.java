package com.tjlee.hibernate.repository;

import com.tjlee.hibernate.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
