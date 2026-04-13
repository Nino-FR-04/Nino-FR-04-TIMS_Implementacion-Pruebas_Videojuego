package org.timsgame.systems.collision;

/**
 * Represents a specific coordinate point in a 2D Cartesian plane.
 * <p>
 * This class is designed for the collision system to track positions.
 * It enforces constraints to ensure that coordinates remain within
 * non-negative bounds.
 * </p>
 * @version 1.0
 */
public class Coordinate {
    //Attributes
    /**
     * The position of the point along the horizontal X-axis.
     */
    private int positionInX;

    /**
     * The position of the point along the vertical Y-axis.
     */
    private int positionInY;

    /**
     * Constructs a new Coordinate with the specified X and Y positions.
     * @param positionInX Initial point on the X-axis.
     * @param positionInY Initial point on the Y-axis.
     * @throws IllegalArgumentException If either provided value is negative.
     */
    public Coordinate(int positionInX, int positionInY) {
        this.setPositionInX(positionInX);
        this.setPositionInY(positionInY);
    }

    //Getters and Setters
    /**
     * Retrieves the current position on the X-axis.
     * @return The integer value of positionInX.
     */
    public int getPositionInX() {
        return this.positionInX;
    }

    /**
     * Retrieves the current position on the Y-axis.
     * @return The integer value of positionInY.
     */
    public int getPositionInY() {
        return this.positionInY;
    }

    /**
     * Updates the position on the X-axis.
     * @param positionInX The new X coordinate value.
     * @throws IllegalArgumentException If the value is less than 0.
     */
    public void setPositionInX(int positionInX) throws IllegalArgumentException {
        if(positionInX < 0) throw new IllegalArgumentException("Invalid Value to attribute: positionInX");
        this.positionInX = positionInX;
    }

    /**
     * Updates the position on the Y-axis.
     * @param positionInY The new Y coordinate value.
     * @throws IllegalArgumentException If the value is less than 0.
     */
    public void setPositionInY(int positionInY) throws IllegalArgumentException {
        if(positionInY < 0) throw new IllegalArgumentException("Invalid Value to attribute: positionInY");
        this.positionInY = positionInY;
    }

    //Method toString
    /**
     * Returns a string representation of the coordinate.
     * @return A string in the format "[X: n - Y: m]".
     */
    @Override
    public String toString() {
        return "[X: " +
                this.positionInX
                + " - " + "Y: " +
                this.positionInY +
                "]";
    }

    //Method Equals
    /**
     * Compares this coordinate to the specified object.
     * The result is {@code true} if and only if the argument is not null
     * and is a {@code Coordinate} object that represents the same X and Y values.
     * @param object The object to compare this {@code Coordinate} against.
     * @return {@code true} if the coordinates are equal; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object object) {
        if(this == object) return true; // The same object
        if(object == null || this.getClass() != object.getClass()) return false;
        //Cast
        Coordinate coordinate = (Coordinate) object;
        return (this.positionInX == coordinate.positionInX) &&
                    (this.positionInY == coordinate.positionInY);
    }
}