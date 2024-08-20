package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MininmumDifference {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al1.add(23);
		al1.add(5);
		al1.add(10);
		al1.add(17);
		al1.add(30);
		al2.add(26);
		al2.add(134);
		al2.add(135);
		al2.add(14);
		al2.add(19);
		System.out.println(minDiff1(al1, al1.size(), al2, al2.size()));
		System.out.println(minDiff2(al1, al1.size(), al2, al2.size()));
	}

	private static int minDiff1(ArrayList<Integer> al1, int m, ArrayList<Integer> al2, int n) {
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				diff = Math.min(diff, Math.abs(al1.get(i) - al2.get(j)));
			}
		}
		return diff;
	}

	private static int minDiff2(ArrayList<Integer> al1, int m, ArrayList<Integer> al2, int n) {
		int diff = Integer.MAX_VALUE;
		Collections.sort(al1);
		Collections.sort(al2);
		int i = 0;
		int j = 0;
		while (i < m && j < n) {
			diff = Math.min(diff, Math.abs(al1.get(i) - al2.get(j)));
			if (al1.get(i) < al2.get(j))
				i++;
			else
				j++;
		}
		return diff;
	}
}
