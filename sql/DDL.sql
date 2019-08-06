create schema hibernate_test collate utf8_general_ci;

create table category
(
	CATEGORY_ID int not null
		primary key,
	PARENT_ID int not null,
	NAME varchar(45) null
);

create table delivery
(
	DELIVERTY_ID int not null
		primary key,
	CITY varchar(45) null,
	STREET varchar(45) null,
	ZIPCODE varchar(45) null,
	STATUS varchar(10) null
);

create table item
(
	ITEM_ID int not null
		primary key,
	NAME varchar(45) null,
	PRICE int null,
	STOCKQUANTITY varchar(45) null
);

create table category_item
(
	CATEGORY_ID int not null,
	ITEM_ID int not null,
	primary key (CATEGORY_ID, ITEM_ID),
	constraint CATEGORY_ITEM_CATEGORY_FK
		foreign key (CATEGORY_ID) references category (CATEGORY_ID),
	constraint CATEGORY_ITEM_ITEM_FK
		foreign key (CATEGORY_ID) references item (ITEM_ID)
);

create table member
(
	MEMBER_ID int not null
		primary key,
	NAME varchar(45) null,
	CITY varchar(45) null,
	STREET varchar(45) null,
	ZIPCODE varchar(45) null
);

create table orders
(
	ORDER_ID int not null
		primary key,
	MEMBER_ID int not null,
	DELIVERY_ID int null,
	ORDERDATE date null,
	STATUS varchar(10) null,
	constraint ORDERS_DELIVERY_FK
		foreign key (ORDER_ID) references delivery (DELIVERTY_ID),
	constraint ORDERS_MEMBER_FK
		foreign key (ORDER_ID) references member (MEMBER_ID)
);

create table order_item
(
	ORDER_ITEM_ID int not null
		primary key,
	ORDER_ID int not null,
	ITEM_ID int not null,
	ORDERPRICE int null,
	COUNT int null,
	constraint ORDER_ITEM_ITEM_FK
		foreign key (ORDER_ITEM_ID) references item (ITEM_ID),
	constraint ORDER_ITEM_ORDERS_FK
		foreign key (ORDER_ITEM_ID) references orders (ORDER_ID)
);

