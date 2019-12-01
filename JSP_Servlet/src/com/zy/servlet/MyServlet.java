package com.zy.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author: zy
 * @Description: 使用注解方式配置Servlet，Servlet的生命周期 
 * @date: 2019年10月26日  
 * @version: 1.0
 */
@WebServlet(description = "MyServlet", urlPatterns = { "/MyServlet" })
public class MyServlet extends HttpServlet {
       
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("初始化时调用");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("this is my first servlet!");
		System.out.println("响应时调用");
	}
	
	
	@Override
	public void destroy() {
		System.out.println("销毁时调用");
	}
}
