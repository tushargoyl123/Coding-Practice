package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SubArraySort {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(8);
		al.add(6);
		al.add(7);
		al.add(9);
		al.add(10);
		al.add(11);
		subArraySort1(al, al.size());
		subArraySort2(al, al.size());
	}

	private static void subArraySort1(ArrayList<Integer> al, int n) {
		ArrayList<Integer> sorted = new ArrayList<Integer>(al);
		Collections.sort(sorted);
		int start = -1;
		int end = -1;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) != sorted.get(i)) {
				start = i;
				break;
			}
		}
		for (int i = n - 1; i >= 0; i--) {
			if (al.get(i) != sorted.get(i)) {
				end = i;
				break;
			}
		}
		System.out.println(start + " " + end);
	}

	private static void subArraySort2(ArrayList<Integer> al, int n) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int x = al.get(i);
			if (outOfOrder(al, i)) {
				min = Math.min(min, x);
				max = Math.max(max, x);
			}
		}
		int left = 0;
		while (min >= al.get(left)) {
			left++;
		}
		int right = n - 1;
		while (max <= al.get(right)) {
			right--;
		}
		System.out.println(left + " " + right);
	}

	private static boolean outOfOrder(ArrayList<Integer> al, int i) {
		if (i == 0)
			return al.get(i) > al.get(i + 1);
		if (i == al.size() - 1)
			return al.get(i) < al.get(i - 1);
		return al.get(i) > al.get(i + 1) || al.get(i) < al.get(i - 1);
	}
}
