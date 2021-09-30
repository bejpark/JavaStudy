package edu.kosa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class GiftDAO {
	//DB연결 관련 메소드

	public abstract Connection getConnection() throws Exception;
	
	//insert
	
	//selectAll
	public void selectAll() throws Exception{
		Connection conn=getConnection();
		//3. 사용(DML) - Statement, PreparedStatement
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
		
		
		System.out.println("GNO \t GName \t\t 최하 \t 최고");
		while(rs.next()) {
			int gno=rs.getInt("gno"); //rs.getXXX(index); or rs.getXXX("필드명");
			String gname=rs.getString(2);
			int gstart=rs.getInt("g_start");
			int gend=rs.getInt("g_end");
			
			
			System.out.println(gno+"\t"+gname+"\t\t"+gstart+"\t"+gend);
		}//while end
	}//selectAll end
	//select - 조건에 맞는것 select하기(gno)
	
	//update
	
	//delete

}
