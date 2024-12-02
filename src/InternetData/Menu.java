package InternetData;

import java.util.Currency;
import java.util.Scanner;

public class Menu {
	private static Scanner scanner = new Scanner(System.in);

	static String entry = """
			salom bu valyutalarni hisoblash kalkulyatori""";
	static String menuText = """
			1->valyuta sozlamasi(qaysi valyutaDAN qaysi valyutaGA)
			2->kalkulyator
			3->mavjud valyutalar(kodi)
			4->exit
				enter the value :\t""";

	public static void startMenu() {
		System.out.println(entry);
		boolean flag = true;
		while (flag) {
			System.out.print(menuText);
			int option = scanner.nextInt();
			switch (option) {
				case 1 -> {
					CurrencyCalculator.setCurrency();
				}
				case 2 -> {
					CurrencyCalculator.calculate();
				}
				case 3 -> {
					CurrencyCalculator.availableCurrencies();
				}
				default -> {
					flag = false;
				}
			}
		}


	}

}
