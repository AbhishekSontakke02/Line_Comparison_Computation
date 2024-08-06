package lineCompare;

import java.util.Scanner;

public class Line {
	static Scanner sc = new Scanner(System.in);
	static double x1,y1,x2,y2;
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation Program!");
		input();
		double result =calculateLength();
		System.out.println("Length of Line : "+ result);
	}
	
	private static void input() {
		System.out.println("Enter coordinates of the first point (x1, y1): ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		System.out.println("Enter coordinates of the first point (x1, y1): ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble(); 
	}
	
	private static double calculateLength() {
		return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
	}
	
}
