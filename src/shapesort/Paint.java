package shapesort;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paint extends JPanel {
	
	public static void paintComponent(Shape s,Graphics g,int cR,int cG, int cB) {
		
		assert (cR<=255);
		assert (cG<=255);
		assert (cB<=255);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(cR, cG, cB));//
		g2d.fill((java.awt.Shape) s);
		} 
}
