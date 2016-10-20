package com.sunsw.sort;

import java.util.Arrays;

/**
 * 堆排序
 * 堆排序是一种树形选择排序，是对直接选择排序的有效改进。
 * 堆的定义下：具有n个元素的序列 （h1,h2,...,hn),当且仅当满足（hi>=h2i,hi>=2i+1）或（hi<=h2i,hi<=2i+1） (i=1,2,...,n/2)时称之为堆。在这里只讨论满足前者条件的堆。由堆的定义可以看出，堆顶元素（即第一个元素）必为最大项（大顶堆）。完全二 叉树可以很直观地表示堆的结构。堆顶为根，其它为左子树、右子树。
 * 思想:初始时把要排序的数的序列看作是一棵顺序存储的二叉树，调整它们的存储序，使之成为一个 堆，这时堆的根节点的数最大。然后将根节点与堆的最后一个节点交换。然后对前面(n-1)个数重新调整使之成为堆。依此类推，直到只有两个节点的堆，并对 它们作交换，最后得到有n个节点的有序序列。从算法描述来看，堆排序需要两个过程，一是建立堆，二是堆顶与堆的最后一个元素交换位置。所以堆排序有两个函数组成。一是建堆的渗透函数，二是反复调用渗透函数实现排序的函数。
 * O(nlogn)
 * 不稳定的排序
 *
 * @author Administrator on 2016/9/18 16:54
 */
public class 堆排序 {
	public static void main(String[] args) {
		int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64};
		int arrayLength = a.length;
		//循环建堆
		for (int i = 0; i < arrayLength - 1; i++) {
			//建堆
			buildMaxHeap(a, arrayLength - 1 - i);
			//交换堆顶和最后一个元素
			swap(a, 0, arrayLength - 1 - i);
			System.out.println(Arrays.toString(a));
		}
	}

	//对data数组从0到lastIndex建大顶堆
	public static void buildMaxHeap(int[] data, int lastIndex) {
		//从lastIndex处节点（最后一个节点）的父节点开始
		for (int k = (lastIndex - 1) / 2; k >= 0; k--) {
			//k节点的左子节点的索引
			int biggerIndex = 2 * k + 1;
			//如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
			if (biggerIndex < lastIndex) {
				//若果右子节点的值较大
				if (data[biggerIndex] < data[biggerIndex + 1]) {
					//biggerIndex总是记录较大子节点的索引
					biggerIndex++;
				}
			}
			//如果k节点的值小于其较大的子节点的值
			if (data[k] < data[biggerIndex]) {
				//交换他们
				swap(data, k, biggerIndex);
			}
		}
	}

	//交换
	private static void swap(int[] data, int i, int j) {
		int tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}
}
