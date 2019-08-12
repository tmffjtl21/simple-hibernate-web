package com.tjlee.hibernate.repository;

import com.tjlee.hibernate.domain.Category;
import com.tjlee.hibernate.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
