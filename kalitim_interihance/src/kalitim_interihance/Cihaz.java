package kalitim_interihance;
import java.util.Scanner;
public class Cihaz {
	String mesaj;
	String gonderen;
	public void gonder() {
		System.out.println("Mesajiniz gonderildi.");
	}
}
class Telefon extends Cihaz{
	public void goruntu() {
		System.out.println("Benim Adim: " + gonderen);
		System.out.println(mesaj);
	}
}
class Main{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Telefon tel = new Telefon();
		System.out.print("Ad: ");
		String yaz = reader.nextLine();
		
		tel.gonderen = yaz;
		tel.mesaj = "Java ile Programlama - Kalitim || Miras - Interihance";
		tel.goruntu();
		tel.gonder();
		
	}
}