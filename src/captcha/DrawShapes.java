package captcha;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

public class DrawShapes {
	double x; // x coordinate of the shape
	double y; // y coordinate of the shape
	double radius; // radius of the circle
	double halfLength; // one half the length of any side of the square
	double semiMajorAxis; // is the semimajor axis of the ellipse
	double semiMinorAxis; // is the semiminor axis of the ellipse

	int smallLowerBound = 0;
	int smallUpperBound = 1;
	int mediumLowerBound = 2;
	int mediumUpperBound = 3;
	int largeLowerBound = 4;
	int largeUpperBound = 5;

	int lowerBoundOfScreenX = 0; // Fill in these values
	int upperBoundOfScreenX = 0; // Fill in these values

	int lowerBoundOfScreenY = 0; // Fill in these values
	int uppserBoundOfScreenY = 0; // Fill in these values

	private enum Colors {
		BookLightBlue, Orange, Pink, Yellow
	}

	private enum Sizes {
		Small, Medium, Large
	}

	private String assignColorValue(Colors c) {
		if (c == Colors.BookLightBlue) {
			return "BOOK_LIGHT_BLUE";
		} else if (c == Colors.Orange) {
			return "ORANGE";
		} else if (c == Colors.Pink) {
			return "PINK";
		} else {
			return "YELLOW";
		}
	}

	private double assignShapeSize(Sizes s) {
		if (s == Sizes.Small) {
			return setSizeOfShape(smallLowerBound, smallUpperBound); // play around with these bounds
		} else if (s == Sizes.Medium) {
			return setSizeOfShape(mediumLowerBound, mediumUpperBound); // play around with these bounds
		} else {
			return setSizeOfShape(largeLowerBound, largeUpperBound); // play around with these bounds
		}
	}

	public Colors setRandomColor() { // This method selects a random color from the Colors enumeration
		return Colors.values()[new Random().nextInt(Colors.values().length)];
	}

	public Sizes setRandomSize() { // This method selects a random size from the Sizes enumeration
		return Sizes.values()[new Random().nextInt(Sizes.values().length)];
	}

	// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random
	public double setSizeOfShape(int lowerBound, int upperBound) { // This method sets the size of the shape given an
																	// upper and lower bound, which is unique for each
																	// Sizes enumeration
		return Math.random() * (upperBound - lowerBound) + lowerBound;
	}

	// should there be a method to assign the x and y coordinate, so they are not
	// too far from one another and take up the whole screen?
	public double setXLocation(int lowerBound, int upperBound) { // This method sets the x coordinate of a shape, given
																	// the bounds of screen
		return Math.random() * (upperBound - lowerBound) + lowerBound;
	}

	public double setYLocation(double x) {
		double randomChoice = Math.random();
		if (randomChoice < 0.5) {
			return x - randomChoice;
		}
		return x + randomChoice;
	}

	private void render() {
		int count = 0;
		while (count < 10) {
			double rCircle = setXLocation(lowerBoundOfScreenX, upperBoundOfScreenX);
			StdDraw.setColor(assignColorValue(setRandomColor()));
			StdDraw.filledCircle(rCircle, setYLocation(rCircle), assignShapeSize(setRandomSize()));

			double rSquare = setXLocation(lowerBoundOfScreenX, upperBoundOfScreenX);
			StdDraw.setColor(assignColorValue(setRandomColor()));
			StdDraw.filledSquare(rSquare, setYLocation(rSquare), assignShapeSize(setRandomSize()));

			double rElipse = setXLocation(lowerBoundOfScreenX, upperBoundOfScreenX);
			StdDraw.setColor(assignColorValue(setRandomColor()));
			StdDraw.filledEllipse(rElipse, setYLocation(rElipse), assignShapeSize(setRandomSize()), assignShapeSize(setRandomSize()));

			++count;
		}

	}

}
