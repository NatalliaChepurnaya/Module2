package by.epam.tr.mod2;

import java.util.Scanner;
import by.epam.tr.mod2.InputCheck;

public class Task8 {
	public static void main(String[] args){
		double a;
		double b;
		double c;
		double res1;
		double res2;
		String res3 = "MU";
		Scanner sc = new Scanner(System.in);
		
		a = InputCheck.getDouble(sc, "Enter a:");
		b = InputCheck.getDouble(sc, "Enter b:");
		
		if (a == b){
			System.out.println("New Year!");
		} else {
			c = InputCheck.getDouble(sc, "Enter c:");
			res1 = a + b + c;
			res2 = a * a + b * b;
			System.out.println(res1 + "\n" + res2  + "\n" + res3);
			}
		}		
	}
