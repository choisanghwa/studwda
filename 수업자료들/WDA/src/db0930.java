import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class db0930 {

	public static void main(String[] args) throws Exception {
		// ����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		//������ ���̽� ����
		String ur1 = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
		String id ="s1201295";
		String pw="p1201295";
		Connection conn =DriverManager.getConnection(ur1, id, pw);
	
		if(conn !=null){
			System.out.println("������ ���̽��� ���Ἲ��");
		}
		//������ ���̽��� ���� �������� �����Ѵ�.
		Statement stmt = conn.createStatement();
		
		//������ڵ���� ������ ���� ������ ����� �ش�.
		ResultSet rs;
		
		rs = stmt.executeQuery("SELECT * FROM books");
		
		//ù��° ���ڵ常 ����غ���
		//ù��° ���ڵ�� Ŀ���� �̵���Ű�� ��ɽ���
		rs.next();
		//ù��° ���ڵ常 ����� ����
		//�̸��� ���´�.
		
		while(rs.next()){
			
			String title = rs.getString("TITLE");
			System.out.print(title+" ");
			
			System.out.print("\n");
		}
		
		
		stmt.close();
		if(conn != null){
			 //������ ���´�.
			System.out.println("��������");
			conn.close();
		}
		
	}

}
