package com.zy.designPattern;

interface Fruit{
	public void eat();
}

class Apple implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃苹果");
	}
}

class Orange implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃橘子");
	}
}

//创建工厂类  解耦合
class Factory{
	public static Fruit getInstance(String className){
		Fruit fruit = null;
		try {
			fruit = (Fruit) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fruit;
	}
}

public class 工厂模式 {
	public static void main(String[] args) {
		//通过工厂类，反射机制直接创建对象，不需要new来创建对象
		Fruit f = Factory.getInstance("com.zy.reflex.Apple");
		f.eat();
	}
}
