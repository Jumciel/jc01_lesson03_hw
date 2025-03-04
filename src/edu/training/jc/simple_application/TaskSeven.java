package edu.training.jc.simple_application;

public class TaskSeven {

	public static void main(String[] args) {
		int a = 2;
		int b = 6;
		double averageCube;
		double averageModule;

		averageCube = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		averageModule = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.println("Среднее арифметическое кубов чисел " + averageCube
				+ "\nСреднее геометрическое модулей чисел = " + String.format("%.2f", averageModule));
	}

}
