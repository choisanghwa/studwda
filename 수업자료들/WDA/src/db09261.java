import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class db09261 {

	public static void main(String[] args) throws Exception {
		// ����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		//������ ���̽� ����
		String ur1 = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
		String id ="scott";
		String pw="tiger";
		Connection conn =DriverManager.getConnection(ur1, id, pw);
	
		if(conn !=null){
			System.out.println("������ ���̽��� ���Ἲ��");
		}
		//������ ���̽��� ���� �������� �����Ѵ�.
		Statement stmt = conn.createStatement();
		
		//������ڵ���� ������ ���� ������ ����� �ش�.
		ResultSet rs;
		
		//rs = stmt.executeQuery("select * from emp");
		rs = stmt.executeQuery("select DEPTNO,DNAME,LOC from dept ");
		
		//ù��° ���ڵ常 ����غ���
		//ù��° ���ڵ�� Ŀ���� �̵���Ű�� ��ɽ���
		rs.next();
		//ù��° ���ڵ常 ����� ����
		//�̸��� ���´�.
		
		while(rs.next()){
			
			int deptno = rs.getInt("DEPTNO");
			System.out.print(deptno);
			
			String dname = rs.getString("DNAME");
			System.out.print(dname);
			
			String loc = rs.getString("LOC");
			System.out.print(loc);
		
			System.out.print("\n");
	
		}
		
		stmt.close();
		
		if(conn != null){
			conn.close(); //������ ���´�.
		}
	}

}

