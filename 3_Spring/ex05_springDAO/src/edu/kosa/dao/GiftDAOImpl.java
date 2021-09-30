package edu.kosa.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class GiftDAOImpl extends GiftDAO {

	@Override
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@kosa3.iptime.org:50121:orcl",
				"bejpark",
				"oracle");
		return conn;
	}
	
	/*
	 * 1. 드라이버 로드
	 * 2. connect&open
	 * 3. 사용(DML)
	 * 4. close
	 */

}
