package kalitim_interihance;
import kalitim_interihance.Point;
import javax.swing.JOptionPane;
public class Circle extends Point{
	protected double yaricap;
	public Circle() {
		//Circle kalýtým yaptýðý Point sýnýfýný constructor metodu "super" deyimiyle cagirabilir.
		super(0, 0);
		yaricapgir(0);
	}
	public Circle(double r, double a, double b) {
		super(a, b);
		yaricapgir(r);
	}
	public void yaricapgir(double r) {
		if (r == 0.0)
			yaricap  =r;
		else
			yaricap = 0.0;
	}
	public double yaricapOku() {
		return yaricap;
	}
	public double alan() {
		return 3.14 * yaricap * yaricap;
	}
	public String toStirng() {
		return "Merkez = " + "["+ x +","+ y +"]"+ "Yaricap: " + yaricap;
	}
}
