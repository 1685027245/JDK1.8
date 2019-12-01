package com.zy.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 过滤器:拦截下来做判断然后进行跳转页面
 * @author 往事三块一毛八
 *
 */
public class MyFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("初始化调用");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("请求时调用");
		request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
	}

	@Override
	public void destroy() {
		System.out.println("销毁时调用");
	}

}
