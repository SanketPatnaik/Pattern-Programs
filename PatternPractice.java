package com.in28minutes.JspidersQuestion;

public class PatternPractice {

	private int number;

	public PatternPractice(int number) {
		this.number = number;
	}

	public void printSameNumberRightAngleTriangle() {
		for (int row = 1; row <= number; row++) {
			int sameDigit = 0;
			for (int digit = 1; digit <= row; digit++) {
				sameDigit = row;
				System.out.print(sameDigit + " ");
			}
			System.out.println();
		}

	}

	public void printRightAngleNumberTriangle() {
		for (int row = 1; row <= number; row++) {
			for (int digit = 1; digit <= row; digit++) {
				System.out.print(digit + " ");
			}
			System.out.println();
		}
	}

	public void printEquilateralNumberTriangle() {
		int limit = number; // (Where number is given in the class Constructor)
		for (int row = 1; row <= number; row++) { // (For printing the rows)
			for (int space = 1; space <= limit; space++) { // (For printing the spaces)
				System.out.print(" ");
			}
			for (int digit = 1; digit <= row; digit++) { // (For the numbers)
				System.out.print(digit + " ");
			}
			System.out.println();
			limit--; // (Here limit is decreasing gradually so that the spaces will be less in each
						// row)
		}
	}

	public void printCamelCaseRightAngleNumberTriangle() {
		for (int row = 1; row <= number; row++) {
			if (row > number / 2) {
				for (int digit = 1; digit <= number - row; digit++) {
					System.out.print(digit + " ");
				}
				System.out.println();
			} else {
				for (int digit = 1; digit <= row; digit++) {
					System.out.print(digit + " ");
				}
				System.out.println();
			}
		}
	}

	public void printReverseCamelCaseRightAngleNumberTriangle() {
		for (int row = 0; row <= (2 * number); row = row + 2) {
			if (row < number - 1) {
				for (int digit = 1; digit <= (number - row) / 2; digit++) {
					System.out.print(digit + " ");
				}
				System.out.println();
			} else if (row > number + 1) {
				for (int digit = 1; digit <= (row - number) / 2; digit++) {
					System.out.print(digit + " ");
				}
				System.out.println();

			}
		}
	}

	public void printReverseCamelCaseRightAngleNumberTriangle2() {
		for (int row = 0; row <= (2 * number); row = row + 2) {
			if (row < number - 1) {
				for (int digit = (number - row) / 2; digit >= 1; digit--) {
					System.out.print(digit + " ");
				}
				System.out.println();
			} else if (row > number + 1) {
				for (int digit = (row - number) / 2; digit >= 1; digit--) {
					System.out.print(digit + " ");
				}
				System.out.println();

			}
		}
}

public void printReverseRightAngleNumberTriangle2() {
	for (int row = 1; row <= number; row++) {
		for (int digit = number; digit >= row; digit--) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}
}

public void printRightAngleNumberTriangle2() {
	for (int row = number; row >= 1; row--) {
		for (int digit = number; digit >= row; digit--) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}
}

public void printReverseRightAngleNumberTriangle() {
	for (int row = 0; row < number; row++) {
		for (int digit = 1; digit <= number - row; digit++) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}
}

public void printFloydsTriangle() {
	int floyd = 1;
	for (int row = 1; row <= number; row++) {
		for (int digit = 1; digit <= row; digit++) {
			System.out.print(floyd + " ");
			floyd++;
		}
		System.out.println();
	}
}

public void printRightAngleNumberTriangle3() {
	for (int row = 1; row <= number; row++) {
		for (int digit = row, check = 1; check <= row; digit--, check++) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}
}

public void printRightAngleNumberTriangle4() {
	for (int row = 1; row <= number; row++) {
		for (int digit = row, check = 1; check <= row; digit = digit + 5, check++) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}
}

public void printEquilateralPascalsTriangle() {
	int limit = number;
	for (int row = 1; row <= number; row++) {
		for (int space = 1; space <= limit; space++) {
			System.out.print(" ");
		}
		for (int digit = 1, check = 1; check <= row; check++) {
			if (check == 1 || check == row) {
				int previous = 0;
				System.out.print((digit = digit + previous) + " ");
			} else {
				System.out.println(digit = 1);
			}
			System.out.println();
			limit--;
		}
	}
}

public void printInvertedEquilateralTriangle() {
	for (int row = 0; row < number; row++) {
		for (int space = 0; space < row; space++) {
			System.out.print(" ");
		}
		for (int digit = 1; digit <= (number - row); digit++) {
				System.out.print(digit + " ");
	}
			System.out.println();
}
}

public void printNumberDiamond() {
	int limit = number;
	int limit2 = 1;
	for (int row = 1; row <= number * 2; row++) {
		if (row <= number) {
			for (int space = 1; space <= limit; space++) {
				System.out.print(" ");
			}
			for (int digit = 1; digit <= row; digit++) {
				System.out.print(digit + " ");
			}
			System.out.println();
			limit--;
		} else {
			for (int space = 0; space <= row - number; space++) {
				System.out.print(" ");
			}
			for (int digit = 1; digit <= number - limit2; digit++) {
				System.out.print(digit + " ");
			}
			System.out.println();
			limit2++;
		}
	}
}
}