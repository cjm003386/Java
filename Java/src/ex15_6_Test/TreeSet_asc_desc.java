package ex15_6_Test;
import java.util.*;
public class TreeSet_asc_desc {
	public static void main(String args[]) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random r = new Random();
		while (set.size() < 6) {
			int num = r.nextInt(45) + 1;
			//int num=(int) (Math.random() * 45) + 1;
			set.add(num);
			
		}
		
		System.out.println("로또번호 오름차순: " + set);
		
	}

}
