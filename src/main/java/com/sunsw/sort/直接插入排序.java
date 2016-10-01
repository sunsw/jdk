package com.sunsw.sort;

/**
 * 直接插入排序
 * 每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置（从后向前找到合适位置后），直到全部插入排序完为止
 * O(n2)
 * 稳定的排序
 *
 * @author Administrator on 2016/9/18 16:41
 */
public class 直接插入排序 {
	public static void main(String[] args) {
		int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		//直接插入排序
		for (int i = 1; i < a.length; i++) {
			//待插入元素
			int temp = a[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				//将大于temp的往后移动一位
				if (a[j] > temp) {
					a[j + 1] = a[j];
				} else {
					break;
				}
			}
			a[j + 1] = temp;
		}
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
