package com.sunsw.singleton;

/**
 * 类的描述
 *
 * @author Administrator on 2016/9/18 11:34
 */
public class Singleton3 {

	private Singleton3(){}

	public static Singleton3 getInstance() {
		return ISClass.INSTANCE;
	}

	private static class ISClass {
		private static Singleton3 INSTANCE = new Singleton3();
	}
}
