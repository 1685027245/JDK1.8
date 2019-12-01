package com.zy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author: zy
 * @Description: Servlet的service方法和doGet方法与doPost方法的区别 
 * 			service方法:即可处理get方式的请求也可处理post方式的请求,三种方式同时存在，会优先执行service方法
 * 			doGet方法:处理get方式的请求
 * 			doPost方法:处理post方式的请求
 * 注意1：super.service(req, resp); //不去掉，会根据请求方式请求调用了父类的相应方式的方法
 * 		写了super就必须写doGet和doPost方法
 * 注意2：注解和配置不能重复
 * 
 * @date: 2019年10月26日  
 * @version: 1.0
 */
@WebServlet(description="ServletMethod",urlPatterns={"/login"})
public class ServletMethod extends HttpServlet{
	private static final long serialVersionUID = 1698977031991279917L;
	/*@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("这是service方法");
		resp.getWriter().write("this is index page====>service");
	}*/
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("这是doGet方法");
		resp.getWriter().write("this is index page====>doGet");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("这是doPost方法");
		String userName = req.getParameter("username");
		String passWord = req.getParameter("password");
		resp.getWriter().write("this is index page====>doPost"+"\n");
		resp.getWriter().write("username:"+userName+",password:"+passWord);
		
	}
}
