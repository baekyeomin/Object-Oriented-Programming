/**
 * Represents a 2D point.
 * @author 백여민
 * @version 1.0
 */
public class PPoint {
    private int x;
    private int y;

    /**
     * Creates a new point.
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public PPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x-coordinate.
     * @return x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the y-coordinate.
     * @return y-coordinate
     */
    public int getY() {
        return y;
    }
}
