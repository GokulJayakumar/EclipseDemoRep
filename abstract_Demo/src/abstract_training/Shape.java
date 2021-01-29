package abstract_training;

public abstract class Shape {
	protected int x,y;
	public abstract double Area();
	
	public Shape(int x, int y) {
	
		this.x = x;
		this.y = y;
	}
	public Shape(int x) {
		
		this.x = x;
		
	}
	

	
}
