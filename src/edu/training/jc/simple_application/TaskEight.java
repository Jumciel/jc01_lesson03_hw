package edu.training.jc.simple_application;

public class TaskEight {

	public static void main(String[] args) {
		int length = 2;
		double faceArea;
		double surfaceArea;
		double volume;

		faceArea = Math.pow(length, 2);
		surfaceArea = faceArea * 6;
		volume = Math.pow(length, 3);

		System.out.println("Площадь грани куба = " + faceArea + "\nПлощадь полной поверхности куба = " + surfaceArea
				+ "\nОбъём куба = " + volume);
	}

}
