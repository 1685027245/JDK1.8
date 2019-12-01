package com.zy.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import com.zy.pojo.User;

public class Dao {
	
	@SuppressWarnings("null")
	public User loginCheck(User myUser) {
		
		//声明Connection对象
        Connection con = null;
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/stuser";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "root";
        //用来存放获取的结果集
        ResultSet rs = null;
        //返回用户值
        User resutltUser = null;
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
            String sql = "SELECT * FROM USER WHERE NAME='"+myUser.getUsername()+"' AND PASSWORD='"+myUser.getPassword()+"'";
            System.out.println(sql);
            //3.ResultSet类，用来存放获取的结果集！！
            rs = (ResultSet) statement.executeQuery(sql);
            
            while(rs.next()){
            	resutltUser = new User();
                resutltUser.setUsername(rs.getString("name"));
                resutltUser.setPassword(rs.getString("password"));
                //输出结果
                System.out.println("rs:"+resutltUser.toString());
            }
        } catch(ClassNotFoundException e) {   
            //数据库驱动类异常处理
            e.printStackTrace();   
            } catch(SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();  
            }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		return resutltUser;
	}
}
