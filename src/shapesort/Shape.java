package shapesort;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.List;
import java.util.Random;
import shapesort.Paint;

public class Shape implements Comparable<Shape>  {
	
	
	public int area; // Area of enclosing rectangle
	public int cordsx;// top left coordinate of shape
	public int cordsy;
	public Object shape;
	
	
	public Shape() { //Void shape defaults to square 
		this(0,0);
	}
	
	public Shape(int cordsx,int cordsy) {
		this.cordsx = cordsx;
		this.cordsy = cordsy;
		this.shape = shapeFactory(this.cordsx,this.cordsy);
		if (this.shape.getClass().getGenericSuperclass().equals(Rectangle2D.class)) {
			Rectangle2D lrec = (Rectangle2D) this.shape;
			this.area = (int) (lrec.getHeight() * lrec.getWidth());
		}else if (this.shape.getClass().getGenericSuperclass().equals(Ellipse2D.class)) {
			Ellipse2D lcrc = (Ellipse2D) this.shape;
			this.area = (int)(Math.PI*Math.pow((lcrc.getHeight()/2.0),2)); 
		}else {
			throw new IllegalArgumentException("Object is not in given parameters of Defined Shapes ");
		}
				
	}
	
	
	public static Object shapeFactory(int cordsx,int cordsy) {
		Random num = new Random();
		int choice = num.nextInt(2);
		int rdw = num.nextInt(100);
		int rdh = num.nextInt(100);
		System.out.println(choice);
		switch (choice) {
		case 0:
			System.out.println(rdh + " " + rdw + " " + cordsx + " " + cordsy);
			// it is a rectangle so therefore length!= width
			return new Rectangle2D.Double(rdh, rdw, cordsx, cordsy);

		case 1:
			// Case that it is a square then all we need is to have length== width
			System.out.println(rdh + " " + rdw + " " + cordsx + " " + cordsy);
			return new Rectangle2D.Double(rdh, rdh, cordsx, cordsy);
			
		case 2:
			System.out.println(rdh + " " + rdw + " " + cordsx + " " + cordsy);
			return new Ellipse2D.Double(rdw, rdw, cordsx, cordsy);
		}
		return null;
	}
	
	
	public static void genShapes(JFrame frame) {
		System.out.println("HI");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	@Override
	public int compareTo(Shape arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
