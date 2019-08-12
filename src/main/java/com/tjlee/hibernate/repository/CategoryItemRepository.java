package com.tjlee.hibernate.repository;

import com.tjlee.hibernate.domain.CategoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryItemRepository extends JpaRepository<CategoryItem, Integer> {
}
