package gameMake;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Rank extends JFrame{
	String[][] source = null;
	Rank(){
		setSize(200,300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//JTable 컴포넌트를 만들자
		//먼저 데이터 모델의 객체부터 만든다.
		//모델객체를 만들기 위해서는 DB로부터 테이터를  가져와야 한다.
		//1.드라이버 로딩
 		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
 		
 		//2.Connection 객체 생성
 		String url = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
 	      String id = "s1201295";
 	      String pw = "p1201295";
 	      Connection conn = DriverManager.getConnection(url, id,pw);
 	      //books 테이블의 행의 개수를 가져온다
 	     String string2 = "select count(*) from PLAYER";
 	    Statement stmt = conn.createStatement();
 	    ResultSet rs = stmt.executeQuery(string2);
 	    rs.next();
	     int rowNum = rs.getInt(1);
 	    //books 테이블의 모든 데이터를 가져온다.
 	      
 	      String string1=  "select * from PLAYER";
 	      stmt = conn.createStatement();
 	     rs = stmt.executeQuery(string1);
 	     
 	      //데이터를 String[][] source 배열에 넣는다.
 	     source = new String[rowNum][3];
 	     int i = 0;
 	     while (rs.next()){
 	    	source [i][0] = rs.getString("NAME");
 	    	source [i][1] = rs.getString("TIME");
 	    	source [i][2] = rs.getInt("SCORE")+"";
 	    	i++;
 	     }
 	      
 	      //5.연결종료
 	      stmt.close();
 	      conn.close();
 	} catch(Exception e1)
{
	e1.printStackTrace();
}
		JTableModel2 model = new JTableModel2();
		model.setData(source);
		JTable jTable = new JTable(model);
		

		//jframe1.add(jTable);
		add(new JScrollPane(jTable));
		model.setValueAt("바뀐값",0, 0);
		setVisible(true);
	}
}

