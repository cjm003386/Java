package ex15_6_Test;
import java.util.*;

public class Lottoset_3 {
	public static void main(String args[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		while (set.size() < 6) {
			set.add(r.nextInt(45) + 1);
		}
		Iterator<Integer> iterator = set.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next() + "\t");
	}
}

}