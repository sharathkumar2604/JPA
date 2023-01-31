package com.xworkz.chocolate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="chocolate")
@NamedQuery(name="readAll",query ="select re from ChocolateDto re")
@NamedQuery(name="findbycolorandweight",query="select fi from ChocolateDto fi where fi.color=:cl and fi.weight=:we")
@NamedQuery(name="findbypriceandname",query="select fi from ChocolateDto fi where fi.price=:pr and fi.name=:nm")
@NamedQuery(name="updateweightbynameandcolor",query="update ChocolateDto fi set fi.weight=:we where fi.name=:nm and fi.color=:cl")
@NamedQuery(name="updatenamebyidandweight",query="update ChocolateDto fi set fi.name=:nm where fi.id=:id and fi.weight=:we")
@NamedQuery(name="deletebycolorandname",query="delete from ChocolateDto fi where fi.color=:cl and fi.name=:nm")

public class ChocolateDto {
@Id
	private int id;
	private String name;
	private String color;
	private int price;
	private String weight;
	
}
