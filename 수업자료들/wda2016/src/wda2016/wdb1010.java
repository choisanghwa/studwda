package wda2016;

import java.sql.*;
import java.util.Scanner;

public class wdb1010 {


   private static Connection makeConnection() {
      Connection conn = null;
      
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      } catch (ClassNotFoundException e) {
         System.out.println("예외 발생 : 클래스를 발견할 수 없네요");
         return null;
      //   e.printStackTrace();
      }
      System.out.println("클래스 로딩 성공");
      
      String url = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
      String id = "s1201295";
      String pw = "p1201295";
      
      try {
         conn = DriverManager.getConnection(url,id,pw);
      } catch (SQLException e) {
         System.out.println("예외 발생 : getConnection 에러");
         return null;
      //   e.printStackTrace();
      }
      System.out.println("데이터베이스 연결 성공");
      return conn;
   }
   
   public static void main(String[] args) {
      Connection conn = makeConnection();
      //키보드로 입력받은 번호의 레코드를 삭제하는 기능 구현
      Scanner sc = new Scanner(System.in);
      System.out.print("삭제할 번호를 입력 : ");
      int no = sc.nextInt();
      String query = "delete books where BOOK_ID= ";
      try {
         Statement stmt = conn.createStatement();
         //Wrapper Class : 기본 자료형을 클래스로 만들어준다.
         //int --> Integer
         Integer i = new Integer(no);
         query = query +i.toString();
         //sql 실행
         int x = stmt.executeUpdate(query);
         System.out.println("영향을 받은 행의 수 : "+x);
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}