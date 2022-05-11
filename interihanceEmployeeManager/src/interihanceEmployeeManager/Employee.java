package interihanceEmployeeManager;

public class Employee {
	String ad, soyad, bolum = "Isci", calisanBilgileri;
	int izingunu = 14;
	double maas = 8000;
	//Constructor
	Employee(String ad, String soyad){
		this.ad = ad;
		this.soyad = soyad;
	}
	void printInfo() {
		calisanBilgileri = " -> Ad-Soyad: " + ad + " " + soyad + 
				"\n -> Bolum: " + bolum + "\n -> Izin Gunu: " + izingunu + 
				" Gun: " + " \n -> Maas: " + maas + " TL";
		System.out.println(calisanBilgileri);
	}
}
