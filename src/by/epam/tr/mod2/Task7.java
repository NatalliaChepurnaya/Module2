package by.epam.tr.mod2;

import java.util.Scanner;
import by.epam.tr.mod2.InputCheck;

public class Task7 {
	public static void main(String[] args){
		double a;
		double b;
		double c;
		double res;
		Scanner sc = new Scanner(System.in);
		
		a = InputCheck.getDouble(sc, "Enter a:");
		b = InputCheck.getDouble(sc, "Enter b:");
		
		if (a == b){
			System.out.println("End!");
		} else {
			c = InputCheck.getDouble(sc, "Enter c:");
			res = b + c;
			if (a < b) {
				res += a;
				System.out.println(res + "\nNew Year!");
			}
		}
			
	}

}
