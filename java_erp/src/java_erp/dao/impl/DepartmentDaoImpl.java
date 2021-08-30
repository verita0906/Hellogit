package java_erp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java_erp.dao.DepartmentDao;
import java_erp.dao.DepartmentDaoTest;
import java_erp.dto.Department;
import java_erp.util.JdbcUtil;

//Impl은 무조건 싱글톤패턴 구현이 좋음


public class DepartmentDaoImpl implements DepartmentDao{
	private static final DepartmentDaoImpl instance = new DepartmentDaoImpl();

	public static DepartmentDaoImpl getInstance() {
		return instance;
	}
	
	private DepartmentDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ArrayList<Department> selectDepartmentByAll() {
		String sql = "select deptno, deptname, floor from department";
		ArrayList<Department> list = null;
		try( 
			Connection con = JdbcUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);	
			ResultSet rs = pstmt.executeQuery();
			)
		{
			list = new ArrayList<Department>();
			while (rs.next()) {
				list.add(getDeparment(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}



	
	@Override
	public Department selectDepartmentByNo(Department department) {
		String sql = "select deptno, deptname, floor from department WHERE deptno = ?"; 
		try(
			Connection con = JdbcUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			)
			{
				pstmt.setInt(1, department.getDeptNo());
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						return getDeparment(rs);
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}

			
	private Department getDeparment(ResultSet rs) throws SQLException {
		// deptno, deptname, floor
		int deptNo = rs.getInt("deptno");
		String deptName = rs.getString("deptname");
		int floor = rs.getInt("floor");
		Department newDept = new Department(deptNo, deptName, floor);
		return newDept;
	}			
			
			
	@Override
	public int insertDepartment(Department department) {
		String sql = "insert into department values(?, ?, ?)";
		try
		(
			Connection con = JdbcUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
		)
		{	
			pstmt.setInt(1, department.getDeptNo());
			pstmt.setString(2, department.getDeptName());
			pstmt.setInt(3, department.getFloor());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override	
	public int updateDepartment(Department department) {
		String sql = "update department set deprname = '?' where deptno = ?";
		try
		(
			Connection con = JdbcUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);	
		)
		{
			pstmt.setString(1, department.getDeptName());
			pstmt.setString(2, department.getDeptName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteDepartment(Department department) {
		String sql = "delete from department where deptno = ?";
		try
		(
			Connection con = JdbcUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
		)
		{
			pstmt.setInt(1, department.getDeptNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}


/*
 * 1. DB 접속(시간 많이 걸림) <-> Connection Pool(시간이 적게 걸림)
 * 2. SQL을 Database에 맞는 명령문으로 변경(스트링을 명령문으로)
 * (3. SQLdptj '?'를 입력 매개변수 값으로 치환해서 SQL 명령문을 완성)
 * 4. SQL명령문 실행(select : executeQury / insert, update, delete : executeUate_
 * (5. 만약 executeQury일 경우 : SQL결과(ResultSet)를 클래스로 변환)
 */				
// TODO Auto-generated method stub

