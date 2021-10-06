package shapesort;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	/**
	 * This method creates two rectangles
	 * @return
	 */
	private List<MyRectangle> createTwoRectangles(){
		Color myColor1 = new Color(231, 151, 44);
		MyRectangle rectangleShape1 = new MyRectangle (50, 95, 44, 48, myColor1);
		   
		Color myColor2 = new Color(131, 151, 44);
		MyRectangle rectangleShape2 = new MyRectangle (150, 138, 72, 45, myColor2);
		
		List<MyRectangle> shapeList = new ArrayList <MyRectangle>();
		shapeList.add(rectangleShape1);
		shapeList.add(rectangleShape2);
		
		return shapeList;
	}
	
	/**
	 * This method displays the created rectangles.
	 */
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g;
      
      //calling the method that creates two shapes (rectangles)
      List<MyRectangle> shapeList = createTwoRectangles();
      
      for (MyRectangle shape: shapeList) {
    	  g2d.setColor(shape.getColor());
    	  shape.drawShape(g2d);
      }
   } 
   
   /**
    * This is the main method of the class.
    * @param args
    */
   public static void main(String[] args) {
      MyPanel rects = new MyPanel();
      JFrame frame = new JFrame("Display two shapes (rectangles)");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(rects);
      frame.setSize(600, 600);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
