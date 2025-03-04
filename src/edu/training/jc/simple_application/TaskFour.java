package edu.training.jc.simple_application;

public class TaskFour {

	public static void main(String[] args) {
		double circumference;
		double area;
		double radius = 10;

		circumference = 2 * Math.PI * radius;
		area = Math.PI * Math.pow(radius, 2);

		System.out.println("Длина окружности = " + String.format("%.2f", circumference) + "\nПлощадь круга = "
				+ String.format("%.2f", area));
	}

}
