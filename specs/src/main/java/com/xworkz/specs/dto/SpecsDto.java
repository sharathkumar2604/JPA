package com.xworkz.specs.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="specs")
@NamedQuery(name="readAll",query="select dto from SpecsDto dto")
@NamedQuery(name="findByTypeAndPrice",query="select find from SpecsDto find where find.type=:ty and find.price=:pr")
@NamedQuery(name="findByName",query="select find from SpecsDto find where find.name=:nm")
@NamedQuery(name="updatePriceByName",query ="update SpecsDto up set up.price=:pr where up.name=:nm")
@NamedQuery(name="updateColorByPriceAndType",query="update SpecsDto up set up.color=:cl where up.price=:pr and up.type=:ty")
@NamedQuery(name="deleteByPriceAndColor",query="delete from SpecsDto dl where dl.price=:pr and dl.color=:cl")
@NamedQuery(name="deleteByNameAndId",query="delete from SpecsDto dl where dl.name=:nm and dl.id=:id")
public class SpecsDto {
	@Id
	private int id;
	private String name;
	private String color;
	private int price;
	private String type;
	
	
	
	
	

}
