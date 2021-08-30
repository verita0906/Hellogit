package java_erp.dto;

public class Employee {
	private int empNo;
	private String empName; 
	private Title title;
	private Employee manager;
	private int salary;
	private Department dept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empNo) {
		super();
		this.empNo = empNo;
			
	}


	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNol(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return String.format("[empNo = %s empNo = %s title = %s manager = %s salary = %s dept = %s]"
								, empNo
								, empName
								, title==null? "" : title.gettNo()
								, manager==null?"" : manager.getEmpNo()
								, salary
								, dept==null? "null" : dept.getDeptNo()
							);
	}
}
