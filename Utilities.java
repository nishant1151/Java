public class Utilities {

	public int factorial(int number) {
		int i, fact = 1;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;

	}

	public int reverseNumber(int number) {
		int reverse = 0, remiander = 0;
		while (number != 0) {
			remiander = number % 10;
			number = number / 10;
			reverse = reverse * 10 + remiander;
		}
		return reverse;
	}

	public int sumOfDigits(int number) {
		int  temp, sum = 0;
		while (number != 0) {
			temp = number % 10;
			number = number / 10;
			sum = sum + temp;
		}
		return sum;
	}

	public void fibonachiSeries(int number) {
		int i, temp = 1, sum = 0, fibonachi;

		for (i = 0; i < number; i++) {
			if (i == 0 || i == 1) {
				System.out.println(i);
			} else {
				fibonachi = sum + temp;
				sum = temp;
				temp = fibonachi;
				System.out.println(fibonachi);
			}

		}
	}

	public boolean primeNumber(int number) {
		int i;
		boolean flag = false;
		for (i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;

	}

	public int power(int number, int power) {
		int i, result = 1;
		for (i = 0; i < power; i++) {
			result = result * number;
		}
		return result;

	}

	public void factorialSeries(int number) {
		int i, j;
		float sum = 0f, factorial;

		for (i = 1; i <= number; i++) {
			factorial = 1;
			for (j = 1; j <= number; j++) {
				factorial = factorial * j;

			}

			if (i % 2 != 0) {
				sum = sum + (i / factorial);

			} else {
				sum = sum - (i / factorial);
			}

		}
		System.out.println(sum);
	}

	public boolean palindrome(int number) {

		int temp = reverseNumber(number);
		if (temp == number) {
			return true;
		} else {
			return false;
		}

	}

	public void swapNumbers(int number1, int number2) {
		int temp;
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("Number1=" + number1 + "\nNumber2=" + number2);
	}

	public int addNumbers(int number) {
		int i, sum = 0;
		for (i = 0; i < number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int simpleInterest(int principle, int time, int interese_rate) {

		return (principle * time * interese_rate) / 100;
	}

	public void sizeOfDatatypes() {
		System.out.println("Size and Range of Data Types");
		System.out.println("Size of byte: " + Byte.BYTES + " bytes");
		System.out.println("Size of byte: " + Byte.SIZE + " bits");
		System.out.println("Minimum value of byte: " + Byte.MIN_VALUE);
		System.out.println("Maximum value of byte: " + Byte.MAX_VALUE + "\n");

		System.out.println("Size of short: " + Short.BYTES + " bytes");
		System.out.println("Size of short: " + Short.SIZE + " bits");
		System.out.println("Minimum value of short: " + Short.MIN_VALUE);
		System.out.println("Maximum value of short: " + Short.MAX_VALUE + "\n");

		System.out.println("Size of int: " + Integer.BYTES + " bytes");
		System.out.println("Size of int: " + Integer.SIZE + " bits");
		System.out.println("Minimum value of int: " + Integer.MIN_VALUE);
		System.out.println("Maximum value of int: " + Integer.MAX_VALUE + "\n");

		System.out.println("Size of long: " + Long.BYTES + " bytes");
		System.out.println("Size of long: " + Long.SIZE + " bits");
		System.out.println("Minimum value of long: " + Long.MIN_VALUE);
		System.out.println("Maximum value of long: " + Long.MAX_VALUE + "\n");

		System.out.println("Size of float: " + Float.BYTES + " bytes");
		System.out.println("Size of float: " + Float.SIZE + " bits");
		System.out.println("Minimum value of float: " + Float.MIN_VALUE);
		System.out.println("Maximum value of float: " + Float.MAX_VALUE + "\n");

		System.out.println("Size of double: " + Double.BYTES + " bytes");
		System.out.println("Size of double: " + Double.SIZE + " bits");
		System.out.println("Minimum value of double: " + Double.MIN_VALUE);
		System.out.println("Maximum value of double: " + Double.MAX_VALUE + "\n");

		System.out.println("Size of Char: " + Character.BYTES + " bytes");
		System.out.println("Size of char: " + Character.SIZE + " bits");
		System.out.println("Minimum value of char: " + (int) Character.MIN_VALUE);
		System.out.println("Maximum value of char: " + (int) Character.MAX_VALUE);

	}

	public double kilogramToPounds(double kilograms) {

		return kilograms / 2.2;
	}

}
