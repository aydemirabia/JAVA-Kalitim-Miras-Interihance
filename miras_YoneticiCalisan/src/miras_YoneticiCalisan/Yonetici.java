package miras_YoneticiCalisan;

public class Yonetici extends Calisan {
	private int sorumluKisi;

	public Yonetici(String isim, int maas, String departman) {
		super(isim, maas, departman);
		this.sorumluKisi = sorumluKisi;
	}
	public void zam_yap(int zamMiktari) {
		System.out.println("Calisanlara " + zamMiktari + " TL zam yapildi.");
	}

}
