package java_erp.dao;

import java_erp.dto.Department;
import java_erp.dto.Employee;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee(1004, "천사", null, null, 1500000, null);
		Employee emp1 = new Employee(1004, "천사", new Title(1), null, 1500000, null);
		Employee emp2 = new Employee(1004, "천사", new Title(1), new Employee(1003), 1500000, null);
		Employee emp3 = new Employee(1004, "천사", new Title(1), new Employee(1003), 1500000, new Department(1));

		
		System.out.println("emp" + emp);
		System.out.println();
		System.out.println("emp" + emp1);
		System.out.println();
		System.out.println("emp" + emp2);
		System.out.println();
		System.out.println("emp" + emp3);
		System.out.println();

		
		Title title = new Title(1, "과장");

		Employee manager = new Employee(1003, "이성래", new Title(1), null, 4500000, 1);
		Department dept = new Department(2, "영업", 10);
		Employee newEmp = new Employee(1004, "현빈", title, manager, 2000000, dept);		
		
		
		// 1. emp3의 직책
		Title emp3Title = newEmp.getTitle();
		String titleName = newEmp.getTitle().gettName();
		
		System.out.println("직책 : %s%n", emp3Title);
		System.out.println("직책명 : %s%n", titleName);
	}
}
