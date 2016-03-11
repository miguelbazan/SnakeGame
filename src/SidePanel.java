
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * The {@code SidePanel} class is responsible for displaying statistics and
 * controls to the player.
 * @author Brendan Jones
 *
 */
public class SidePanel extends JPanel {
	
	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = -40557434900946408L;

	/**
	 * The large font to draw with.
	 */
	private static final Font LARGE_FONT = new Font("Tahoma", Font.BOLD, 20);
	
	/**
	 * The medium font to draw with.
	 */
	private static final Font MEDIUM_FONT = new Font("Tahoma", Font.BOLD, 16);

	/**
	 * The small font to draw with.
	 */
	private static final Font SMALL_FONT = new Font("Tahoma", Font.BOLD, 12);
	
	/**
	 * The SnakeGame instance.
	 */
	private SnakeGame game;
	
	/**
	 * Creates a new SidePanel instance.
	 * @param game The SnakeGame instance.
	 */
	public SidePanel(SnakeGame game) {
		this.game = game;
		
		setPreferredSize(new Dimension(300, BoardPanel.ROW_COUNT *
                        BoardPanel.TILE_SIZE));
		setBackground(Color.orange);
	}
	
	private static final int STATISTICS_OFFSET = 150;
	
	private static final int CONTROLS_OFFSET = 250;
	
	private static final int MESSAGE_STRIDE = 20;
	
	private static final int SMALL_OFFSET = 30;
	
	private static final int LARGE_OFFSET = 50;
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		/*
		 * Set the color to draw the font in to white.
		 */
		g.setColor(Color.BLUE);
		
		/*
		 * Draw the game name onto the window.
		 */
		g.setFont(LARGE_FONT);
		g.drawString("Snake Game", getWidth() / 
                        2 - g.getFontMetrics().stringWidth("Snake Game")
                                / 2, 50);
		
		/*
		 * Draw the categories onto the window.
		 */
		g.setFont(MEDIUM_FONT);
		g.drawString("Statistics", SMALL_OFFSET, STATISTICS_OFFSET);
		g.drawString("Controls", SMALL_OFFSET, CONTROLS_OFFSET);
				
		/*
		 * Draw the category content onto the window.
		 */
		g.setFont(SMALL_FONT);
		
		//Draw the content for the statistics category.
		int drawY = STATISTICS_OFFSET;
		g.drawString("Total Score: " + game.getScore(), 
                        LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Fruit Eaten: " + game.getFruitsEaten(), 
                        LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Extra Score: " + game.getNextFruitScore(),
                        LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		//Draw the content for the controls category.
		drawY = CONTROLS_OFFSET;
		g.drawString("Move Up: Up Arrowkey", LARGE_OFFSET, 
                        drawY += MESSAGE_STRIDE);
		g.drawString("Move Down: Down Arrowkey", LARGE_OFFSET, 
                        drawY += MESSAGE_STRIDE);
		g.drawString("Move Left: Left Arrowkey", LARGE_OFFSET,
                        drawY += MESSAGE_STRIDE);
		g.drawString("Move Right: Right Arrowkey", LARGE_OFFSET, 
                        drawY += MESSAGE_STRIDE);
		g.drawString("Pause Game: P", LARGE_OFFSET, 
                        drawY += MESSAGE_STRIDE);
                g.drawString("Guardar Juego: G", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
                g.drawString("Cargar Juego: C", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
                g.drawString("Red adds 1 tile +50 pts.", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
                g.drawString("Blue adds 2 tile +100 pts.", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
                g.drawString("Green adds 3 tile +200 pts.", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
                g.drawString("Brown = Game Over.", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
                
	}

}