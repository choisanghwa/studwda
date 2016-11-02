
import java.sql.*;

public class db1010aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addBook("a","b","c",35000);
		
	}

	private static void addBook(String title, String publ, String year, int price) {
		// TODO Auto-generated method stub
		Connection con = makeConection();
		//Statement ��ü�� ����
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			System.out.println("���ܹ߻�:Statement ��ü��  ����ٰ� �߻�");
			e.printStackTrace();
		}
		//�߰�����

		//books ���̺��� book_id �� �ִ밪�� ���ͼ�
		//1�� ������Ų ���� ���ο� book_id�� �����Ѵ�.
		
		int new_id = 0;
		
		try {
			ResultSet rs = stmt.executeQuery("select max(book_id) as maxvalue from books");
		
			rs.next();
			new_id = rs.getInt("maxvalue");
			new_id = new_id+1;
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//�̱��� �߰���
		String s ="insert into books (book_id,TITLE, publisher, year , price) "
		+"values( "+new_id+",'a1','b1','2017',3500)"; // 6�� �̰����� �ٲ�>"+new_id+"
		
		try{
			int i = stmt.executeUpdate(s); //���ϵǴ� Ÿ���� Ʋ���� ����ó���ؾ���
			System.out.println("�ݿ��� ���ڵ��� �� : "+i);
		}catch (SQLException e) {
			System.out.println("���ܹ߻�:insert �ϴٰ� �߻�");
			e.printStackTrace();
		}
	}

	private static Connection makeConection() {
		// TODO Auto-generated method stub
		Connection conn = null;
		// ����̹� �ε�
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					System.out.println("���ܹ߻� :Ŭ������ �߰��Ҽ� ���׿�");
					return null;
					//e.printStackTrace(); �̰� ��� ��
				}
				System.out.println("Ŭ���� �ε� ����");
			//������ ���̽� ����
			String ur1 = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
			String id ="s1201295";
			String pw="p1201295";
			
			try {
				conn =DriverManager.getConnection(ur1, id, pw);
			} catch (SQLException e) {
				System.out.println("���ܹ߻� : getConnection ����");
				return null;
				//e.printStackTrace(); �̰� ��� ��
			}
			System.out.println("�����ͺ��̽� ���� ����");
			
		return conn;
	}

}
