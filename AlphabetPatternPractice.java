package com.in28minutes.JspidersQuestion;

public class AlphabetPatternPractice {
	private int number;

	public AlphabetPatternPractice(int number) {
		this.number = number;
	}

	public void printRightAngleTriangle() {
		for (int row = 0; row < number; row++) {
			for (char ch = 'A'; ch <= 65 + row; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}

	}

	public void printRightAngleTriangleOfSameChars() {
		for (int row = 0; row < number; row++) {
			for (char ch = (char) (65); ch <= 65 + row; ch++) {
				System.out.print((char) (65 + row) + " ");
			}
			System.out.println();
		}
	}

	public void printRightAngleCamelCaseTriangle() {
		for (int row = 0; row < number; row++) {
			if (row <= number / 2) {
				for (char ch = 'A'; ch <= 65 + row; ch++) {
					System.out.print(ch + " ");
				}
				System.out.println();
			} else if (row > number / 2) {
				for (char ch = 'A'; ch <= 65 + (number - (row + 1)); ch++) {
					System.out.print(ch + " ");
				}
				System.out.println();
			}
		}

	}

	public void printRightAngleReverseCamelCaseTriangle() {
		int row2 = 0;
		for (int row = 0; row < number + 1; row++) {
			if (row <= number / 2) {
				for (char ch = 'A'; ch <= 65 + (number / 2 - row); ch++) {
					System.out.print(ch + " ");
				}
				System.out.println();
			} else if (row > number / 2) {
				for (char ch = 'A'; ch <= 65 + row2; ch++) {
					System.out.print(ch + " ");
				}
				row2++;
				System.out.println();
			}
		}

	}

	public void printRightAngleReverseCamelCaseTriangle2() {
		int row2 = 0;
		for (int row = 0; row < number + 1; row++) {
			if (row <= number / 2) {
				for (char ch = (char) (65 + (number / 2 - row)); ch >= 65; ch--) {
					System.out.print(ch + " ");
				}
				System.out.println();
			} else if (row > number / 2) {
				for (char ch = (char) (65 + row2); ch <= 65 + (row2 * 2); ch++) {
					System.out.print(ch + " ");
				}
				row2++;
				System.out.println();
			}
		}

	}

	public void printEquilateralTriangle() {
		for (int row = 0; row < number; row++) {
			for (int space = 0; space < number - row; space++) {
				System.out.print(" ");
			}
			for (char ch = 'A'; ch <= 65 + row; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public void printReverseRightAngleTriangleWithReverseChars(int number) {
		for (int row = 0; row < number; row++) {
			for (char ch = 'F'; ch >= 65 + row; ch--) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}

	}

	public void printRightAngleTriangleWithReverseChars(int number) {
		for (int row = 1; row <= number; row++) {
			for (char ch = 'F'; ch >= 65 + number - row; ch--) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}

	}

	public void printReverseRightAngleTriangle(int number) {
		for (int row = 1; row <= number; row++) {
			for (char ch = 'A'; ch <= 65 + number - row; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();

		}

	}

	public void printRightAngleTriangleWithContinuousChars(int number) {
		char ch = 'A';
		for (int row = 1; row <= number; row++) {
			for (int digit = 1; digit <= row; digit++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

	public void printRightAngleTriangleWithCReverseChars(int number) {
		for (int row = 0; row < number; row++) {
			for (char ch = (char) (65 + row); ch >= 65; ch--) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}

	}

	public void printRightAngleTriangleWithCharsOfInterval5(int number) {
		for (int row = 0; row < number; row++) {
			for (char ch = (char) (65 + row); ch <= (char) (65 + row) + 5 * row; ch += 5) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public void printPascalsAlphabetTriangle(int number) {
		for (int row = 1; row <= number; row++) {
			for (int space = 1; space <= number - row; space++) {
				System.out.print(" ");
			}
			int print = 1;
			for (int digit = 1; digit <= row; digit++) {
				System.out.print((char) (print + 64) + " ");
				print = print * (row - digit) / digit;
			}
			System.out.println();
		}
		}

		public void printRIghtAngleTriangleWithExactTwoHalves(int number) {
		for (int row = 1 ; row<=number ; row++) {
			int print = 64;
			int i = 2;
				for (int digit = 1; digit <= (2 * row) - 1; digit++) {
				if (print + digit <= print + row) {
					System.out.print((char) (print + digit) + " ");
				} else {
					System.out.print((char) (print + digit - i) + " ");
					i = i + 2;
				}
				}
				System.out.println();
		}
	}

	public void printReverseEquilateralTriangle(int number) {
		for (int row = number; row >= 0; row--) {
			for (int space = 1; space <= number - row; space++) {
				System.out.print(" ");
			}
			for (char ch = 'A'; ch <= (char) (65 + row); ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public void printCamelCaseEquilateralTriangle(int number) {
		int temp = number;
		for (int row = 1; row <= (2 * number) - 1; row++) {
			if (row < number) {
				 for (int space = 1 ; space <= number-row ; space++) {
					 System.out.print(" ");
				 }
					for (char ch = 'A'; ch <= (char) (64 + row); ch++) {
						System.out.print(ch + " ");
				 }
				 System.out.println();
			 }
			 else {
					for (int space = row - number + 1; space >= 0; space--) {
					 System.out.print(" ");
				 }
					for (char ch = 'A'; ch <= (char) (62 + temp); ch++) {
						System.out.print(ch + " ");
					}
				 System.out.println();
					temp--;
		 }
	}
	}

	public void rightReverseCamelCaseRightAngleTriangle(int number) {
		for (int row = number, print = 0; row >= 0; row--, print++) {
			for (int space = 0; space < number - row; space++) {
					System.out.print(" ");
				}
				for (char ch = (char) (65 + print); ch <= 65 + number; ch++) {
					System.out.print(ch);
				}
				System.out.println();
			}
			for (int row = number, print = number; row >= 0; row--, print--) {
				for (int space = row; space > 0; space--) {
					System.out.print(" ");
				}
				for (char ch = (char) (65 + print); ch <= 65 + number; ch++) {
					System.out.print(ch);
				}
				System.out.println();
			}
	}

	public void rightReverseCamelCaseEquilateralTriangle(int number) {
		for (int row = 0; row <= number; row++) {
			for (int space = 0; space < row; space++) {
				System.out.print(" ");
			}
			for (char ch = (char) (65 + row); ch <= 65 + number; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		for (int row = number; row >= 0; row--) {
			for (int space = row; space > 0; space--) {
				System.out.print(" ");
			}
			for (char ch = (char) (65 + row); ch <= 65 + number; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public void printEquilateralTriangleStartingWithLastElement(int number) {
		for (int row = number; row >= 0; row--) {
			for (int space = row; space > 0; space--) {
				System.out.print(" ");
			}
			for (char ch = (char) (65 + row); ch <= 65 + number; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public void printEquilateralTriangleWithRepeatingElements(int number) {
		for (int row = 1 ; row <= number ; row++) {
			for (int space = 1; space <= number - row; space++) {
				System.out.print(" ");
			}
			int print = 1;
			for (int alpha = 1; alpha < row; alpha++) {
				print = (row - alpha) / alpha;
				System.out.print((char) (64 + print));
			}
			System.out.println();
		}
	}

	}