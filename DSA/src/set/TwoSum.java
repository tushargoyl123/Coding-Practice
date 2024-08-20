package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSum {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(3);
		al.add(-6);
		al.add(9);
		al.add(11);
		int target = 4;
		twoSum(al, target);
	}
	
	private static void twoSum(List<Integer> al, int target) {
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<al.size(); i++) {
			int x = al.get(i);
			int y = target-x;
			if(set.contains(x)) {
				System.out.println(x+" "+y);
				return;
			}
			set.add(y);
		}
		System.out.println("No elements found");
	}
}
