package by.epam.tr.mod2;
import by.epam.tr.mod2.InputCheck;

import java.util.Scanner;

public class Task12 {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		int sum = 0; //Sum of elements
		
		for (int i = 0; i < args.length; i++){
			Scanner sc = new Scanner(args[i]);
			if(!sc.hasNextInt()) {
				System.out.println("Error! All elements should be integer");
				sc.next();
				return;
			} else {
				sum += InputCheck.getInt(sc,"");
			}				
		}
		System.out.println("Sum of elements: " + sum);

	}

}
