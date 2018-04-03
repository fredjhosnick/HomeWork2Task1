package oopHomeWork2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Put three points
		Point x = new Point(0, 0);
		Point y = new Point(2, 3);
		Point z = new Point(2, 4);

		// triangle test

		shape triangle = new Triangle(x, y, z);

		shape sp = triangle;
		System.out.println("The perimetr of tringle  is :" + sp.getPerimetr());
		System.out.println();
		System.out.println("The Area of triangle is :" + sp.getArea());
		System.out.println();

		Point a = new Point(0, 1);
		Point b = new Point(1, 2);
		Point c = new Point(2, 4);
		Point d = new Point(3, 4);
		shape rectangle = new Rectangle(a, b, c, d);

		System.out.println("The perimetr of rectangle is: " + rectangle.getPerimetr());
		System.out.println();
		System.out.println("The area of rectangle is: " + rectangle.getArea());

	}

}
