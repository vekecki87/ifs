
package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Nikola
 */
public class Bullet extends MovingGameObject {

    // My player ship shoots bullets!
    int diameter;
    int yVelocity;

    // Constructor for bullet
    public Bullet(int xPosition, int yPosition, int diameter, Color color) {
        super(xPosition, yPosition, 0, 0, color);
        this.diameter = diameter;
    }

    // Gets the diameter of the bullet
    public int getDiameter() {
        return diameter;
    }

    // Used to draw the bullet
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(this.getXPosition(), this.getYPosition(), 6, 12);

    }

    @Override
    public Rectangle getBounds() {
        Rectangle bulletHitbox = new Rectangle(xPos, yPos, 6, 12);
        return bulletHitbox;
    }
}
