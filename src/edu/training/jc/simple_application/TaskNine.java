package edu.training.jc.simple_application;

public class TaskNine {

	public static void main(String[] args) {
		int side = 5;
		double area;
		double height;
		double inradius;
		double circumradius;

		area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
		height = (Math.sqrt(3) / 2) * side;
		inradius = height / 3;
		circumradius = (2 * height) / 3;

		System.out.println("Площадь треугольника = " + String.format("%.2f", area) + "\nВысота треугольника = "
				+ String.format("%.2f", height) + "\nРадиус вписанной окружности = " + String.format("%.2f", inradius)
				+ "\nРадиус описанной окружности = " + String.format("%.2f", circumradius));
	}

}
