package com.in28minutes.JspidersQuestion;

public class StarsPatternPractice {
	private int number;

	public StarsPatternPractice(int number) {
		this.number = number;
	}

	public void printStarsRectangle(int columns) {
		for (int row = 1; row <= number; row++) {
			for (int star = 1; star <= columns; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void printStarsInvertedRightAngleTriangleWithoutSpaces() {
		for (int row = 0; row < number; row++) {
			for (int space = 1; space <= row; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= number - row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printStarsEquilateralTriangle() {
		for (int row = 0; row < number; row++) {
			for (int space = 1; space <= number - row; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star <= row; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public void printStarsInvertedEquilateralTriangleWithoutSpaces() {
		int check = number;
		for (int row = 0; row < number; row++) {
			for (int space = 0; space < row; space++) {
				System.out.print(" ");
			}
			if (check%2==0) {
				for (int star = 1; star <= check-1; star++) {
					System.out.print("*");
				}
			} else {
				for (int star = 1; star <= check; star++) {
					System.out.print("*");
			}
		}
			System.out.println();
			check = check - 2;
	}
	}

	public void printStarsInvertedEquilateralTriangle() {
		for (int row = 0; row < number; row++) {
			for (int space = 0; space < row; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= number - row; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void printStarsCamelCaseEquilateralTriangleWithoutSpaces() {
		for (int row = 0; row < number; row++) {
			if (row <= number / 2) {
				for (int space = 1; space < number - row; space++) {
					System.out.print(" ");
				}
				for (int star = 0; star <= 2 * row; star++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int space = 1; space <= row; space++) {
					System.out.print(" ");
				}
				for (int star = 1; star < 2 * (number - row); star++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

	public void printStarsEquilateralTriangleWithoutSpaces() {
		for (int row = 0; row < number; row++) {
			for (int space = 1; space < number - row; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star <= 2 * row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void printStarsCamelCaseRightAngleTriangle() {
		for (int row = 1; row <= number; row++) {
			if (row <= number / 2) {
				for (int star = 1; star <= row; star++) {
					System.out.print("* ");
				}
			} else {
				for (int star = 1; star <= number - row; star++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

	public void printStarsMirroredRightAngleTriangle() {
		for (int row = 1; row <= number; row++) {
			for (int space = 1; space <= number - row; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void printStarsSingleSpacedRightAngleTriangle() {
		for (int row = 1; row <= number; row++) {
			for (int digit = 0; digit < 2 * row; digit++) {
				if (digit == row) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
