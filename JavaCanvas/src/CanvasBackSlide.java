import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author sasikanth
 *
 */
public class CanvasBackSlide extends Canvas {
	public void paint(Graphics g){
		setBackground(Color.WHITE);
		/*for(int i=0;i<401;i+=30){
			g.drawRect(i, i+15, 400, 400);
		}*/
		/*
			for(int j=0;j<401;j+=4){
				g.drawLine(0, j, j, 400);
			}*/

		for(int j=0;j<401;j+=4){
			g.drawLine(0, j, 400, j);
		}

		for(int j=0;j<401;j+=4){
			g.drawLine(j, 0, j, 400);
		}
		for(int k=40;k<401;k+=40){
			g.drawRect(k, 0,60, 400);
			//g.drawLine(k, 0, k, 400);
		}
		setForeground(Color.BLACK);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CanvasBackSlide cm=new CanvasBackSlide();
		JFrame jp=new JFrame();
		jp.add(cm);
		jp.setSize(400,400);
		jp.setVisible(true);
		jp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
