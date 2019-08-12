package com.tjlee.hibernate.service;

import com.tjlee.hibernate.domain.CategoryItem;
import com.tjlee.hibernate.domain.Item;
import com.tjlee.hibernate.repository.CategoryItemRepository;
import com.tjlee.hibernate.repository.CategoryRepository;
import com.tjlee.hibernate.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;

@Service
@Transactional
public class HibernateService {

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    CategoryItemRepository categoryItemRepository;
    @Autowired
    ItemRepository itemRepository;

    public void getCategory() {
//        Category category = new Category();
//        category.setCategoryId(2);
//        category.setParentId(2);
//        category.setName("안녕");
//        repository.save(category);

//        Category category1 = repository.findOne(1);
//        category1.setName("바꿔보자");
//        category1.setName("바꿔보자1");
//        category1.setName("바꿔보자2");
//        repository.save(category1);

//        Category cat = repository.findOne(1);
//        List<CategoryItem> list = new ArrayList<>();
//        list.add(new CategoryItem(1, 1));
//        cat.setCategoryItems(list);
//        repository.save(cat);
//        CategoryItem categoryItem = new CategoryItem(1,1);
////        CategoryItem item2 = new CategoryItem(2,2);
////        CategoryItem item3 = new CategoryItem(3,3);
////        Arrays.asList(item,item2,item3).forEach(e -> categoryItemRepository.save(e));
//
//        Item item = new Item();
//        item.setItemId(1);
//        item.setName("첫번째");
//        item.setPrice(500);
//        item.setStockquantity("설명?");
//        itemRepository.save(item);
//        categoryItemRepository.save(categoryItem);

        
    }
}
