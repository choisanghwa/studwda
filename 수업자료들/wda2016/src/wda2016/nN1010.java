package wda2016;

import java.sql.*;
import java.util.Scanner;

public class nN1010 {


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
      System.out.print("삭제할 제목을 입력 : "
      		+ "작은 따옴표를 입력해라"+"예) 'a' 처럼 ");
      String no = sc.nextLine();
      String query = "delete books where TITLE= ";
      try {
         Statement stmt = conn.createStatement();  
         //sql 실행
    //     query = query+ "\'"; //이경우 작은따옴표를 자동으로 입력하게 해줌
         query = query+ no;
      //   query = query+ "\'"; //이경우 작은따옴표를 자동으로 입력하게 해줌
         int  x = stmt.executeUpdate(query);
         System.out.println("영향을 받은 이름 : "+x);
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}