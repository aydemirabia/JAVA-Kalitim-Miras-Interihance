package miras_YoneticiCalisan;

public class Calisan {
	private String isim;
	private int maas;
	private String departman;
	
	public Calisan(String isim, int maas, String departman) {
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;
	}
	public void calis() {
		System.out.println("Calis Programi Calisiyor...");
	}
	public void bilgileriGoster() {
		System.out.println("Isim: " + isim);
		System.out.println("Departman: " + departman);
		System.out.println("Maas: " + maas);
	}
	public void departmanDegistir(String yeniDepartman) {
		System.out.println("Departman degistiriliyor.");
		this.departman = yeniDepartman;
		System.out.println("Yeni Departman: " + this.departman);
	}
	public static void main(String[] args) {
		
	}
}
