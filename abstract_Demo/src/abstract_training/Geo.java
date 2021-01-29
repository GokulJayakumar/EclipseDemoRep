package abstract_training;

import java.util.Scanner;

public class Geo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Shape obj[] = new Shape[2];
		System.out.println("Enter the Raduis : ");
		int r=sc.nextInt();
		obj[0] = new Circle(r);
		obj[0].Area();
		System.out.println("******************************");
		System.out.println("Enter the length and breadth");
		int x=sc.nextInt();
		int y= sc.nextInt();
		obj[1]=new Rectangle(x, y);
		obj[1].Area();
		
		
		

	}

}
