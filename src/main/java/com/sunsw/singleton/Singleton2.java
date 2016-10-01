package com.sunsw.singleton;

/**
 * 类的描述
 *
 * @author Administrator on 2016/9/18 11:34
 */
public class Singleton2 {
	private static Singleton2 instance = new Singleton2();

	private Singleton2(){}

	public static Singleton2 getInstance() {
		return instance;
	}
}
