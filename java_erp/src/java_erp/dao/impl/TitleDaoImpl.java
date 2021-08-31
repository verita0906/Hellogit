package java_erp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java_erp.dao.TitleDao;
import java_erp.dto.Title;
import java_erp.util.JdbcUtil;

public class TitleDaoImpl implements TitleDao {
	private static final TitleDaoImpl instance = new TitleDaoImpl();

	public static TitleDaoImpl getInstance() {
		return instance;
	}

	private TitleDaoImpl() {

	}

	@Override
	public ArrayList<Title> selectTiyleByAll() {
		String sql = "select tno, tname from title";
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {
			ArrayList<Title> list = new ArrayList<Title>();
			while (rs.next()) {
				int tNo = rs.getInt("tno");
				String tName = rs.getString("tname");
				list.add(new Title(tNo, tName));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectTitleByNo(Title title) {
		String sql = "select from title where tno = ?";
		try
		(
				Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
		)
		{
				pstmt.setInt(1, title.gettNo());
				pstmt.setString(2, title.gettName());
				return pstmt.executeUpdate();
		} 	
			catch (SQLException e) {
				e.printStackTrace();
				}
		return 0;
	}

	@Override
	public int insertTitle(Title title) {
		String sql = "insert into title where tno = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
				return pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				}
		return 0;
	}

	@Override
	public int updateTitle(Title title) {
		String sql = "update set title = ? where tno = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
				return pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				}
		return 0;
	}

	@Override
	public int deleteTitle(Title title) {
		String sql = "delete from title where tno = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
				return pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				}
		return 0;
		
		
		
		
	
	}

}
