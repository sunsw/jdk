package com.sunsw.singleton;

/**
 * 类的描述
 *
 * @author Administrator on 2016/9/18 11:34
 */
public class Singleton0 {
	private static Singleton0 instance;

	private  Singleton0(){}

	public static synchronized Singleton0 getInstance() {
		if (instance == null) {
			instance = new Singleton0();
		}
		return instance;
	}
}
