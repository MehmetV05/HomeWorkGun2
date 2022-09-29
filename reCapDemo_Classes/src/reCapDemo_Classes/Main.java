package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int topla=dortIslem.Topla(8, 3);
		int cikar=dortIslem.Cikar(9, 2);
		int carp=dortIslem.Carp(1, 8);
		int bol=dortIslem.Bol(99, 3);
		System.out.println("Toplama sonuç: "+topla+" Çıkarma sonuç: "+cikar+" Carpma sonuç: "+carp+" Bölme sonuç: "+bol);
	}

}
