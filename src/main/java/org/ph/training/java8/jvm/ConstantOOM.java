package org.ph.training.java8.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 类的描述
 *
 * @author Administrator on 2016/9/14 9:43
 */
public class ConstantOOM {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		int i = 0;
		while (true) {
			list.add(String.valueOf(i++).intern());
		}
	}
}
