package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestBand {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(9);
		al.add(3);
		al.add(0);
		al.add(18);
		al.add(5);
		al.add(2);
		al.add(4);
		al.add(10);
		al.add(17);
		al.add(12);
		al.add(6);
		System.out.println(longestBandHashing(al, al.size()));
	}

	private static int longestBand(ArrayList<Integer> al, int n) {
		Collections.sort(al);
		System.out.println(al);
		int count = 1;
		int finalCount = 1;
		for (int i = 0; i < n - 1; i++) {
			if (al.get(i) + 1 == al.get(i + 1)) {
				count++;
			} else {
				if (count > finalCount) {
					finalCount = count;
				}
				count = 1;
			}
		}
		return finalCount;
	}

	private static int longestBandHashing(ArrayList<Integer> al, int n) {
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			s.add(al.get(i));
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int ele = al.get(i);
			if (!s.contains(ele - 1)) {
				while (s.contains(ele)) {
					ele++;
				}
				if (ans < ele - al.get(i)) {
					ans = ele - al.get(i);
				}
			}
		}
		return ans;
	}
}
