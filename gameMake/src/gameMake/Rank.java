package gameMake;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class Rank extends JFrame{

	public JTableModel2 model;
	public JTable jTable;
	public JPanel table;
	public JScrollPane scroll;
	String[][] source = null;
	
	public void viewScore() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
			String id = "s1201295";
			String pw = "p1201295";
			Connection conn = DriverManager.getConnection(url,id, pw);
	
			String string2 = "select count(*) from PLAYER";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(string2);
			rs.next();
			int rowNum = rs.getInt(1);
			
			String string1 = "select * from PLAYER order by score desc";
			rs = stmt.executeQuery(string1);
	
			int i=0;
			source = new String[rowNum][3];
			while(rs.next()) {
				source[i][0] = rs.getString("NAME")+"";
				source[i][1] = rs.getInt("SCORE")+"";
				source[i][2] = rs.getString("TIME")+"";
				i++;
			}
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model = new JTableModel2();
		model.setData(source);
		jTable = new JTable(model);
		this.getContentPane().add(jTable.getTableHeader());
		table.add(jTable);
		this.getContentPane().add(table);
	
	}

	Rank(){
		setSize(600, 500);
		setResizable(false);
	    ImageIcon scoreView = new ImageIcon	("../gameMake/img/festival.jpg");
		JPanel scoreBoard = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawImage(scoreView.getImage(), 0, 0, null);
                setOpaque(false);//그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
           }
       };
       
       	scoreBoard.setLayout(null);
 
		table = new JPanel();
		table.setBounds(0, 0, 584, 300);
		
		viewScore();
		scroll = new JScrollPane(table);
		scroll.setBounds(180,0,254,300);
		scoreBoard.add(scroll);
		//scroll.setBounds(0,0,160,160);

		setTitle("순위표 보기");

//		model.setValueAt("바뀐값",  0 , 0);
		
		JButton exit2 = new JButton("나가기");
		
		exit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				dispose();			
			}
		});
		
		exit2.setBounds(205, 334, 200, 23);
		scoreBoard.add(exit2);
		
		getContentPane().add(scoreBoard);
		setVisible(true);
	}
}


