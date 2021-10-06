
package Game;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Nikola
 */
public class GameFrame extends JFrame
{
    private GamePanel game;
    
    public GameFrame()
    {
        // Add text to title bar 
        super("ULJEZI IZ SVEMIRA");
        
        // Make sure the program exits when the close button is clicked
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        // Create an instance of the Game class and turn on double buffering
        //  to ensure smooth animation
        game = new GamePanel();
        game.setDoubleBuffered(true);
        
        // Add the Breakout instance to this frame's content pane to display it
        this.getContentPane().add(game); 
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        // Start the game
        game.start();  
    }
    
    public static void main(String[] args) 
    {
         java.awt.EventQueue.invokeLater(() -> {
             new GameFrame().setVisible(true);
         });
        
    }
}
