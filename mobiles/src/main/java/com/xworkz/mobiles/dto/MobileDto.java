package com.xworkz.mobiles.dto;

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
@Setter
@Getter
@ToString
@Entity
@Table(name="mobile")
//@NamedQuery(name="",query="")
//@NamedQuery(name ="",query = "")

public class MobileDto {

	@Id
	private int id;
	private String name;
	private int price;
	private String color;
	private String type;
	
}
