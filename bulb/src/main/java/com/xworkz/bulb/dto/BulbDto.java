package com.xworkz.bulb.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name ="light")
@NamedQuery(name="readall" ,query="select read from BulbDto read")
@NamedQuery(name="findByName",query="select find from BulbDto find where find.name=:nm")


public class BulbDto {
	@Id
	private int id;
	private String name;
	private String color;
	private String type;
	private int price;
	
	

}
