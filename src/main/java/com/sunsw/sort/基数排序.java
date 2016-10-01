package com.sunsw.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 基数排序
 * 将所有待比较数值（正整数）统一为同样的数位长度，数位较短的数前面补零。然后，从最低位开始，依次进行一次排序。这样从最低位排序一直到最高位排序完成以后,数列就变成一个有序序列
 * O(d(n+r)),d为位数，r为基数
 * 稳定的排序算法
 *
 * @author Administrator on 2016/9/18 16:58
 */
public class 基数排序 {
	public static void main(String[] args) {
		int[] a = {49, 38, 65, 97, 176, 213, 227, 49, 78, 34, 12, 164, 11, 18, 1};
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		//基数排序
		sort(a);
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void sort(int[] array) {
		//找到最大数，确定要排序几趟
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		//判断位数
		int times = 0;
		while (max > 0) {
			max = max / 10;
			times++;
		}
		//建立十个队列
		List<ArrayList> queue = new ArrayList<ArrayList>();
		for (int i = 0; i < 10; i++) {
			ArrayList queue1 = new ArrayList();
			queue.add(queue1);
		}
		//进行times次分配和收集
		for (int i = 0; i < times; i++) {
			//分配
			for (int j = 0; j < array.length; j++) {
				int x = array[j] % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i);
				ArrayList queue2 = queue.get(x);
				queue2.add(array[j]);
				queue.set(x, queue2);
			}
			//收集
			int count = 0;
			for (int j = 0; j < 10; j++) {
				while (queue.get(j).size() > 0) {
					ArrayList<Integer> queue3 = queue.get(j);
					array[count] = queue3.get(0);
					queue3.remove(0);
					count++;
				}
			}
		}
	}
}
