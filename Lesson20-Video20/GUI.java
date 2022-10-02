import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame {
	
	private Board board;
	
	public GUI() {
		
		board = new Board();
		this.setContentPane(board);
		
		MouseClickListener listener = new MouseClickListener();
		board.addMouseListener(listener);
		
		this.setVisible(true);	// makes this frame visible
		this.setSize(400, 400);	// gives dimensions (400px x 400px) to the frame
		this.setTitle("My first impressive frame!");	// sets the title to "My first impressive frame!"		
										// We need to declare "JFrame.")
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// makes the frame close when you click (X) icon on the window.
	}
	
	
	class Board extends JPanel{
		private static final int ROWS = 8;
		private static final int COLUMNS = 8;
		private int xCoord = 50;
		private int yCoord = 50;
		
		public void setCoordinates(int x, int y) {
			xCoord = x;
			yCoord = y;
		}

		
					// overriding inherited method "paintComponent()" which exists in and paints every graphical object in Java
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
								
			int sqSize = this.getHeight() / ROWS;
			for (int i=0; i<ROWS; i++) { //Σάρωση γραμμών
				for (int j=0; j<COLUMNS; j++) { // Σάρωση στηλών
					int x = j * sqSize;
					int y = i * sqSize;
					g.setColor(Color.BLUE);
					g.fillRect(x, y, sqSize, sqSize);
					
					if ((i+j) % 2 == 0) {
						g.setColor(Color.YELLOW);
						g.fillRect(x, y, sqSize, sqSize);					
					}
					
				}
			}
			
			g.setColor(Color.RED);
			g.fillOval(xCoord, yCoord, 40, 40);
		}
		
	}
	
	class MouseClickListener implements MouseListener{


		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			x = x - 20; // center circle on click point
			y = y - 20;//  center circle on click point
			board.setCoordinates(x, y);
			board.repaint(); // Calling repaint() that calls paintComponent()...
		}

		
		public void mousePressed(MouseEvent e) {}

		public void mouseReleased(MouseEvent e) {}
	
		public void mouseEntered(MouseEvent e) {}
	
		public void mouseExited(MouseEvent e) {}
		
		
		
	}
	

}
