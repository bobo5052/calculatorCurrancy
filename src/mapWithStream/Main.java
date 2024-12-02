package mapWithStream;

import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		/*
		 *B1-B15
		 * I16-I30
		 * N31-N45
		 * G46-G60
		 * O61-O75
		 * */

		int start = 1;
		int increment = 0;
		Map < String, Integer > map = new HashMap <>();
		for (char character : "BINGO".toCharArray()) {

			for (int i = start; i < start + 15; i++) {
				increment++;
				map.put(String.valueOf(character), i);
			}
			start += increment;
			increment=0;
		}
		var s1 = map.entrySet().stream().filter(s -> (s.getValue() % 15 == 0) && s.getKey().equals("B"));
		var s2 = map.entrySet().stream().filter(s -> (s.getValue() % 15 == 0) && s.getKey().equals("I"));
		var s3 = map.entrySet().stream().filter(s -> (s.getValue() % 15 == 0) && s.getKey().equals("N"));
		var s4 = map.entrySet().stream().filter(s -> (s.getValue() % 15 == 0) && s.getKey().equals("G"));
		var s5 = map.entrySet().stream().filter(s -> (s.getValue() % 15 == 0) && s.getKey().equals("O"));
//s2.forEach(s-> System.out.println(s));
		Stream < Map.Entry < String, Integer > > stream = Stream.concat(Stream.concat(s1, Stream.concat(s2, Stream.concat(s3, s4))), s5);
		stream.forEach(s -> System.out.println(s.getKey() + s.getValue() + "-" + s.getValue() + s.getKey()));

	}
}