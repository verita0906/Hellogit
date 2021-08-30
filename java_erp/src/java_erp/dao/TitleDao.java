package java_erp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import java_erp.dto.Title;
import java_erp.util.JdbcUtil;

public interface TitleDao {
	ArrayList<Title> selectTiyleByAll();
	Title selectTitleByNo(Title title);

	
	
	
	
	int insertTitle(Title title);
	String sql = "insert into title values(?, ?)"
			try(Connection con = JdbcUtil.getConnection();
					PreparedStatement = con.prepareStatement(sql);){
				pstmt.setInt(1, title.gettName)
			}
			return 0;
	int updateTitle(Title title);
	
	public int deleteTitle(Title title);
	String sql = "delete from title where tno(?, ?)"
			try(Connection con = JdbcUtil.getConnection();
					PreparedStatement = con.prepareStatement(sql);){
				pstmt.setInt(1, title.gettName)	
				
				
	public void test05DeleteTitle)_ 
}
