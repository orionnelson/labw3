package shapesort;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author orion 216305377
 *
 */
public abstract class Shape implements ShapeProperties {

	/**
	 * upper x coordinate
	 */
	public int upperX;
	/**
	 * upper y coordinate
	 */
	public int upperY;
	/**
	 * width of shape
	 */
	public int width;
	/**
	 * height of shape
	 */
	public int height;
	/**
	 * color of shape
	 */
	public Color shapeColor;

	/**
	 * Class's constructor
	 * 
	 * @param upperX  upper x coordinate
	 * @param upperY upper y coordinate
	 * @param width width of shape
	 * @param height height of shape
	 * @param shapeColor color of shape
	 */
	/**
	 * @param upperX upper x coordinate
	 * @param upperY upper y coordinate
	 * @param width width of shape
	 * @param height height of shape
	 * @param shapeColor color of shape
	 * 
	 * Parent abstract shape class
	 */
	public Shape(int upperX, int upperY, int width, int height, Color shapeColor) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = height;
		this.shapeColor = shapeColor;
	}

	/**
	 * @param o another Shape object to be compared to
	 * @return
	 */
	public int compareTo(Shape o) {
		// TODO write the right Java code here to support the comparison
		return (int) (this.getArea() - o.getArea());
	}

	/**
	 * @param o another object to be compared to
	 * @return
	 */
	public int compareTo(Object o) {
		
		return (int)(this.compareTo((Shape) o));
	}

	/**
	 * Method to draw a rectangle
	 * 
	 * @param form graphics form
	 */
	/**
	 * @param form graphics form
	 * @throws Illegal Argument if not overridden.
	 */
	public void drawShape(Graphics form) {
		throw new IllegalArgumentException("You havent overrode drawShape in your shape you dum swine");
	}

	// getters
	/**
	 * Gets Color
	 */
	public Color getColor() {
		return this.shapeColor;
	}
	/**
	 * Gets Width
	 */
	public int getWidth() {
		return this.width;
	}
	/**
	 * Gets Height
	 */
	public int getHeight() {
		return this.height;
	}
	/**
	 * Gets Upper X
	 */
	public int getUpperX() {
		return this.upperX;
	}
	/**
	 *  Gets Upper Y
	 */
	public int getUpperY() {
		return this.upperY;
	}

	/**
	 * @return Area of any Shape
	 */
	public int getArea() {
		if (this.getClass().equals(shapesort.Rectangle.class)||this.getClass().equals(shapesort.Square.class)) {
			return (int) ((this.getHeight() * this.getWidth()));
		} else if (this.getClass().equals(shapesort.Circle.class)) {
			return (int) ((Math.PI * (this.getHeight() / 2) * (this.getWidth() / 2)));
		}
		else
		{
			throw new IllegalArgumentException("Bad getArea() Implent New Shape In Shape.java");
		}
	}

	// setters
	/**
	 * @param aShapeColor java.awt.Color
	 *  Sets color extends -> this
	 */
	public void setColor(Color aShapeColor) {
		this.shapeColor = aShapeColor;
	}

	/**
	 *@param width integer
	 * Sets width extends -> this 
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Sets height extends -> this 
	 * @param height integer
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @param upperX Upper x Coordinate
	 */
	public void setUpperX(int upperX) {
		this.upperX = upperX;
	}

	/**
	 * @param upperY Upper Y Coordinate
	 */
	public void setUpperY(int upperY) {
		this.upperY = upperY;
	}

}
