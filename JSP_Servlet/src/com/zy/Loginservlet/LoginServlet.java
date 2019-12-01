package com.zy.Loginservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zy.pojo.User;
import com.zy.service.impl.LoginServiceImpl;

/**
 * 登录练习，转发和重定向的区别，错误信息提示
 * @author 往事三块一毛八
 *
 */
@WebServlet(description = "LoginServlet",urlPatterns = {"/login2"})
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	private LoginServiceImpl loginService = new LoginServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("username");
		String passWord = req.getParameter("password");
		
		System.out.println(userName+":"+passWord);
		User user = new User();
		user.setUsername(userName);
		user.setPassword(passWord);
		System.out.println("user:"+user.toString());
		User resultUser = loginService.loginCheck(user);
		
		if(resultUser!=null) {
			req.setAttribute("user", resultUser.getUsername());
			//req.getRequestDispatcher("success").forward(req,resp);//请求转发
			resp.sendRedirect("/JSP_Servlet/success");//重定向：无法实现多次请求的数据传递
		}else {
			System.out.println("请求转发");
			req.getSession().setAttribute("error", "用户名或密码错误");
			req.getRequestDispatcher("WEB-INF/login.jsp").forward(req,resp);//请求转发：一次请求数据共享，路径不变
		}
	}
	
}
