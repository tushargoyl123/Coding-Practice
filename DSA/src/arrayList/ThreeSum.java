package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(2);
		al.add(3);
		al.add(-6);
		al.add(9);
		al.add(11);
		int target = 6;
		threeSum(al, target);
		
	}
	
	private static void threeSum(List<Integer> al, int target) {
		Collections.sort(al);
		int n = al.size();
		for(int i=0; i<n-2; i++) {
			int j = i+1;
			int k = n-1;
			while(j<k) {
				int sum = al.get(i);
				sum+=al.get(j);
				sum+=al.get(k);
				if(sum==target) {
					System.out.println(al.get(i)+" "+al.get(j)+" "+al.get(k));
					j++;
					k--;
				}
				else if(sum>target) {
					k--;
				}
				else {
					j++;
				}
			}
		}
	}
}
