import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/managementsystem?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
        String user = "root";
        String password = "87597896xsy";
        Connection connection =DriverManager.getConnection(url,user,password);
        if(connection==null){
            System.out.println("连接失败");
        }else{
            System.out.println("连接成功");

            Statement statement = connection.createStatement();
            String sql = "insert into student values('832203303','赵六','男',3)";
            String sql2 = "delete from student where name='小芳'";
            String sql3 = "insert into class values(4,0,'2022-09-01')";

            if(statement.executeUpdate(sql)>=1){
                System.out.println("插入成功");
            }else{
                System.out.println("插入失败");
            }

            if(statement.executeUpdate(sql2)>=1){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }

            if(statement.executeUpdate(sql3)>=1){
                System.out.println("插入成功");
            }else{
                System.out.println("插入失败");
            }

            connection.close();
        }
    }
}
