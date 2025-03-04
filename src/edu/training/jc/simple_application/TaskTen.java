package edu.training.jc.simple_application;

public class TaskTen {

	public static void main(String[] args) {
		double circumference = 7;
		double area;

		area = Math.pow(circumference, 2) / (4 * Math.PI);

		System.out.println("Площадь круга ограниченного окружностью = " + String.format("%.2f", area));
	}

}
