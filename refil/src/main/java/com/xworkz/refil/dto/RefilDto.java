package com.xworkz.refil.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="refil")
@NamedQuery(name="readAll",query="select dt from RefilDto dt")
@NamedQuery(name="findnamebyidandcolor",query="select dt from RefilDto dt where dt.name=:nm and dt.id=:id and dt.color=:cl")
public class RefilDto {
	@Id
	private int id;
	private String name;
	private String color;
	private int price;
	private String type;
	

}
