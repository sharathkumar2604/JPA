package com.xworkz.bags.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Bags")
@NamedQuery(name="readAll",query = "select dt from BagsDto dt")
@NamedQuery(name="findnamebyid",query ="select dt from BagsDto dt where dt.name=:nm and dt.id=:id")
@NamedQuery(name="updatenamebyidandcolor",query="update BagsDto dt set dt.name=:nm where dt.id=:id and dt.color=:cl")
@NamedQuery(name="deletenamebyid",query ="delete from BagsDto dt where dt.name=:nm and dt.id=:id")
public class BagsDto {
	
	@Id
	private int id;
	private String name;
	private String color;
	private String type;
	private int price;
	public BagsDto(int id, String name, String color, String type, int price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.type = type;
		this.price = price;
	}
	public BagsDto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BagsDto [id=" + id + ", name=" + name + ", color=" + color + ", type=" + type + ", price=" + price
				+ "]";
	}
	
	

}
