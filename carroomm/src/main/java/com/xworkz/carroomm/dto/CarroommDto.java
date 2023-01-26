package com.xworkz.carroomm.dto;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="carroomm")



	public class CarroommDto {

		@Id
		private int id;
		private String name;
		private String color;
		private String type;
		private int price;
		
		public CarroommDto() {
		}

		public CarroommDto(int id, String name, String color, String type, int price) {
			this.id = id;
			this.name = name;
			this.color = color;
			this.type = type;
			this.price = price;
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
			return "CarroommDto [id=" + id + ", name=" + name + ", color=" + color + ", type=" + type + ", price="
					+ price + "]";
		}
		
		

		
	}

	


