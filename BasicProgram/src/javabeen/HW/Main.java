package javabeen.HW;

public class Main {

	public static void main(String[] args) {
		 
		University[] arr = new University[5];
		
		Department d = new Department();
		d.setDepartmentId(123);
		d.setDepartmentname("IT");
		
	 Professer p1 = new Professer();
	 p1.setDepartment(d);
	 
	 p1.setProfessorName("Mohan");
		p1.setProfessorId(1231); 

      arr[0] = p1;
		
		Professer p2 = new Professer(new Department(1231,"IT"),"Nea",1232);
		
		arr[1] = p2;
		
		
		 
	
	}

}
 