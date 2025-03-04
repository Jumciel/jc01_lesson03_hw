package edu.training.jc.simple_application;

public class TaskSix {

	public static void main(String[] args) {
		int count = 1;
		int number = 1134;
		int var;

		while (number != 0) {
			var = number % 10;
			count = count * var;
			number = number / 10;
		}
		System.out.println("Результат умножения цифр четырехзначного числа = " + count);
	}

}
