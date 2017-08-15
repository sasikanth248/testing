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
@SuppressWarnings(value={ "deprecation", "serial" })
public class CanvasBackSlide extends Canvas {
	String type=null;
	public CanvasBackSlide(String type){
		this.type=type;
	}
	public void paint(Graphics g){
		setBackground(Color.WHITE);
		if(type.equalsIgnoreCase("grid")){
			
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
			
		}else if(("vertical stripes").equalsIgnoreCase(type)){
			for(int j=0;j<401;j+=10){
				g.drawRect(j, 0, 5, 400);
			}
			g.setColor(Color.BLACK);
		}
		else if(("horizontal stripes").equalsIgnoreCase(type)){
			for(int j=0;j<401;j+=10){
				g.drawRect(0, j, 400, 5);
			}
			g.setColor(Color.BLACK);
		}
		else{
			for(int i=0;i<401;i+=30){
				g.drawRect(i, i+15, 400, 400);
			}
			for(int j=0;j<401;j+=4){
				g.drawLine(0, j, j, 400);
			}
		}
		setForeground(Color.BLACK);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CanvasBackSlide cm=new CanvasBackSlide("horizontal stripes");
		JFrame jp=new JFrame();
		jp.add(cm);
		jp.setSize(400,400);
		jp.setVisible(true);
		jp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
