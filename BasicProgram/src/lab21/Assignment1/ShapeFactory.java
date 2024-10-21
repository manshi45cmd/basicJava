package lab21.Assignment1;

public class ShapeFactory {
	
	
	// static method 
	public static Shape createShape(String shapeType) {
		
		if(shapeType == null) {
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("circle")) {
			return   new Circle();
		}
		else if(shapeType.equalsIgnoreCase("square")) {
			return new Squre();
		}
		
		else if(shapeType.equalsIgnoreCase("triangle")) {
			return new Triangle();
			
		}
		else {
			return null;
		}
		
		 
	}

}
