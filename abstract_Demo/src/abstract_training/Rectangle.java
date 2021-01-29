package abstract_training;

public class Rectangle extends Shape {
	int a;
	
	public Rectangle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double Area() {
		
		a=x*y;
		System.out.println(" Area of Rectangle is : "+a);
		return a;
	}



	
}
