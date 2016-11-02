import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class db0930 {

	public static void main(String[] args) throws Exception {
		// 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		//데이터 베이스 연결
		String ur1 = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
		String id ="s1201295";
		String pw="p1201295";
		Connection conn =DriverManager.getConnection(ur1, id, pw);
	
		if(conn !=null){
			System.out.println("데이터 베이스와 연결성공");
		}
		//데이터 베이스로 보낼 쿼리문을 생성한다.
		Statement stmt = conn.createStatement();
		
		//결과레코드들을 저장할 집합 변수를 만들어 준다.
		ResultSet rs;
		
		rs = stmt.executeQuery("SELECT * FROM books");
		
		//첫번째 레코드만 출력해보자
		//첫번째 레코드로 커서를 이동시키는 명령실행
		rs.next();
		//첫번째 레코드만 출력해 보자
		//이름을 얻어온다.
		
		while(rs.next()){
			
			String title = rs.getString("TITLE");
			System.out.print(title+" ");
			
			System.out.print("\n");
		}
		
		
		stmt.close();
		if(conn != null){
			 //접속을 끊는다.
			System.out.println("접속종료");
			conn.close();
		}
		
	}

}
