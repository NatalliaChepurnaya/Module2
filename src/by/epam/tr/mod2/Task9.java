package by.epam.tr.mod2;

import java.util.Scanner;
import by.epam.tr.mod2.InputCheck;


public class Task9 {
	public static void main(String[] args){
		int num;
		int numEven = 0;
		int sum3 = 0;
		int numLess3 = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
				
		num = InputCheck.getInt(sc, "Enter the amount of elements:");	
		while (i < num){
			int n = InputCheck.getInt(sc, "Please enter " + (i + 1) + " element:");
			i += 1;
			if (n % 2 == 0){
				numEven += 1;
			}
			if (n % 3 == 0){
				sum3 += 1;
			}
			if (Math.abs(n) < 3){
				numLess3 += 1;
			}
		}
		
		System.out.println("Amount of even numbers: " + numEven
				+ "\nMultiples of 3 amount is " + sum3
				+ "\nAmount of numbers less than 3: " + numLess3);
		
	}
}
