import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class db0926 {

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
		rs = stmt.executeQuery("select EMPNO,ENAME,JOB, To_char(hiredate,'yy/mm/dd')mydate from emp ");
		
		//ù��° ���ڵ常 ����غ���
		//ù��° ���ڵ�� Ŀ���� �̵���Ű�� ��ɽ���
		rs.next();
		//ù��° ���ڵ常 ����� ����
		//�̸��� ���´�.
		/*String name = rs.getString("ENAME");
		System.out.print(name+", ");
		
		String job = rs.getString("JOB");
		System.out.println(job);*/
		
		while(rs.next()){
			
			int empno = rs.getInt("EMPNO");
			System.out.print(empno+", ");
			
			String name = rs.getString("ENAME");
			System.out.print(name+", ");
			
			String job = rs.getString("JOB");
			System.out.println(job+", ");
		
			int mgr = rs.getInt("MGR");
			System.out.print(mgr+", ");
			
			
			 String mydate = rs.getString("MYDATE");
			System.out.print(mydate+", ");
			
			
		/*	String hiredate = rs.getString("HIREDATE");
			System.out.print(hiredate+", ");
			*/
			int sal = rs.getInt("SAL");
			System.out.print(sal+", ");
		}
		
		stmt.close();
		
		if(conn != null){
			conn.close(); //������ ���´�.
		}
	}

}
