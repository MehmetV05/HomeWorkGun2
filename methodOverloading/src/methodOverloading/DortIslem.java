package methodOverloading;

public class DortIslem {
	public int topla (int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
//	aynı isimli method oluşturulduğunda yine işlevini gerçekteştiriyor.
	public int topla (int sayi1,int sayi2,int sayi3) {
		return sayi1+sayi2+sayi3;
	}
}
