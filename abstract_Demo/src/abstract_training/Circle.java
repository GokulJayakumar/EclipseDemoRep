package abstract_training;

public class Circle extends Shape {
	public Circle(int x) {
		super(x);
		
	}



	double a;

	
	@Override
	public double  Area() {
	a=Math.PI* x*x;
	System.out.println("Area of a circle is : "+a);
	return a;
		
	}

	

}
