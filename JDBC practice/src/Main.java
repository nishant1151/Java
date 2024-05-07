import javax.swing.text.html.HTMLDocument;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","HR","hr");
//        PreparedStatement preparedStatement=connection.prepareStatement("select * from employees");
//        ResultSet resultSet=preparedStatement.executeQuery();

//        while(resultSet.next()){
//            System.out.println(resultSet.getString(2));
//        }




    }
}
