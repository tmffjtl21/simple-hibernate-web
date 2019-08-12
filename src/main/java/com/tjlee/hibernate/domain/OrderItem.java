package com.tjlee.hibernate.domain;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {

    @Id
    @Column(name = "ORDER_ITEM_ID")
    private int orderItemId;

    @Column(name = "ORDER_ID")
    private int orderId;

    @Column(name = "ITEM_ID")
    private int itemId;

    @Column(name = "ORDERPRICE")
    private int orderPrice;

    @Column(name = "COUNT")
    private int count;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID", referencedColumnName = "ITEM_ID", insertable = false, updatable = false)
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }
}
