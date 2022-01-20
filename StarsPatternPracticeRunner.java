package com.in28minutes.JspidersQuestion;

public class StarsPatternPracticeRunner {

	public static void main(String[] args) {
		StarsPatternPractice star = new StarsPatternPractice(10);

		star.printStarsRectangle(10);
		System.out.println();

		star.printStarsInvertedRightAngleTriangleWithoutSpaces();
		System.out.println();

		star.printStarsEquilateralTriangle();
		System.out.println();

		star.printStarsInvertedEquilateralTriangleWithoutSpaces();
		System.out.println();

		star.printStarsInvertedEquilateralTriangle();
		System.out.println();

		star.printStarsCamelCaseEquilateralTriangleWithoutSpaces();
		System.out.println();

		star.printStarsEquilateralTriangleWithoutSpaces();
		System.out.println();

		star.printStarsCamelCaseRightAngleTriangle();
		System.out.println();

		star.printStarsMirroredRightAngleTriangle();
		System.out.println();

		star.printStarsSingleSpacedRightAngleTriangle();
		System.out.println();
	}

}
