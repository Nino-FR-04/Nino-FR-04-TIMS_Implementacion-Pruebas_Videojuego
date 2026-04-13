package org.timsgame.systems.collision;

/**
 * Represents a generic two-dimensional shape defined by two points in a Cartesian plane.
 * <p>
 * This class serves as a base for specific geometric shapes (like squares and rectangles)
 * used within the collision system.
 * </p>
 * @version 1.0
 */
public class Shape2D {

    /**
     * Defines the supported geometric categories for a 2D shape.
     */
    public enum shapeType {
        SQUARE,
        RECTANGLE
    }

    //Attributes
    /**
     * The primary anchor coordinate (usually the top-left or starting point).
     */
    protected Coordinate firstCoordinate;
    /**
     * The secondary anchor coordinate (usually the bottom-right or ending point).
     */
    protected Coordinate secondCoordinate;
    /**
     * The specific classification of the shape.
     */
    protected shapeType type;

    //Constructor
    /**
     * Constructs a new Shape2D with two coordinates.
     * Defaults the shape type to {@code RECTANGLE}.
     * @param firstCoordinate  The first anchor point.
     * @param secondCoordinate The second anchor point.
     * @throws IllegalArgumentException If either coordinate is {@code null}.
     */
    public Shape2D(Coordinate firstCoordinate, Coordinate secondCoordinate) {
        this.setFirstCoordinate(firstCoordinate);
        this.setSecondCoordinate(secondCoordinate);
        this.type = shapeType.RECTANGLE; // Default Option
    }

    // One constructor is missed here

    //Getters and setters
    /**
     * Retrieves the first coordinate of the shape.
     * @return The {@link Coordinate} object representing the first point.
     */
    public Coordinate getFirstCoordinate() {return this.firstCoordinate;}

    /**
     * Retrieves the second coordinate of the shape.
     * @return The {@link Coordinate} object representing the second point.
     */
    public Coordinate getSecondCoordinate() {return this.secondCoordinate;}

    /**
     * Retrieves the type of the shape.
     * @return The {@link shapeType} assigned to this instance.
     */
    public shapeType getType() {return this.type;}

    /**
     * Updates the first coordinate of the shape.
     * @param firstCoordinate The new coordinate point.
     * @throws IllegalArgumentException If the provided coordinate is {@code null}.
     */
    public void setFirstCoordinate(Coordinate firstCoordinate) throws IllegalArgumentException {
        if(firstCoordinate == null) throw new IllegalArgumentException("Invalid Value to attribute: firstCoordinate");
        this.firstCoordinate = firstCoordinate;
    }

    /**
     * Updates the second coordinate of the shape.
     * @param secondCoordinate The new coordinate point.
     * @throws IllegalArgumentException If the provided coordinate is {@code null}.
     */
    public void setSecondCoordinate(Coordinate secondCoordinate) throws IllegalArgumentException {
        if(secondCoordinate == null) throw new IllegalArgumentException("Invalid Value to attribute: secondCoordinate");
        this.secondCoordinate = secondCoordinate;
    }

    //Method toString
    /**
     * Returns a string representation of the shape, including both points and its type.
     * @return A formatted string: "(FC: [X-Y], SC: [X-Y]) - TYPE".
     */
    @Override
    public String toString() {
        return "(FC: " + this.firstCoordinate +
                ", SC: " + this.secondCoordinate + ") - " +
                this.type;
    }

    //Method Equals
    /**
     * Compares this shape to another object for equality.
     * Two shapes are equal if they share the same coordinates and the same {@code shapeType}.
     * @param object The object to compare with.
     * @return {@code true} if the objects are logically equivalent; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object object) {
        if(this == object) return true; //The same object
        if(object == null || this.getClass() != object.getClass()) return false;

        Shape2D shape = (Shape2D) object;

        return (
                this.firstCoordinate.equals(shape.firstCoordinate) &&
                        this.secondCoordinate.equals(shape.secondCoordinate) &&
                        this.type == shape.type
                );
    }
}