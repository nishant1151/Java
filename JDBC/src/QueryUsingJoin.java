import java.sql.*;
import java.util.Scanner;

public class QueryUsingJoin {

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "HR", "hr");
        Statement statement=connection.createStatement();
            PreparedStatement preparedStatement=connection.prepareStatement("""
                    select e.first_name,e.last_name,e.salary,e.department_id,d.department_name
                    from employees e join departments d
                    on(e.department_id=d.department_id)
                    where e.salary> ? and d.department_name=?
                    """);
            System.out.println("enter salary of employees");
            preparedStatement.setInt(1,sc.nextInt());

            System.out.println("enter salary of Department_id");
            preparedStatement.setString(2,sc.next());

            ResultSet resultSet=preparedStatement.executeQuery();

            while(resultSet.next()){
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3)+" "+resultSet.getInt(4)+" "+resultSet.getString(5));
            };
        }catch(SQLException e){
            e.printStackTrace();
        }



    }
}
