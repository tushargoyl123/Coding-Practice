package arrayList;

import java.util.ArrayList;

public class RainProblem {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(1);
		al.add(0);
		al.add(2);
		al.add(1);
		al.add(0);
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(1);
		al.add(2);
		al.add(1);
		System.out.println(rainProblem(al, al.size()));
	}

	private static int rainProblem(ArrayList<Integer> al, int n) {
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			left.add(0);
			right.add(0);
		}
		left.set(0, al.get(0));
		right.set(n - 1, al.get(n - 1));
		for (int i = 1; i < n; i++) {
			left.set(i, Math.max(left.get(i - 1), al.get(i)));
			right.set(n - i - 1, Math.max(right.get(n - i), al.get(n - i - 1)));
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int sum = Math.min(left.get(i), right.get(i)) - al.get(i);
			ans += sum;
		}
		return ans;
	}
}
