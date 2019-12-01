package com.zy.jdbc;



import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class Test {
	public static void main(String[] args) {
		
		//声明Connection对象
        Connection con;
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/smbms";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "root";
        //遍历查询结果集
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = (Connection) DriverManager.getConnection(url,user,password);
            if(!con.isClosed())
                System.out.println("连接数据库成功");
            //2.创建statement类对象，用来执行SQL语句！！
            Statement statement = (Statement) con.createStatement();
            //要执行的SQL语句
            String sql = "SELECT id,stuNo,stuName  FROM student";
            //3.ResultSet类，用来存放获取的结果集！！
            ResultSet rs = (ResultSet) statement.executeQuery(sql);
            System.out.println("===================");
             
            int id;
            int stuNo ;
            String stuName = null;
            while(rs.next()){
                //获取stuname这列数据
            	id = rs.getInt("id");
                //获取stuid这列数据
                stuNo = rs.getInt("stuNo");
                stuName = rs.getString("stuName");
                //输出结果
                System.out.println(id + "\t" +stuNo+"\t" +stuName);
            }
            rs.close();
            con.close();
        } catch(ClassNotFoundException e) {   
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");   
            e.printStackTrace();   
            } catch(SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();  
            }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            System.out.println("数据库数据成功获取！！");
        }
    }
	
}



