
import java.sql.*;

public class db1010aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addBook("a","b","c",35000);
		
	}

	private static void addBook(String title, String publ, String year, int price) {
		// TODO Auto-generated method stub
		Connection con = makeConection();
		//Statement 객체를 생성
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			System.out.println("예외발생:Statement 객체를  만들다가 발생");
			e.printStackTrace();
		}
		//추가해줌

		//books 테이블의 book_id 의 최대값을 얻어와서
		//1을 증가시킨 값을 새로운 book_id로 설정한다.
		
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
		//이까지 추가임
		String s ="insert into books (book_id,TITLE, publisher, year , price) "
		+"values( "+new_id+",'a1','b1','2017',3500)"; // 6을 이걸으로 바꿈>"+new_id+"
		
		try{
			int i = stmt.executeUpdate(s); //리턴되는 타입이 틀려서 예외처리해야함
			System.out.println("반영된 레코드의 수 : "+i);
		}catch (SQLException e) {
			System.out.println("예외발생:insert 하다가 발생");
			e.printStackTrace();
		}
	}

	private static Connection makeConection() {
		// TODO Auto-generated method stub
		Connection conn = null;
		// 드라이버 로딩
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					System.out.println("예외발생 :클래스를 발견할수 없네요");
					return null;
					//e.printStackTrace(); 이게 없어도 됨
				}
				System.out.println("클래스 로딩 성공");
			//데이터 베이스 연결
			String ur1 = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
			String id ="s1201295";
			String pw="p1201295";
			
			try {
				conn =DriverManager.getConnection(ur1, id, pw);
			} catch (SQLException e) {
				System.out.println("예외발생 : getConnection 에러");
				return null;
				//e.printStackTrace(); 이게 없어도 됨
			}
			System.out.println("데이터베이스 연결 성공");
			
		return conn;
	}

}
