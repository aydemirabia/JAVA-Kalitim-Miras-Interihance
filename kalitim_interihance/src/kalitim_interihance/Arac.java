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


/*Yapm�� oldu�umuz bu �rnekte Arac s�n�f�m�z� olu�turduk ve i�erisine bir metot 
 * girdik. Sonras�nda ise araba s�n�f�m�z� olu�turduk ve extends anahtar kelimemiz 
 * ile miras alma i�levini ger�ekle�tirdik. gaz ad�nda bir metot olu�turduk ve 
 * gaz.ilerle komutu ile Arac s�n�f�ndaki metoda sahip oldu.*/
 