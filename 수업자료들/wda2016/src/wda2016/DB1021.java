package wda2016;

import java.sql.*;


public class DB1021 {

	public static void main(String[] args) throws Exception {
		//1.드라이버 로딩
		//2.connection 객체 생성
		//--3.Statement 객체 생성
		//3.PreparedStatement  객체 생성
		
		//1.드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.Connection 객체 생성
		String url = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
	      String id = "s1201295";
	      String pw = "p1201295";
	      Connection conn = DriverManager.getConnection(url, id,pw);
	      //3.PrepareStatment 객체 생성
	      String sql = "delete books where TITLE=?";
	      PreparedStatement psmt = conn.prepareStatement(sql);
	      
	      //4.질의 실행을 위해 ? 값을 설정
	     // psmt.setInt(1, 3); // BOOK_ID 3번으로 설정
	      psmt.setString(1, "Head First SQL");
	      psmt.executeUpdate();
	      
	      //5.연결종료
	      psmt.close();
	      conn.close();
	}

}
