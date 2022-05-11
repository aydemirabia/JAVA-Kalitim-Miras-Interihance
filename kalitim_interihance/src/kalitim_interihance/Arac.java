package kalitim_interihance;

public class Arac {
	public void ilerle() {
		System.out.println("Arac ilerliyor...");
	}
}
class araba extends Arac{
	public static void main(String[] args) {
		araba gaz = new araba();
		gaz.ilerle();
	}
}


/*Yapmýþ olduðumuz bu örnekte Arac sýnýfýmýzý oluþturduk ve içerisine bir metot 
 * girdik. Sonrasýnda ise araba sýnýfýmýzý oluþturduk ve extends anahtar kelimemiz 
 * ile miras alma iþlevini gerçekleþtirdik. gaz adýnda bir metot oluþturduk ve 
 * gaz.ilerle komutu ile Arac sýnýfýndaki metoda sahip oldu.*/
 