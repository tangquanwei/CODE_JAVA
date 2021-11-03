package lang.jdbc;

// 1.导入jar包

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 导入jar包
 * 注册驱动
 * 获取数据库连接对象 Connection
 * 定义sql
 * 获取执行sql语句的对象 Statement
 * 执行sql,接收返回结果
 * 处理结果
 */
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 3.获取数据库链接对象
        // mysql -h 39.99.42.127 -P 3306 -u root -p
        Connection root = DriverManager.getConnection("jdbc:mysql://39.99.42.127/quanwei", "root", ",./,./");
        String sql="show databases;";
        Statement statement = root.createStatement();
        boolean count=statement.execute(sql);
        System.out.println(count);
    }
}
