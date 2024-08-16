package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BusyLife {
	public static void main(String[] args) {
		ArrayList<Pair1> al = new ArrayList<Pair1>();
		al.add(new Pair1(7, 9));
		al.add(new Pair1(0, 10));
		al.add(new Pair1(4, 5));
		al.add(new Pair1(8, 9));
		al.add(new Pair1(4, 10));
		al.add(new Pair1(5, 7));
		System.out.println(countActivities(al, al.size()));
	}
	
	private static int countActivities(ArrayList<Pair1> al, int n) {
		int count = 1;
		Collections.sort(al, new Comparator<Pair1>() {
			@Override
			public int compare(Pair1 o1, Pair1 o2) {
				if(o1.first<o2.first) return -1;
				else if(o1.first==o2.first) return 0;
				else return 1;
			}
		});
		
		int finished = al.get(0).second;
		for(int i=1; i<n; i++) {
			if(al.get(i).first>finished) {
				count++;
				finished = al.get(i).second;
			}
		}
		return count;
	}
}
class Pair1{
	int first;
	int second;
	public Pair1(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}
}
