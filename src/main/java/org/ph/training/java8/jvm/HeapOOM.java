package org.ph.training.java8.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 类的描述
 *
 * @author Administrator on 2016/9/14 9:07
 */
public class HeapOOM {
	static class OOMObject {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();

		while (true) {
			list.add(new OOMObject());
		}
	}
}
