package javabeen.HW;

public class Department {
	
	private int departmentId;
	private String departmentname;
	public Department(int departmentId, String departmentname) {
		super();
		this.departmentId = departmentId;
		this.departmentname = departmentname;
	}
	public Department() {
		// TODO Auto-generated constructor stub
	};
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentname=" + departmentname + "]";
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	
	

}
