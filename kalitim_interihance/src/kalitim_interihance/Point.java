package kalitim_interihance;

public class Point {
	protected double x, y;
	public Point(double a, double b) {
		noktagir(a, b);
	}
	public void noktagir(double a, double b) {
		this.x = a;
		this.y = b;
	}
	public double okuX() {
		return x;
	}
	public double okuY() {
		return y;
	}
	public String toString() {
		return "["+ x +","+ y +"]";
	}

}
