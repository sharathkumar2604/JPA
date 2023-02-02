package com.xworkz.pen.dto;

public class PenDto {
	
	private int id;
	private String name;
	private String color;
	private int price;
	private String type;
	
	public PenDto() {
	}

	public PenDto(int id, String name, String color, int price, String type) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.type = type;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "PenDto [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", type=" + type + "]";
	}

	
	

}
