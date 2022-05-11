package kalitim_interihance;

public class Overriding_2_IsimSinifi {

	public class Isim{
		String isim = "Rabia Aydemir";
		int no = 202234;
		int telefonNo = 555002022;
		
		public void metot() {
			System.out.println("Isim: " + isim);
			System.out.println("Numara: " + no);
		}
	}
	//Isim sýnýfýndan miras alma
	class Override extends Isim{
		public void metot() {
			System.out.println("Isim: " + isim);
			System.out.println("Numara: " + no);
			System.out.println("Telefon No : " + telefonNo);
		}
	}
	class uygula{
		public void main(String[] args) {
			Override isimsinifi = new Override();
			isimsinifi.metot();
		}
	}
}
