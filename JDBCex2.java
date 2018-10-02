import java.sql.*;
import java.io.*;
public class JDBCex2
{
public static void main(String args[]) throws Exception
{
DataInputStream dis=new DataInputStream(System.in);
System.out.println("enter roll no.=");
int roll=Integer.parseInt(dis.readLine());

System.out.println("enter name=");
String name=dis.readLine();

System.out.println("enter mark1=");
int m1=Integer.parseInt(dis.readLine());

System.out.println("enter mark2=");
int m2=Integer.parseInt(dis.readLine());

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/studentdb","root","");
PreparedStatement ps=con.prepareStatement("insert into student values (?,?,?,?)");
ps.setInt(1,roll);
ps.setString(2,name);
ps.setInt(3,m1);
ps.setInt(4,m2);
int x=ps.executeUpdate();
System.out.println(x+"row is updated");
con.close();
}
}