package interihanceEmployeeManager;

public class Main {

	public static void main(String[] args) {
		Employee isci = new Employee("Pinar", "Aydemir Aydinoglu");
		GeneralManager genelMudur = new GeneralManager("Rabia", "Aydemir");
		
		System.out.println("\n  Personel bilgileri olusturuldu.");
		isci.printInfo();
		System.out.println("\n  Genel Mudur bilgileri olusturuldu.");
		genelMudur.printInfo();

	}

}
