package edu.training.jc.simple_application;

public class TaskTwo {

	public static void main(String[] args) {
		double x1 = 4;
		double y1 = 7;
		double x2 = 9;
		double y2 = 14;
		double distance;

		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.println("Расстояние между двумя точками  = " + String.format("%.2f", distance));
	}

}
