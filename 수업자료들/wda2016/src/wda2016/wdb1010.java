package wda2016;

import java.sql.*;
import java.util.Scanner;

public class wdb1010 {


   private static Connection makeConnection() {
      Connection conn = null;
      
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      } catch (ClassNotFoundException e) {
         System.out.println("���� �߻� : Ŭ������ �߰��� �� ���׿�");
         return null;
      //   e.printStackTrace();
      }
      System.out.println("Ŭ���� �ε� ����");
      
      String url = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
      String id = "s1201295";
      String pw = "p1201295";
      
      try {
         conn = DriverManager.getConnection(url,id,pw);
      } catch (SQLException e) {
         System.out.println("���� �߻� : getConnection ����");
         return null;
      //   e.printStackTrace();
      }
      System.out.println("�����ͺ��̽� ���� ����");
      return conn;
   }
   
   public static void main(String[] args) {
      Connection conn = makeConnection();
      //Ű����� �Է¹��� ��ȣ�� ���ڵ带 �����ϴ� ��� ����
      Scanner sc = new Scanner(System.in);
      System.out.print("������ ��ȣ�� �Է� : ");
      int no = sc.nextInt();
      String query = "delete books where BOOK_ID= ";
      try {
         Statement stmt = conn.createStatement();
         //Wrapper Class : �⺻ �ڷ����� Ŭ������ ������ش�.
         //int --> Integer
         Integer i = new Integer(no);
         query = query +i.toString();
         //sql ����
         int x = stmt.executeUpdate(query);
         System.out.println("������ ���� ���� �� : "+x);
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}