package java_erp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

import java_erp.dto.Employee;
import java_erp.util.JdbcUtil;

public class EmployeeImpl implements EmployeeDao {
	private static final EmployeeImpl instance = new EmployeeImpl();
	
	@Override
	public ArrayList<Employee> selectEmployeeAll() {
		String sql = "select empno, empname, title, manager, salary, dno from employee";
		ArrayList<Employee> list = null; 
		try
		(
			Connection con = JdbcUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		)
		{	ArrayList<Employee> list = new ArrayList<>();
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String empname = rs.getString("empno");
				String title = rs.getString("title");
				String manager = rs.getString("manager");
				int salary = rs.getInt("salary");
				int dno = rs.getInt("dno");
			}
			return list;
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		return null;
	}

	
	
	
	@Override
	public Employee selectEmployeeByNO(Employee emp) {
		String sql = "select empno, empname, title, manager, salary, dno from employee where empno = ?";
		try
		(	Connection con = JdbcUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
		)
		{
			pstmt.setInt(1, emp.getEmpNo());
			pstmt.setString(2, emp.getEmpName());
			pstmt.setString(3, emp.getTitle().gettName());
			pstmt.setString(4, emp.getManager().getEmpName());
			pstmt.setInt(5, emp.getSalary());
			pstmt.setInt(6, emp.
			return pstmt.executeUpdate();
		} 
		catch(SQLException e) { 
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertEmployee(Employee emp) {
		//empno, empname, title, manager, salary, dno
		String sql = "INSERT INTO employee values(?, ?, ?, ?, ?, ?)";
		try
		(	Connection con = JdbcUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
		)
		{
			// 값이 null인 겨웅를 감안해야 -> title, manager, dno
			pstmt.setInt(1, emp.getEmpNo());
			pstmt.setString(2, emp.getEmpName());

			try {
			pstmt.setInt(3, emp.getTitle()==null ? null : emp.getEmpNo());
			} catch(NullPointerException e) {
				pstmt.setNull(3, Types.INTEGER);
			}
			try {
			pstmt.setInt(5, emp.getSalary());
			} catch(NullPointerException e) {
				pstmt.setNull(5, Types.INTEGER);
			}
			try {
			pstmt.setInt(6, emp.getDept()==null? null : emp.getDept().getDeptNo());
			return pstmt.executeUpdate();
			} catch(NullPointerException e) {
				pstmt.setNull(6, Types.INTEGER);
			}
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}


	@Override
	public int updateEmployee(Employee emp) {
		String sql = "update employee"
					+ 	"set empname = ?, salary = ?, title = ?, manager = ?, dno = ?"
					+ "where empno = ?";	
		try
		(
			Connection con = JdbcUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
		)	
		{
			pstmt.setString(1, emp.getEmpName());
			pstmt.setInt(2, emp.getSalary());
			try {
				pstmt.setInt(3, emp.getTitle().gettNo());
			} catch(NullPointerException e) {
				pstmt.setNull(3, Types.INTEGER);
			}
			try {
				pstmt.setInt(5, emp.getDept());
			} catch(NullPointerException e) {
				pstmt.setNull(5, Types.INTEGER);
			}
			try {
				pstmt.setInt(6, emp.getEmpNo());
			} catch(NullPointerException e) {
				pstmt.setNull(6, Types.INTEGER);
			}
			System.out.println(pstmt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();			
		
		return 0;
	}

		
	@Override
	public int deleteEmployee(Employee emp) {
		String sql = "delete from employee where empno = ?";
		try
		(
			Connection con = JdbcUtil.getConnection();
			PreparedStatement 
			pstmt.setInt
		)
		{
		}
		}
		return 0;
	}

}
