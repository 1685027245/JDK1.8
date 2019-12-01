package com.zy.servlet;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * request对象获取请求头数据
 * @author 往事三块一毛八
 *
 */
@WebServlet(description = "RequestServlet",urlPatterns = {"/request"})
public class RequestServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		//设置HttpServletResponse使用utf-8编码，通知浏览器使用utf-8解码，一行代码搞定
		resp.setContentType("text/html;charset=utf-8");
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("获取请求头数据:");
		buffer.append(",获取method方式:"+req.getMethod());
		buffer.append(",获取RequestURL:"+req.getRequestURL());
		buffer.append(",获取URL:"+req.getRequestURI());
		buffer.append(",获取协议:"+req.getScheme());
		resp.getWriter().write(buffer.toString());
	}
}
