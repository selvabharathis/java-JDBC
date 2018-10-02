import java.sql.*;
import java.util.*;
class JDBCex1
{
public static void main(String args[]) throws Exception
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/studentdb","root","");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from student");
while(rs.next())
{
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
}
rs.close();
st.close();
con.close();
}
}