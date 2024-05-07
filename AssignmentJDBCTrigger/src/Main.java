import java.sql.*;

public class Main {

    public static void main(String []args) throws SQLException {

        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","HR","hr");
        PreparedStatement preparedStatement= connection.prepareStatement("insert into employee values(?,?)");
        preparedStatement.setInt(1,1);
        preparedStatement.setString(2,"abcd");
        preparedStatement.execute();

        ResultSet resultSet= preparedStatement.executeQuery("select * from auditEmployee");
        while(resultSet.next()){
            System.out.println(resultSet.getString(1)+" "+resultSet.getTime(2)+" "+resultSet.getDate(3));
        }
    }
}
