package no.hvl.dat108;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class ArrayA {

	public static void main(String[] args) {
		
		List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");
		
		Collections.sort(listen, (t1, t2) -> t1.compareTo(t2));
		
		
		System.out.print(listen);
	}

}
