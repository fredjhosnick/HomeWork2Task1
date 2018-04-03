package oopHomeWork2;

public class Rectangle extends shape {

	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Rectangle() {

	}

	public Rectangle(Point a, Point b, Point c, Point d) {

		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;

	}

	/**
	 * @return the a
	 */
	public Point getA() {
		return a;
	}

	/**
	 * @param a
	 *            the a to set
	 */
	public void setA(Point a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public Point getB() {
		return b;
	}

	/**
	 * @param b
	 *            the b to set
	 */
	public void setB(Point b) {
		this.b = b;
	}

	/**
	 * @return the c
	 */
	public Point getC() {
		return c;
	}

	/**
	 * @param c
	 *            the c to set
	 */
	public void setC(Point c) {
		this.c = c;
	}

	/**
	 * @return the d
	 */
	public Point getD() {
		return d;
	}

	/**
	 * @param d
	 *            the d to set
	 */
	public void setD(Point d) {
		this.d = d;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

	public double getPerimetr() {

		return Point.calculationDistance(a, b) + Point.calculationDistance(b, c) + Point.calculationDistance(c, d)
				+ Point.calculationDistance(d, a);

	}

	public double getArea() {

		double p = this.getPerimetr() / 2;

		return Math.sqrt((p - Point.calculationDistance(a, b)) * (p - Point.calculationDistance(b, c))
				* (p - Point.calculationDistance(c, d)) * (p - Point.calculationDistance(d, a)));
	}

}
