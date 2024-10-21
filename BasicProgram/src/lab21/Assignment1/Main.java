package lab21.Assignment1;

public class Main {
	public static void main(String[] args) {
		
		ShapeFactory sf = new ShapeFactory();
		
		Shape circle = ShapeFactory.createShape("circle");
		circle.draw();
		
		Shape  squre = ShapeFactory.createShape("squre");
		squre.draw();
		
		Shape triangle  = ShapeFactory.createShape("triangle");
		triangle.draw();
		 
		
	}

}
