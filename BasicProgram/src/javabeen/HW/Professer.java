package javabeen.HW;

public class Professer {
	
	private int professorId;
	private String professorName;
	private String department;
	
	public Professer(Department department2, String professorName, String i) {
		super();
		this.professorId = department2;
		this.professorName = professorName;
		this.department = i;
	}
	
	public Professer() {
		
	}

	public Professer(Department department2, String professorName2, int i) {
		// TODO Auto-generated constructor stub
	}

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(Department d) {
		this.department = d;
	}

	@Override
	public String toString() {
		return "Professer [professorId=" + professorId + ", professorName=" + professorName + ", department="
				+ department + "]";
	}

	
}
