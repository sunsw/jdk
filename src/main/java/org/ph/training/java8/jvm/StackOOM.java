package org.ph.training.java8.jvm;

/**
 * 类的描述
 *
 * @author Administrator on 2016/9/14 10:03
 */
public class StackOOM {
	/**
	 * @param args
	 */

	private int stackLength = 1;

	private void dontStop() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception err) {
			}
		}
	}

	public void stackLeakByThread() {
		while (true) {
			Thread t = new Thread(new Runnable() {

				public void run() {
					dontStop();
				}

			});
			t.start();
			stackLength++;
		}
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		StackOOM oom = new StackOOM();
		try {
			oom.stackLeakByThread();
		} catch (Throwable err) {
			System.out.println("Stack length:" + oom.stackLength);
			throw err;
		}

	}
}
