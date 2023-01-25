package com.xworkz.biscuit.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="biscuit")
public class BiscuitDto {
    
	@Id
	private int id;
	private String name;
	private int price;
	private String type;
	private boolean containsSugar;
	
	
	
	public BiscuitDto() {
		super();
	}



	public BiscuitDto(int id, String name, int price, String type, boolean containsSugar) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.containsSugar = containsSugar;
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



	public boolean isContainsSugar() {
		return containsSugar;
	}



	public void setContainsSugar(boolean containsSugar) {
		this.containsSugar = containsSugar;
	}



	@Override
	public String toString() {
		return "BiscuitDto [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", containsSugar="
				+ containsSugar + "]";
	}






	
	
}
