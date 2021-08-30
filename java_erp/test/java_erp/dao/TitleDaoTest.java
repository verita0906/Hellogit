package java_erp.dao;

import static org.junit.Assert.*;
import java.sql.Connection;
import org.junit.Assert;
import org.junit.Test;
import java_erp.util.JdbcUtil;

public class TitleDaoTest {

	
	@Test
	public void testSelectTiyleByAll() {
		System.out.println("testSelectTiyleByAll()");
		Connection con = JdbcUtil.getConnection();
		Assert.assertNotNull(con);
	}

	
	@Test
	public void testSelectTitleByNo() {
		System.out.println("testSelectTitleByNo()");
		Connection con = JdbcUtil.getConnection();
		Assert.assertNotNull(con);
	}

	
	@Test
	public void testInsertTitle() {
		System.out.println("testInsertTitle()");
		Connection con = JdbcUtil.getConnection();
		Assert.assertNotNull(con);
		
	}

	
	@Test
	public void testUpdateTitle() {
		System.out.println("testInsertTitle()");
		Connection con = JdbcUtil.getConnection();
		Assert.assertNotNull(con);
	}

	
	@Test
	public void testDeleteTitle() {
		System.out.println("testInsertTitle()");
		Connection con = JdbcUtil.getConnection();
		Assert.assertNotNull(con);
		

	}
}
