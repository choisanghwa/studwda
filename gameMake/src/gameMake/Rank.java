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
		//JTable ������Ʈ�� ������
		//���� ������ ���� ��ü���� �����.
		//�𵨰�ü�� ����� ���ؼ��� DB�κ��� �����͸�  �����;� �Ѵ�.
		//1.����̹� �ε�
 		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
 		
 		//2.Connection ��ü ����
 		String url = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
 	      String id = "s1201295";
 	      String pw = "p1201295";
 	      Connection conn = DriverManager.getConnection(url, id,pw);
 	      //books ���̺��� ���� ������ �����´�
 	     String string2 = "select count(*) from PLAYER";
 	    Statement stmt = conn.createStatement();
 	    ResultSet rs = stmt.executeQuery(string2);
 	    rs.next();
	     int rowNum = rs.getInt(1);
 	    //books ���̺��� ��� �����͸� �����´�.
 	      
 	      String string1=  "select * from PLAYER";
 	      stmt = conn.createStatement();
 	     rs = stmt.executeQuery(string1);
 	     
 	      //�����͸� String[][] source �迭�� �ִ´�.
 	     source = new String[rowNum][3];
 	     int i = 0;
 	     while (rs.next()){
 	    	source [i][0] = rs.getString("NAME");
 	    	source [i][1] = rs.getString("TIME");
 	    	source [i][2] = rs.getInt("SCORE")+"";
 	    	i++;
 	     }
 	      
 	      //5.��������
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
		model.setValueAt("�ٲﰪ",0, 0);
		setVisible(true);
	}
}

