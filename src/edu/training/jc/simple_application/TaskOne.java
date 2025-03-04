package edu.training.jc.simple_application;

public class TaskOne {

	public static void main(String[] args) {
		double a = 7;
		double b = 3;
		double c;
		double perimeter;
		double square;

		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		perimeter = a + b + c;
		square = (a * b) / 2;

		System.out.println("Площадь треугольника = " + String.format("%.2f", square) + "\nПериметр треугольника = "
				+ String.format("%.2f", perimeter));
	}

}