package com.xworkz.soap.dto;

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
@Table(name="soap")
@NamedQuery(name="readall", query="select read from SoapDto read")
@NamedQuery(name="findByName", query ="select find from SoapDto find where find.name=:nm")
@NamedQuery(name="findByColor",query ="select find from SoapDto find where find.color=:cl")
//@NamedQuery(name="updateNameById",query="update SoapDto upda set upda.name=:")

public class SoapDto {
	@Id
	private int id ;
	private String name;
	private String color;
	private int price;
	private String weight;
	
	
		
	

}
