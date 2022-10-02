import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessFrame extends JFrame {
	
	private BoardPanel panel;
	
	public ChessFrame() {
		
		panel = new BoardPanel();
		this.setContentPane(panel);
		
		
		
		this.setVisible(true);	// makes this frame visible
		this.setSize(400, 400);	// gives dimensions (400px x 400px) to the frame
		this.setTitle("My first impressive frame!");	// sets the title to "My first impressive frame!"		
										// We need to declare "JFrame.")
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// makes the frame close when you click (X) icon on the window.
	}
	
	
	class BoardPanel extends JPanel{
		private static final int ROWS = 8;
		private static final int COLUMNS = 8;
		
					// overriding inherited method "paintComponent()" which exists in and paints every graphical object in Java
		public void paintComponent(Graphics g) {
			
								// getting windows height and splitting it in 8 parts
			int sqSize = this.getHeight()/8;
			
			for (int i=0; i<ROWS; i++) {
				for (int j=0; j<COLUMNS; j++) {
					int x = j * sqSize;
					int y = i * sqSize;
					g.setColor(Color.green);
					g.fillRect(x, y, sqSize, sqSize);
					
					if ((i+j) % 2 == 0) {
						g.setColor(Color.MAGENTA);
						g.fillRect(x, y, sqSize, sqSize);					
					}
					
				}
			}
		}
		
		
		
		
	}
	

}
