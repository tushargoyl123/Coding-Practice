package arrayList;

import java.util.ArrayList;

public class maxSubarraySum {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(-1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(-2);
		al.add(6);
		al.add(-8);
		al.add(3);
		System.out.println(sum1(al, al.size()));
		System.out.println(sum2(al, al.size()));
	}
	
	private static int sum1(ArrayList<Integer> al, int n) {
		int sumFinal = 0;
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=i; j<n; j++) {
				sum+=al.get(j);
				sumFinal = Math.max(sumFinal, sum);
			}
		}
		return sumFinal;
	}
	
	private static int sum2(ArrayList<Integer> al, int n) {
		int sumFinal = al.get(0);
		int sum = al.get(0);
		for(int i=1; i<n; i++) {
			sum = Math.max(al.get(i), al.get(i)+sum);
			sumFinal = Math.max(sumFinal, sum);
		}
		if(sumFinal<0) return 0;
		return sumFinal;
	}
}
