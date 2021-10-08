package shapesort;

import java.awt.Color;
import java.awt.Graphics;


public class Circle extends Shape{

	/**
	 *  upper x coordinate
	 */
	protected int upperX; 
	/**
	 * upper y coordinate
	 */
	protected int upperY;
	/**
	 * width of circle
	 */
	protected int width;
	/**
	 * height of circle
	 */
	protected int height;
	/**
	 * color of circle
	 */
	protected Color shapeColor;
	
	/**
	 * Class's constructor
	 * @param upperX upper x coordinate
	 * @param upperY upper y coordinate
	 * @param width width of circle
	 * @param height height of circle
	 * @param shapeColor color of circle
	 * 
	 * 
	 * Method calls an abstract parent shape constructor and sets its own values.
	 */
	public Circle(int upperX, int upperY, int width, int height, Color shapeColor) {
		super( upperX, upperY,  width, height, shapeColor);
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = height;
		this.shapeColor = shapeColor;
	}
	


	/**
	 * @param o another Circle object to be compared to
	 * @return
	 */
	public int compareTo(Circle o) {
		// TODO write the right Java code here to support the comparison
		return  (int)(this.getArea() -o.getArea());
	}
	/**
	 * @param o another Rectangle Object to be compared to
	 * @return integer value of comparison
	 */
	public int compareTo(Rectangle o) {
		// TODO write the right Java code here to support the comparison
		return  (int)(this.getArea()-o.getArea());
	}
	/**
	 *@param o Object to be compared to.
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
	 * Method to draw a circle
	 * @param form graphics object ->
	 */
	/**
	 *
	 */
	@Override
	public  void drawShape(Graphics	form) {
		form.fillOval(upperX, upperY, width, height);
	}
	
    
    //getters
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
	 * Gets Upper X From Parent
	 */
	public int getUpperX() {
		return super.getUpperX();
	}
	
	/**
	 * Gets Upper Y  From Parent
	 */
	public int getUpperY() {
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
	  * @param Color java.awt.Color
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
	 * @param upperX Upper x Coordinate
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



	/**
	 * @param o Other Shape to be compared to
	 */
	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		return this.getArea()-o.getArea();
	}


}
