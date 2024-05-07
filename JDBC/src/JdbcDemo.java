import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JdbcDemo {
    public static void main(String[] args ) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "HR", "hr");
        Statement statement = connection.createStatement();
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("create table std11(id number(3),name varchar2(20))");
//             preparedStatement = connection.prepareStatement("insert into std11 values(1,'nishant')");
//             connection.close();
//        }catch(Exception e){
//            PreparedStatement preparedStatement = connection.prepareStatement("insert into std11 values(1,'nishant')");
//            System.out.println(preparedStatement.executeUpdate());
//            connection.commit();
//        }

//           statement.executeUpdate("create table  abb(id number(3),name varchar2(20))");
//        String str="ABC";
//        PreparedStatement preparedStatement=connection.prepareStatement("SELECT COUNT(*) FROM all_tables WHERE table_name = ?");
//        preparedStatement.setString(1,str);
//        ResultSet resultSet=preparedStatement.executeQuery();
//        int check=0;
//        while (resultSet.next())
//        {
//            check=resultSet.getInt(1);
//        }
//        System.out.println(check);
//

//            try{
//
//                statement.executeQuery("create table  abbbb(id number(3),name varchar2(20))");
//            }catch (Exception e){
//                System.out.println("table already exists");
//            }
//            finally {
//                statement.executeUpdate("insert into abbbb values(10,'abcd')");
//            }


//        ResultSet resultSet=connection.getMetaData().getTables(connection.getCatalog(), null,null,new String[]{"TABLE"});
//        List<String> tableList=new ArrayList<>();
//        while (resultSet.next())
//        {
//            tableList.add(resultSet.getString("Table_name"));
//        }
//        String str="cOOK";
//        if(!tableList.contains(str)) {
//            PreparedStatement preparedStatement = connection.prepareStatement("create table cook(id number(3),name varchar2(20))");
//            System.out.println("Table is created");
//        }
//        else
//            {
//                System.out.println("Table is available");
//            }
//
//        }





    }

}
