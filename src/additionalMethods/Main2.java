package additionalMethods;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main2 {
	public static void main(String[] args) {
		Stream.iterate((int)'A',i->i<(int)'z', i->i=i+1)
				.filter(Character::isAlphabetic)
				.dropWhile(s->s<'E')
				.takeWhile(s->s<(int)'a')
				.forEach(s-> System.out.printf("%c",s));



	}
}
