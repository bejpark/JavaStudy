package edu.kosa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import edu.kosa.model.GiftVO;

public abstract class GiftDAO {
	//DB연결 관련 메소드

	public abstract Connection getConnection() throws Exception;
	
	//insert
	public void insert(GiftVO vo) throws Exception{
		Connection conn = getConnection();
		String sql = "insert into gift(gno,gname,g_start,g_end) values(?,?,?,?)";
		//Statement stmt = conn.createStatement();
		//int result = stmt.executeUpdate(sql);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,vo.getGno());
		pstmt.setString(2,vo.getGname());
		pstmt.setInt(3,vo.getG_start());
		pstmt.setInt(4,vo.getG_end());
		
		int result = pstmt.executeUpdate();
		
		System.out.println(result+"입력 성공했습니다.");
		pstmt.close();
		//stmt.close();
		conn.close();
	}
	
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
	public GiftVO select(int gno) throws Exception{
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM GIFT WHERE GNO=?");
		
		ps.setInt(1, gno);
		ResultSet rs = ps.executeQuery();
		rs.next();
		GiftVO vo = new GiftVO();
		vo.setG_end(rs.getInt("g_end"));
		vo.setG_start(rs.getInt("g_start"));
		vo.setGname(rs.getString("gname"));
		vo.setGno(gno);
		return vo;	
	}
	//update
	public void update(GiftVO vo) throws Exception{
		Connection conn = getConnection();
		String sql = "update gift set gname = ?, g_start = ?, g_end = ? WHERE GNO=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,vo.getGname());
		pstmt.setInt(2,vo.getG_start());
		pstmt.setInt(3,vo.getG_end());
		pstmt.setInt(4,vo.getGno());
		int result = pstmt.executeUpdate();
		System.out.println(result+"개의 gno : "+vo.getGno()+" update 성공했습니다.");
		pstmt.close();
		conn.close();
	}
	//delete
	public void delete(int gno) throws Exception{
		Connection conn = getConnection();
		String sql = "delete from gift where gno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,gno);
		int rs = pstmt.executeUpdate();
		System.out.println(rs+"개의 데이터 삭제 성공했습니다.");
		pstmt.close();
		conn.close();
	}

}
