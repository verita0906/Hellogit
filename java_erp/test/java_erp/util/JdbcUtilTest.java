package java_erp.util;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Assert;
import org.junit.Test;

public class JdbcUtilTest {

	@Test
	public void testGetConnection() {
		System.out.println("testGetConnection()");
		Connection con = JdbcUtil.getConnection();
		Assert.assertNotNull(con);
	}

}
