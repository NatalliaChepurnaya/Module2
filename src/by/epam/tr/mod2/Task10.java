package by.epam.tr.mod2;

import java.util.Scanner;
import by.epam.tr.mod2.InputCheck;

public class Task10 {
	public static void main(String[] args){
		int num;
		int numEven = 0;
		int grThan15 = 0;
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
				
		num = InputCheck.getInt(sc, "Enter the amount of elements:");	
		while (i < num){
			double n =  InputCheck.getDouble(sc, "Enter element #" + (i + 1) + ":");
			if (n >= 0){
				n = Math.floor(n);
			} else {
				n = Math.ceil(n);
			}
			if (n % 2 == 0){
				numEven += 1;
			}
			if (n > 15){
				grThan15 += 1;
			}
			i += 1;
		}
		
		System.out.println("Amount of even numbers: " + numEven
				+ "\nAmount of numbers greater than 15: " + grThan15);
		
	}

}
