/*
package Pack_test;
//import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
public class Mysql_test {
		public static void main(String [] args) {
			try {
				//��������
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/name1", "root", "970322");
				Statement st=conn.createStatement();
				//����
				String sql="insert into book (name,page) values('weicheng','300')";
				st.execute(sql);
				//ɾ��
				String sql1="delete from book where name='xueguo'";
				st.execute(sql1);
				//����
				String sql2="select * from book where name='shanhaijing'";
				st.execute(sql2);
				//�޸�
				String sql3="update book set name='weicheng1' where name='weicheng'";
				st.execute(sql3);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello word");
			
		
		
			}

}*/
