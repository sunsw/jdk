package org.ph.training.java8.jvm;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 类的描述
 *
 * @author Administrator on 2016/9/14 9:27
 */
public class MethodAreaOOM {
	static class OOMOjbect {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while (true) {
			Enhancer eh = new Enhancer();
			eh.setSuperclass(OOMOjbect.class);
			eh.setUseCache(false);
			eh.setCallback(new MethodInterceptor() {

				public Object intercept(Object arg0, Method arg1,
				                        Object[] arg2, MethodProxy arg3) throws Throwable {
					return arg3.invokeSuper(arg0, arg2);
				}

			});
			eh.create();
		}
	}
}
