package javaIntro;

import java.io.Console;

public class Main {

	public static void main(String[] args) {
		// camelCase
		String internetSubeButtonu = "�nternet �ubeye gir";
		double dolarDun = 5.12;
		double dolarBugun = 4.12;
		// int vade = 5;
		boolean dustuMu = false;
		// System.out.println("Hello World");
		System.out.println(internetSubeButtonu);
		if (dolarDun < dolarBugun) {
			dustuMu = false;
			System.out.println("Dolar d��t� resmi");
		} else if (dolarDun > dolarBugun) {
			dustuMu = true;
			System.out.println("Dolar y�kseldi resmi");
		} else {
			System.out.println("Dolar e�ittir resmi");
		}
		// String kredi1 = "H�zl�";
		// String kredi2 = "Mutlu";
		// String kredi3 = "Konut";
		// String kredi4 = "�iftci";
		// String kredi5 = "Msb";

		String[] krediler = { "H�zl�", "Mutlu", "Konut", "�iftci", "Msb" };
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		int sayi1 = 10;
		int sayi2 = 10;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);

		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1 = sehir2;
		sehir2 = "izmir";
		System.out.println(sehir1);
	}

}
