import java.sql.*;
import java.io.*;
public class JDBCex3
{
public static void main(String args[]) throws Exception
{
DataInputStream dis=new DataInputStream(System.in);
System.out.println("enter student roll no.(to be deleted)=");
int roll=Integer.parseInt(dis.readLine());

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/studentdb","root","");
PreparedStatement ps=con.prepareStatement("delete  from student where rollno=?");/* rollno name is field in db*/
ps.setInt(1,roll);
int x=ps.executeUpdate();
System.out.println(x+"row is updated");
con.close();
}
}