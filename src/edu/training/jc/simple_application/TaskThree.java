package edu.training.jc.simple_application;

public class TaskThree {

	public static void main(String[] args) {
		double x1 = 2;
		double y1 = 4;
		double x2 = 7;
		double y2 = 7;
		double x3 = 9;
		double y3 = 11;
		double ab;
		double bc;
		double ac;
		double perimeter;
		double halfPerimeter;
		double square;

		ab = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		bc = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		ac = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

		perimeter = ab + bc + ac;
		halfPerimeter = perimeter / 2;
		square = Math.sqrt(halfPerimeter * (halfPerimeter - ab) * (halfPerimeter - bc) * (halfPerimeter - ac));

		System.out.println("Периметр треугольника = " + String.format("%.2f", perimeter) + "\nПлощадь треугольника = "
				+ String.format("%.2f", square));
	}

}
