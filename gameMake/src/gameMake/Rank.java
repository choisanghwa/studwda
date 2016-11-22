package gameMake;


import java.sql.*;

import javax.swing.*;

public class Rank extends JFrame{
	public Rank(){
		setTitle("rank");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		String name;
		Date time;
		int score;
		
		Connection con = makeConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PLAYER");
				while(rs.next()){
					name = rs.getString("NAME");
					time = rs.getDate("TIME");
					score = rs.getInt("SCORE");
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	//DB드라이버를 적재하고 연결
	private Connection makeConnection() {
		String url = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
 	      String id = "s1201295";
 	      String pw = "p1201295";
 	     Connection con = null;
 	     try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id,pw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
