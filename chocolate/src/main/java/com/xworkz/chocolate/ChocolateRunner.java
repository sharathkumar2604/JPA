package com.xworkz.chocolate;

import java.util.Arrays;
import java.util.List;

import com.xworkz.chocolate.dto.ChocolateDto;
import com.xworkz.chocolate.service.ChocolateService;
import com.xworkz.chocolate.service.ChocolateServiceImpl;

public class ChocolateRunner {

	public static void main(String[] args) {
		ChocolateService service = new ChocolateServiceImpl();

		ChocolateDto dto1 = new ChocolateDto(1, "munch", "brown", 20, "15grams");
		ChocolateDto dto2 = new ChocolateDto(2, "perk", "white", 25, "35grams");
		ChocolateDto dto3 = new ChocolateDto(3, "kitkat", "red", 39, "25grams");
		ChocolateDto dto4 = new ChocolateDto(4, "silk", "black", 23, "10grams");
		ChocolateDto dto5 = new ChocolateDto(5, "cadburry", "marron", 33, "5grams");
		ChocolateDto dto6 = new ChocolateDto(6, "eclare", "purple", 24, "50grams");
		ChocolateDto dto7 = new ChocolateDto(7, "waffors", "white", 21, "22grams");
		ChocolateDto dto8 = new ChocolateDto(8, "hotchock", "mixbrown", 44, "24grams");
		ChocolateDto dto9 = new ChocolateDto(9, "treat", "orange", 60, "14grams");

		System.out.println("=======================saveAll===============================");

          //List<ChocolateDto> list = Arrays.asList(dto1,dto2,dto3,dto4,dto5,dto6,dto7,dto8,dto9);
         //service.saveAll(list);

		System.out.println("========================readAll==========================");

           //for (ChocolateDto li : service.readAll()) {
          //	System.out.println(li);}

		System.out.println("==================findByColorAndWeight ====================================");

          System.out.println(service.findByColorAndWeight("purple","50grams"));

		System.out.println("==================findByPriceAndName ====================================");

          //System.out.println(service.findByPriceAndName(44,"hotchock"));

		System.out.println("-=====================updateWeightByNameAndColor-===========================");

         //System.out.println(service.updateWeightByNameAndColor("25grams", "waffors", "white"));

		System.out.println("======================updateNameByIdAndWeight=======================");

//         System.out.println(service.updateNameByIdAndWeight("chchcj", 8,"24grams" ));

		System.out.println("==========================deletebycolorandname===================");

		System.out.println(service.deleteBycolorAndName("black", "silk"));

	}

}
