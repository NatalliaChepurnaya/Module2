package by.epam.tr.mod2;

import java.util.Scanner;
import by.epam.tr.mod2.InputCheck;

public class Task11 {
	public static void main(String[] args){
		int num; //Number of elements
		int res1 = 0; //Number of elements falling under the 1st rule
		int res2 = 0; //Number of elements falling under the 2nd rule		
		int gr = 15; //1st rule: greater than
		int less = 2; //1st rule: less than
		int del = 5; //2nd rule: delimiter
		int rem = 4; //2nd rule: remainder		
		int i = 0; //Counter
		Scanner sc = new Scanner(System.in);
				
		num = InputCheck.getInt(sc, "Enter the amount of elements:");	
		while (i < num){
			int n = InputCheck.getInt(sc, "Please enter " + (i + 1) + " element:");
			i += 1;
			if (n > gr || n < less){
				res1 += 1;
			}
			if (n % del == rem){
				res2 += 1;
			}
		}
		
		System.out.println("Number of elements greater than " + gr 
				+ " or less than " + less + ": " + res1
				+ "\nNumber of multiples of " + del
				+ " with remainder" + rem + ": "+ res2);
		
	}
}
