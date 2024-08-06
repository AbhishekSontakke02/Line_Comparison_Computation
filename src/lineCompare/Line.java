package lineCompare;

import java.util.Scanner;

public class Line {
	static Scanner sc = new Scanner(System.in);
	static double x1,y1,x2,y2,x3,y3,x4,y4;
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation Program!");
		input();
		
		double line1 =calculateLength(x1,y1,x2,y2);
		System.out.println("Length of Line 1 : "+ line1);
		double line2 =calculateLength(x3,y3,x4,y4);
		System.out.println("Length of Line 2 : "+ line2);
		
		int comparison = Double.compare(line1, line2);
		if( comparison > 0) {
			System.out.println("The Line 1 is Longer than Line 2!");
		}
		else if(comparison < 0) {
			System.out.println("The Line 1 is shorter than Line 2!");
		}
		else {
			System.out.println("Both Lines are Equal");
		}
	}
	
	private static void input() {
		System.out.println("Enter coordinates of the first point (x1, y1): ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		System.out.println("Enter coordinates of the first point (x2, y2): ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble(); 

		System.out.println("Enter coordinates of the first point (x3, y3): ");
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		System.out.println("Enter coordinates of the first point (x4, y4): ");
		x4 = sc.nextDouble();
		y4 = sc.nextDouble(); 
		
	}
	
	private static double calculateLength(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
	}
	
}
