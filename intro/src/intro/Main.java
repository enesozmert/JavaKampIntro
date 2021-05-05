package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// camelCase
		String internetSubeButtonu = "Ýnternet þubeye gir";
		double dolarDun = 5.12;
		double dolarBugun = 4.12;
		//int vade = 5;
		boolean dustuMu = false;
		// System.out.println("Hello World");
		System.out.println(internetSubeButtonu);
		if (dolarDun < dolarBugun) {
			dustuMu = false;
			System.out.println("Dolar düþtü resmi");
		} else if (dolarDun > dolarBugun) {
			dustuMu = true;
			System.out.println("Dolar yükseldi resmi");
		} else {
			System.out.println("Dolar eþittir resmi");
		}
		//String kredi1 = "Hýzlý";
		//String kredi2 = "Mutlu";
		//String kredi3 = "Konut";
		//String kredi4 = "Çiftci";
		//String kredi5 = "Msb";

		String[] krediler = { "Hýzlý", "Mutlu", "Konut", "Çiftci", "Msb" };
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
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "izmir";
		System.out.println(sehir1);
	}

}
