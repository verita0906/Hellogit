package java_erp.dao.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java_erp.dto.Employee;
import java_erp.dto.Title;

public class EmployeeDaoTest {
	private EmployeeDao dao;
	
	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test01InsertEmployee1() {
		System.out.println("test01InsertEmployee1()");
		Employee newEmp = new Employee(1010, "신혜리", null, null, 2500000, null);
		int res = dao.insertEmployee(newEmp);
		Assert.assertEquals(1, res);
	}

	
	@Test
	public void test02InsertEmployee1() {
		System.out.println("test02InsertEmployee1()");
		Title title = new Title(2);
		Employee newEmp = new Employee(1010, "신혜리1", title, null, 2500000, null);
		int res = dao.insertEmployee(newEmp);
		Assert.assertEquals(1, res);
	}
	
	
	@Test
	public void test03InsertEmployee() {
		System.out.println("test03InsertEmployee1()");
		Title title = new Title(2);
		Employee manager = new Employee(4377);
		Employee newEmp = new Employee(1012, "신혜리2", title, manager, 2500000, null);
		int res = dao.insertEmployee(newEmp);
		Assert.assertEquals(1, res);
	}
	
	
	@Test
	public void test04InsertEmployee() {
		System.out.println("test04InsertEmployee1()");
		Title title = new Title(2);
		Employee manager = new Employee(4377);
		Employee newEmp = new Employee(1013, "신혜리3", title, manager, 2500000, null);		
		int res = dao.insertEmployee(newEmp);
		Assert.assertEquals(1, res);
	}

////////////////////////////////////////////////////////	

	@Test
	public void test01updateEmployee() {
		System.out.println("test01updateEmployee()");
		Employee newEmp =
		dao.insertEmployee(newEmp);		
		
		//수정
		newEmp.setEmpName("최명기");
		newEmp.setEmpSalary(1500000);
		int res = dao.updateEmployee(newEmp);
		Assert.assertEquals(1, res);		
	}

	
	@Test
	public void test02updateEmployee() {
		System.out.println("test02updateEmployee()");
		Title
		
		//수정
		newEmp.setEmpName("최명기");
		newEmp.setEmpSalary(1500000);
		int res = dao.updateEmployee(newEmp);
		Assert.assertEquals(1, res);		
	}
	
	
	@Test
	public void testdeleteEmployee() {
		System.out.println("testDleteEmployee()");
		Employee newEmp = new Employee(1010, "신혜리", null, null, 2500000, null);
		dao.insertEmployee(newEmp);
		
		int res = dao.deleteEmployee(newEmp);
		Assert.assertEquals(1, res);
	}
	
}
