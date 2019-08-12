package com.tjlee.hibernate.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CATEGORY_ITEM")
public class CategoryItem {

    public CategoryItem() {
    }

    public CategoryItem(int categoryId, int itemId) {
        this.categoryId = categoryId;
        this.itemId = itemId;
    }

    @Id
    @Column(name = "CATEGORY_ID")
    private int categoryId;

    @Column(name = "ITEM_ID")
    private int itemId;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "CATEGORY_ID", insertable = false, updatable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID", referencedColumnName = "ITEM_ID", insertable = false, updatable = false)
    private Item item;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, itemId);
    }
}
