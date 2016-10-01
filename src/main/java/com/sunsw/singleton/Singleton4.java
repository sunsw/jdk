package com.sunsw.singleton;

/**
 * 类的描述
 *
 * @author Administrator on 2016/9/18 11:34
 */
public enum Singleton4 {

	s0("sunsw", 28),
	s1("sss1", 29);

	private String name;
	private int age;

	Singleton4() {
		this.name = "";
		this.age = 0;
	}

	Singleton4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Singleton4{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public static void main(String[] args) {
		System.out.println(Singleton4.s0.toString());
	}

}
