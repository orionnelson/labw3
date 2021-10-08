package shapesort;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author orion 216305377
 *
 */
public class Square extends Rectangle {
	
	/**
	 *  upper x coordinate
	 */
	protected int upperX; 
	/**
	 *  upper y coordinate
	 */
	protected int upperY;
	/**
	 *  width of square
	 */
	protected int width;
	/**
	 * height of square
	 */
	protected int height;
	/**
	 *  color of square
	 */
	protected Color shapeColor;
	
	/**
	 * Class's constructor
	 * 
	 * @param upperX  upper x coordinate
	 * @param upperY upper y coordinate
	 * @param width width of square
	 * @param height height of square
	 * @param shapeColor color of square
	 */
	/**
	 * @param upperX upper x coordinate
	 * @param upperY upper y coordinate
	 * @param width width of square
	 * @param height height of square
	 * @param shapeColor  color of square
	 * 
	 * Method calls an abstract parent Rectangle constructor and sets its own values.
	 */
	public Square(int upperX, int upperY, int length, Color shapeColor) {
		super( upperX, upperY,  length, length, shapeColor);
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = length;
		this.height = length;
		this.shapeColor = shapeColor;
	}
	

	/**
	 * @param o another Rectangle object to be compared to
	 * @return difference
	 */
	public int compareTo(Rectangle o) {
		// TODO write the right Java code here to support the comparison
		return (int)( this.getArea() - o.getArea());
	}
	/**
	 * @param o another Circle object to be compared to
	 * @return difference
	 */
	public int compareTo(Circle o) {
		// TODO write the right Java code here to support the comparison
		return  (int)(this.getArea() - o.getArea());
	}
	/**
	 * @param o Object to be compared to.
	 */
	@Override
	public int compareTo(Object o) {
		int v = 0;
		if (o.getClass().equals(shapesort.Circle.class)) {
			v = this.compareTo((Circle)o);
		}else if (o.getClass().equals(shapesort.Rectangle.class)) {
			v = this.compareTo((Rectangle)o);
		}
		return v;
	}
	
	
	/**
	 * Method to draw a Square
	 * @param form
	 */
	/**
	 *
	 */
	public  void drawShape(Graphics	form) {
		form.fillRect(upperX, upperY, width, height);
	}
	
    
	/**
	 * Gets Color From Parent
	 */
	public Color getColor() {
		return super.getColor();
	}
    
	/**
	 * Gets Width
	 */
    public int getWidth() {
    	return super.getWidth();
    }
    
    /**
	 * Gets Height from Parent
	 */
    public int getHeight() {
    	return super.getHeight();
    }
    
    /**
	 * Gets Upper X  From Parent
	 */
	public int getUpperX() {
		return super.getUpperX();
	}
	
	/**
	 * Gets Upper Y From Parent
	 */
	public int getUpperY() {
		this.setUpperY(super.getUpperY());
		return super.getUpperY();
	}
	
	// Lazy 
	/**
	 * gets Area from Parent -> *Shape
	 */
	public int getArea() {
		return super.getArea();
	}
	
	//setters
	 /**
	 * @param aShapeColor java.awt.Color
	 *  Sets color extends -> this , parent
	 */
	public void setColor(Color aShapeColor) {
		 super.setColor(aShapeColor);
		 this.shapeColor = aShapeColor;
	 }
	 
	 /**
	 * @param width integer
	 * Sets width extends -> this , parent
	 */
	public void setWidth( int width) {
		 super.setWidth(width);
		 this.width = width;
	 }
	    
	 /**
	 * Sets height extends -> this , parent
	 * @param height integer
	 */
	public void setHeight(int height) {
		 super.setHeight(height);
		 this.height = height;
	 }
	 
	 /**
	 *  @param upperX Upper x Coordinate
	 */
	public void setUpperX(int upperX) {
		 super.setUpperX(upperX);
		 this.upperX = upperX;
	 }
		
	 /**
	 * @param upperY Upper Y Coordinate
	 */
	public void setUpperY(int upperY) {
		 super.setUpperY(upperY);
		 this.upperY = upperY;
	 }

}
