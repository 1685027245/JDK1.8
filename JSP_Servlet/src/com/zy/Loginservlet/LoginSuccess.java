package com.zy.Loginservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "LoginSuccess",urlPatterns = {"/success"})
public class LoginSuccess extends HttpServlet{

	private static final long serialVersionUID = -892522401897609914L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().write(req.getAttribute("user")+"登录成功");
	}
	
}
