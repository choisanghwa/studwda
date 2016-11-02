package wda2016;

import java.sql.*;


public class DB1021 {

	public static void main(String[] args) throws Exception {
		//1.����̹� �ε�
		//2.connection ��ü ����
		//--3.Statement ��ü ����
		//3.PreparedStatement  ��ü ����
		
		//1.����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.Connection ��ü ����
		String url = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
	      String id = "s1201295";
	      String pw = "p1201295";
	      Connection conn = DriverManager.getConnection(url, id,pw);
	      //3.PrepareStatment ��ü ����
	      String sql = "delete books where TITLE=?";
	      PreparedStatement psmt = conn.prepareStatement(sql);
	      
	      //4.���� ������ ���� ? ���� ����
	     // psmt.setInt(1, 3); // BOOK_ID 3������ ����
	      psmt.setString(1, "Head First SQL");
	      psmt.executeUpdate();
	      
	      //5.��������
	      psmt.close();
	      conn.close();
	}

}
