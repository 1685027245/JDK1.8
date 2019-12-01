package com.zy.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * 监听器
 * @author 往事三块一毛八
 */
public class MyListener implements ServletRequestListener,ServletRequestAttributeListener {
	//request对象被销毁
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request对象销毁时调用");
	}
	//request对象被创建
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("request对象创建时调用");
	}
	//监听的是request作用域数据的添加
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
	
	}
	//监听的是request作用域数据的移除
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		
	}
	//监听的是request作用域数据的更新
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		
	}
}
