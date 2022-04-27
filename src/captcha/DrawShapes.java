package captcha;

import java.awt.Color;
import java.awt.Font;
import edu.princeton.cs.introcs.StdDraw;
import java.util.ArrayList;
import java.util.Random;

public class DrawShapes {
	private double x; // x coordinate of the shape
	private double y; // y coordinate of the shape
	private double radius; // radius of the circle
	private double halfLength; // one half the length of any side of the square
	private double semiMajorAxis; // is the semimajor axis of the ellipse
	private double semiMinorAxis; // is the semiminor axis of the ellipse

	private double smallLowerBound;
	private double smallUpperBound;
	private double mediumLowerBound;
	private double mediumUpperBound;
	private double largeLowerBound;
	private double largeUpperBound;

	private double lowerBoundOfScreenX; // Fill in these values
	private double upperBoundOfScreenX; // Fill in these values

	private double lowerBoundOfScreenY; // Fill in these values
	private double upperBoundOfScreenY; // Fill in these values
	
	private Color[] myColors=new Color[8];

	public DrawShapes() {
		this.x = 0; 
		this.y = 0; 
		this.radius = 0; 
		this.halfLength =0; 
		this.semiMajorAxis = 0; 
		this.semiMinorAxis = 0; 
		
		this.smallLowerBound = 0.01; 
		this.smallUpperBound = 0.05; 
		this.mediumLowerBound = 0.10; 
		this.mediumUpperBound = 0.15; 
		this.largeLowerBound = 0.20; 
		this.largeUpperBound = 0.25; 
		
		this.lowerBoundOfScreenX = 0;
		this.upperBoundOfScreenX = 1; 
		
		this.lowerBoundOfScreenY = 0; 
		this.upperBoundOfScreenY = 1; 	
		
		this.myColors[0]=Color.CYAN;
		this.myColors[1]=Color.BLUE;
		this.myColors[2]=Color.ORANGE;
		this.myColors[3]=Color.RED;
		this.myColors[4]=Color.GREEN;
		this.myColors[5]=Color.YELLOW;
		this.myColors[6]=Color.PINK;
		this.myColors[7]=Color.GREEN;
		
		StdDraw.setCanvasSize(512, 512); 

	}
	

	private enum Sizes {
		Small, Medium, Large
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
	
	private Color getRandomColor() {
		int randomIdx = (int) (Math.random()*7); 
		return myColors[randomIdx]; 
	}

	private Sizes setRandomSize() { // This method selects a random size from the Sizes enumeration
		return Sizes.values()[new Random().nextInt(Sizes.values().length)];
	}

	// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random
	public double setSizeOfShape(double lowerBound, double upperBound) { // This method sets the size of the shape given an
																	// upper and lower bound, which is unique for each
																	// Sizes enumeration
		return Math.random() * (upperBound - lowerBound) + lowerBound;
	}

	// should there be a method to assign the x and y coordinate, so they are not
	// too far from one another and take up the whole screen?
	public double setXLocation(double lowerBound, double upperBound) { // This method sets the x coordinate of a shape, given
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

	public void render() {
		int count = 0;
		while (count < 100) {
			double rCircle = setXLocation(lowerBoundOfScreenX, upperBoundOfScreenX);
			StdDraw.setPenColor(getRandomColor());
			StdDraw.filledCircle(rCircle, setYLocation(rCircle), assignShapeSize(setRandomSize()));

			double rSquare = setXLocation(lowerBoundOfScreenX, upperBoundOfScreenX);
			StdDraw.setPenColor(getRandomColor());
			StdDraw.filledSquare(rSquare, setYLocation(rSquare), assignShapeSize(setRandomSize()));

			double rElipse = setXLocation(lowerBoundOfScreenX, upperBoundOfScreenX);
			StdDraw.setPenColor(getRandomColor());
			StdDraw.filledEllipse(rElipse, setYLocation(rElipse), assignShapeSize(setRandomSize()), assignShapeSize(setRandomSize()));

			++count;
		}
		

	}

}
