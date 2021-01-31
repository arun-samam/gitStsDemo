import java.util.ArrayList;
import java.util.Iterator;

public class Primes {

	public static void main(String[] args) {
		
		long start = System.nanoTime();
		findPrimesUsingList();
		long end = System.nanoTime();
		System.out.println(end - start);

	}

	private static void findPrimes() {
		
	for(int i=1,count=0;i<1000;i++,count = 0) {
		for(int j=1;j<=i;j++) {
			if(i%j ==0 )count++;
		}
		if(count==2)System.out.println(i);
	}
		
	}
	
	private static void findPrimesUsingList() {
		ArrayList<Integer> nos = new ArrayList<Integer>();
	
		for(int i=1;i<101;i++) {
			nos.add(i);
		}
		
		Iterator<Integer> iterator = nos.iterator();
		while(iterator.hasNext()) {
			for(int k=3;k<101;k++) {
			if(iterator.next() % k==0) {
				iterator.remove();
			}
			}
		}
		System.out.println(nos);
	}

}
