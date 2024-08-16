package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class MinimumSwaps {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(4);
		al.add(5);
		al.add(1);
		al.add(3);
//		System.out.println(swap1(al, al.size()));
//		System.out.println(swap2(al, al.size()));
//		System.out.println(swap3(al, al.size()));
		System.out.println(swap4(al, al.size()));

	}

	private static int swap1(ArrayList<Integer> al, int n) {
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);
		ArrayList<Pair> ap = new ArrayList<Pair>();
		for (int i = 0; i < n; i++) {
			ap.add(new Pair(al.get(i), i));
		}
		ap.sort(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				if (o1.first < o2.first)
					return -1;
				else if (o1.first == o2.first)
					return 0;
				else
					return 1;
			}
		});
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (visited[i] || ap.get(i).second == i) {
				continue;
			}
			int j = i;
			int cycle = 0;
			while (!visited[j]) {
				visited[j] = true;
				cycle++;
				j = ap.get(j).second;
			}
			if (cycle > 0)
				ans += cycle - 1;
		}
		return ans;
	}

	private static int swap2(ArrayList<Integer> al, int n) {
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			map.put(al.get(i), i);
		}
		Collections.sort(al);
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (visited[i] || map.get(al.get(i)) == i)
				continue;
			int j = i;
			int cycle = 0;
			while (!visited[j]) {
				visited[j] = true;
				cycle++;
				j = map.get(al.get(j));
			}
			if (cycle > 0)
				ans += cycle - 1;
		}
		return ans;
	}
	
	private static int swap3(ArrayList<Integer> al, int n) {
		ArrayList<Integer> sorted = new ArrayList<Integer>(al);
		Collections.sort(sorted);
		int ans = 0;
		for(int i=0; i<n; i++) {
			if(al.get(i)!=sorted.get(i)) {
				ans++;
				swap(al, i, indexOf(al, n, sorted.get(i)));
			}
		}
		return ans;
	}
	
	private static int swap4(ArrayList<Integer> al, int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++) {
			map.put(al.get(i), i);
		}
		ArrayList<Integer> sorted = new ArrayList<Integer>(al);
		Collections.sort(sorted);
		int ans = 0;
		for(int i=0; i<n; i++) {
			if(al.get(i)!=sorted.get(i)) {
				ans++;
				int ele = al.get(i);
				swap(al, i, map.get(sorted.get(i)));
				int idx2 = map.get(sorted.get(i));
				map.put(ele,idx2);
				map.put(sorted.get(i), i);
			}
		}
		return ans;
	}

	private static void swap(ArrayList<Integer> al, int a, int b) {
		int temp = al.get(a);
		al.set(a, al.get(b));
		al.set(b, temp);
	}

	private static int indexOf(ArrayList<Integer> al, int n, int ele) {
		for (int i = 0; i < n; i++) {
			if (al.get(i) == ele)
				return i;
		}
		return -1;
	}
	
	
}

class Pair {
	int first;
	int second;

	public Pair(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}

}