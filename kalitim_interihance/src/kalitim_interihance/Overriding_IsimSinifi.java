package kalitim_interihance;
import java.util.Scanner;

public class Overriding_IsimSinifi {
	public class Cihaz {
		String mesaj;
		String gonderen;
		public void gonder() {
			System.out.println("Mesajiniz gonderilemedi.");
		}
	}
	class Telefon extends Cihaz{
		public void goruntu() {
			System.out.println("Benim Adim: " + gonderen);
			System.out.println(mesaj);
		}
	}
	class Main{
		public void main(String[] args) {
			Scanner reader = new Scanner(System.in);
			//subclass (alt s�n�f)'a ula�mak i�in yeni bir nesne(object) olu�turduk.
			Telefon tel = new Telefon();
			System.out.print("Ad: ");
			String yaz = reader.nextLine();
			
			tel.gonderen = yaz;
			tel.mesaj = "Java ile Programlama - Kalitim || Miras - Interihance";
			tel.goruntu();
			tel.gonder();
		}
	}	
}
