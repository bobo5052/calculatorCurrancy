package InternetData;

import java.util.Currency;
import java.util.List;
import java.util.Scanner;

public class CurrencyCalculator {
	private static Scanner scanner = new Scanner(System.in);
	static List < Post > posts = Main3.post;
	static String from;
	static String to;

	public static void availableCurrencies() {
		for (Post post1 : posts) {
			System.out.print(post1.getCcy() + " ,");
		}
		System.out.println();
	}

	public static void setCurrency() {
		availableCurrencies();
		System.out.println("valyuta kodini kiriting(e.g. USD,SUM,..)");
		System.out.print("from : ");
		from = scanner.nextLine();
		calculate();

	}

	public static void calculate() {
		if (from == null) {
			System.out.println("siz hali valyutani kiritmadiz! ");
			setCurrency();
		}
		System.out.println("qancha " + from + " hisoblashni kiriting");
		double x = scanner.nextDouble();
		double y;
		for (Post post : posts) {
			if (post.getCcy().equals(from)) {
				y = x * Double.parseDouble(post.getRate());
				System.out.println(x + " " + from + " = " + y + "SUM");
				return;
			}
		}
	}

}
