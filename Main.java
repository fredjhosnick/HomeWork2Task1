package oopHomeWork2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Put three points
		Point a = new Point(0, 0);
		Point b = new Point(2, 3);
		Point c = new Point(2, 4);
		Point d = new Point(3, 4);

		Triangle triangle = new Triangle(a, b, c);

		Rectangle rectangle = new Rectangle(a, b, c, d);

		System.out.println("The perimetr of triangle  is :" + triangle.getPerimetr());
		System.out.println();
		System.out.println("The Area of triangle is :" + triangle.getArea());
		System.out.println();

		System.out.println("The perimetr of rectangle is: " + rectangle.getPerimetr());
		System.out.println();
		System.out.println("The area of rectangle is: " + rectangle.getArea());

	}

}
