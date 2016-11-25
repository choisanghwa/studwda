package gameMake;


import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

public class JFgood extends JPanel{
		JButton restart,exits;
		static int restart1=0;
		ImageIcon bgimg4;
		ImageIcon OTLimg;
		JLabel OTLim;
		//생성자 2
		//정답일때 생성되는 생성자
		public JFgood(setgetclass name1, JFGame gmmain){
			
			bgimg4 = new ImageIcon("../gameMake/img/solutio_1.jpg");
			MyListener listener = new MyListener(gmmain,name1);
			restart =new JButton("시작페이지로");
			exits = new JButton("그만두기");
		
		
			//시작페이지 버튼,그만두기  액션
			restart.addActionListener(listener);
			add(restart);
			exits.addActionListener(listener);
			add(exits);
			//클릭하면 DB에 저장된다.
		
			//배치관리자
			restart.setBounds(530, 350, 200, 60);
			exits.setBounds(530, 430, 200, 60);
	}

	//----------------------------------------------------------------------------------------------------------
	
		//생성자 2
		// 틀릴때 생성된다.
		public JFgood(setgetclass name1, PaGam games,PaMain main2, JFGame gmmain) {
			bgimg4 = new ImageIcon("../gameMake/img/solutio_2.jpg");
			restart =new JButton("다시시작");
			exits = new JButton("그만두기");
			OTLimg = new ImageIcon("../gameMake/img/otl.png");
			OTLim = new JLabel(OTLimg);
			add(OTLim);
			add(restart);
			add(exits);
		
			//다시시작 페이지 버튼 무명클래스
				restart.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == restart){
							++restart1;
							name1.setRestartss(restart1);
							
							setVisible(false);
							PaGam games = new PaGam(main2, gmmain, name1);
							games.setLayout(null);
							gmmain.add(games);
							
							games.setVisible(true);
							
							
							
						}
					}
				});
				//다시시작 페이지 무명클래스 끝
				
				//끝내기
				exits.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						gmmain.dispose();
						
					}
				});
				
				//배치 관리자
				OTLim.setBounds(100, 200, 410, 328);
				restart.setBounds(530, 350, 200, 60);
				exits.setBounds(530, 430, 200, 60);
	}

		
//----------------------------------------------------------------------------------------------------------
		
		//정답시 클릭 이벤트
	private class MyListener implements ActionListener{
		JFGame gmmain2;
		String nameget;
		int restarts;
	
		public MyListener(JFGame gmmain, setgetclass name1) {
			gmmain2 = gmmain;
			nameget = name1.getNamse();
			restarts = name1.getRestartss();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			//시작페이지 버튼
			if(e.getSource() == restart){
				//db에 추가하기 위한 메소드 호출
				addPLAYER(nameget, restarts);
				gmmain2.dispose();
				new JFGame();
			}//그만두기 버튼
			else if(e.getSource() == exits){
				addPLAYER(nameget, restarts);
				gmmain2.dispose();
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
		
		//DB에 이름과 재시작 횟수를 추가한다.
		private void addPLAYER(String nameget, int restarts) {
			Connection con = makeConnection();
			try {
				Statement stmt = con.createStatement();
				String s= "INSERT INTO PLAYER(NAME, TIME, SCORE) VALUES(?,SYSDATE,?)";
				 PreparedStatement psmt = con.prepareStatement(s);
				
		 	     psmt.setString(1, nameget);	 
		 	     psmt.setInt(2, restarts);
		 	
		 	      psmt.executeUpdate();
		 	      
		 	      //5.연결종료
		 	      psmt.close();
		 	      con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

}
	
	//배치관리자
	public void paintComponent(Graphics g2) {
		g2.drawImage(bgimg4.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g2);
	}
	
}
