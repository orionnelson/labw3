package shapesort;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	/**
	 * This instantiates a new array shapeList
	 */
	List<Object> shapeList = new ArrayList<Object>();
	final int CONST_SHAPES = 6;


	private Object shapeFactoryHelper(int cordsx, int cordsy) {
		Random num = new Random();
		int choice = num.nextInt(3);
		int rdw = num.nextInt(100);
		int rdh = num.nextInt(100);
		//System.out.println(choice);
		Color randomcolor = new Color(num.nextInt(256), num.nextInt(256), num.nextInt(256));
		switch (choice) {
		case 0:
			// Generates Random Rectangle
			//System.out.println(rdh + " " + rdw + " " + cordsx + " " + cordsy);
			// it is a rectangle so therefore length!= width
			return new Rectangle(cordsx, cordsy, rdh, rdw, randomcolor);

		case 1:
			// Generates Random Square
			//System.out.println(rdh + " " + rdw + " " + cordsx + " " + cordsy);
			return new Square(cordsx, cordsy, rdh, randomcolor);

		case 2:
			// Generates Random Circle
			//System.out.println(rdh + " " + rdw + " " + cordsx + " " + cordsy);
			return new Circle(cordsx, cordsy, rdw, rdw, randomcolor);
		}
		return null;

	}

	private int[] shapeFactoryHelper2(Object shape) {
		int[] cor = new int[2];
		if (shape.getClass().equals(Circle.class)) {
			Circle cshape = (Circle) shape;
			//System.out.println(cshape.getHeight() + " AHHHHHH HEIGHT");
			cor[1] = cshape.getHeight();
			cor[0] = cshape.getWidth();
		} else if (shape.getClass().equals(Rectangle.class)) {
			Rectangle rshape = (Rectangle) shape;
			cor[1] = rshape.getHeight();
			cor[0] = rshape.getWidth();

		}  else if (shape.getClass().equals(Square.class)) {
			Square sshape = (Square) shape;
			cor[1] = sshape.getHeight();
			cor[0] = sshape.getWidth();
			
		}else {
			throw new IllegalArgumentException("Error: shapeFactoryHelper2 :" + shape.getClass());
		}
		
		return cor;

	}

	/**
	 * @return an Array Of Shapes that are Randomly Generated
	 */
	private List<Object> shapeFactory() {
		int startx = 0, starty = 0;
		List<Object> shapeList = new ArrayList<Object>();
		for (int i = 0; i < CONST_SHAPES; i++) {
			Object shapetest = shapeFactoryHelper(startx, starty);
			//System.out.println(((Shape)shapetest).getColor());
			int[] cor = shapeFactoryHelper2(shapetest);
			//System.out.println(Arrays.toString(cor));
			startx += cor[0];
			starty += cor[1];
			shapeList.add(shapetest);
		}
		printList(shapeList);

		return shapeList;
	}

	/**
	 * @return A shapelist that has updated UpperX and UpperY Values
	 */
	List<Object> orderFactory() {
		int startx = 0, starty = 0;
		for (int i = 0; i < shapeList.size(); i++) {
			Object shape = shapeList.get(i);
			int[] cor = shapeFactoryHelper2(shapeList.get(i));
			if (shape.getClass().equals(shapesort.Circle.class)) {
				Circle cshape = (Circle) shape;
				cshape.setUpperX(startx);
				cshape.setUpperY(starty);
				shapeList.set(i, cshape);
			} else if (shape.getClass().equals(shapesort.Rectangle.class)) {
				Rectangle rshape = (Rectangle) shape;
				rshape.setUpperX(startx);
				rshape.setUpperY(starty);
				shapeList.set(i, rshape);
			}else if (shape.getClass().equals(shapesort.Square.class)) {
				Square sshape = (Square) shape;
				sshape.setUpperX(startx);
				sshape.setUpperY(starty);
				shapeList.set(i, sshape);
				
			}
			startx += cor[0];
			starty += cor[1];
		}
		printList(shapeList);
		return shapeList;
	}

	/**
	 * @param shapeList List of shapes to Paint
	 * @param g2d g2d object -> from paintComponet 
	 */
	public void paintList(List<Object> shapeList, Graphics2D g2d) {
		for (Object shape : shapeList) {
			System.out.println(shape.getClass());
			if (shape.getClass().equals(shapesort.Circle.class)) {
				System.out.println("Circle");
				Circle cshape = (Circle) shape;
				g2d.setColor(cshape.getColor());
				cshape.drawShape(g2d);
			} else if (shape.getClass().equals(Rectangle.class)) {
				System.out.println("Rectangle");
				Rectangle rshape = (Rectangle) shape;
				
				g2d.setColor(rshape.getColor());
				rshape.drawShape(g2d);
			}else if (shape.getClass().equals(Square.class)) {
                Square sshape = (Square) shape;
				g2d.setColor(sshape.getColor());
				sshape.drawShape(g2d);
				
			} else {
				System.out.println("Error");

			}
		}

	}

	/**
	 * This method paints all the current shapes in @param shapeList
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		// calling the method that creates two shapes (rectangles)
		paintList(shapeList, g2d);
	}

	/**
	 * This is the main method of the class. Creates a window and Buttons
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MyPanel rects = new MyPanel();
		JFrame frame = new JFrame("Display two shapes (rectangles)");
		JButton buttonLoad = new JButton("Load Shapes");
		JButton buttonSort = new JButton("Sort Shapes");
		buttonLoad.setBounds(100, 20, 150, 50);
		buttonSort.setBounds(270, 20, 150, 50);
		buttonLoad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				rects.newShapes();
				rects.repaint();

				// your actions
			}
		});

		buttonSort.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				rects.sort();
				rects.orderFactory();
				rects.repaint();
				// your actions
			}
		});
		frame.add(buttonLoad);
		frame.add(buttonSort);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(rects);
		frame.setSize(600, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	/**
	 * Generates a new set of Shapes
	 */
	protected void newShapes() {
		shapeList = shapeFactory();
		printList(shapeList);
		// TODO Auto-generated method stub
	}
	/**
	 * @param shapeList List of shapes to print properties of
	 */
	protected void printList(List<Object> shapeList) {
		for (Object shape : shapeList) {
			Shape shape1 = (Shape) shape;
			System.out.println(shape1.height + "h "+ shape1.width + "w " + shape1.upperX+"ux" + shape1.upperY+"uy :" + shape1.shapeColor+ "c " + shape1.getArea() + "a " + "C:" + shape1.getClass());
			
		}
		
	}
	/**
	 * sorts shapeList if it is not null.
	 */
	protected void sort() {
		if(shapeList!=null) {
		Object[] shapeLR = shapeList.toArray();
		ShapeSort.sort(shapeLR);
		shapeList = Arrays.asList(shapeLR);
		orderFactory();
		}
	}
}
	