package shapesort;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;
import shapesort.Paint;
import shapesort.Shape;
public class UI extends JComponent{
	  public static void main(String s[]) {  
		  	UI layout = new UI(); 
	        JFrame frame = new JFrame("Display shapes");  
	        JPanel panel = new JPanel();  
	        panel.setLayout(new FlowLayout());  
	        JButton buttonLoad = new JButton();
	        JButton buttonSort = new JButton();
	        buttonLoad.setText("Load Shapes");
	        buttonSort.setText("Sort Shapes");
	        panel.add(buttonLoad);
	        panel.add(buttonSort);
	        panel.add(layout);
	        frame.add(panel);  
	        frame.setSize(600, 600);
	        frame.setLocationRelativeTo(null);  
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        frame.setVisible(true);  
	    }  
	  
	  
	  public void paint(Graphics g) {
		  g.setColor(Color.green);  
	      g.fillRect(30, 30, 100, 100);  
	    }

//	    public void paint(Graphics g) {
//	    	int x = 0;
//			int y = 0;
//	    	Shape s = new Shape(x,y);
//	        paintComponent(s, g, 131, 21, 1);
//	    }
	  
	  
	  
	  
	  public static void paintComponent(Shape s,Graphics g,int cR,int cG, int cB) {
			
			assert (cR<=255);
			assert (cG<=255);
			assert (cB<=255);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(new Color(cR, cG, cB));//
			if (s.shape.getClass().getGenericSuperclass().equals(Rectangle2D.class)) {
				Rectangle2D lrec = (Rectangle2D) s.shape;
				g2d.drawRect((int)lrec.getX(), (int)lrec.getY(), (int)lrec.getWidth(), (int)lrec.getHeight());
			}else if (s.shape.getClass().getGenericSuperclass().equals(Ellipse2D.class)) {
				Ellipse2D lcrc = (Ellipse2D) s.shape;
				g2d.drawOval((int)lcrc.getX(),(int)lcrc.getY(), (int)lcrc.getWidth(), (int)lcrc.getHeight());
			}else {
				throw new IllegalArgumentException("Object is not in given parameters of Defined Shapes ");
			}
			} 
	


}
