/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.libJPhysics.math;

/**
 * A object that represents a vector in a 3d coordinate system.
 * @author ryancwilliams
 */
public class Vector extends LineSegment {
    
    /**
     * Creates a Vector from a set of points
     * @param p1 the initial point of the Vector
     * @param p2 the terminal point of the Vector
     */
    public Vector(Point p1, Point p2) {
        super(p1, p2);
    }

    /**
     * Creates a Vector from 2 sets of 3d coordinates
     * @param x1 the x coordinate of the initial point
     * @param y1 the y coordinate of the initial point
     * @param z1 the z coordinate of the initial point
     * @param x2 the x coordinate of the terminal point
     * @param y2 the y coordinate of the terminal point
     * @param z2 the z coordinate of the terminal point
     */
    public Vector(double x1, double y1, double z1, double x2, double y2, double z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    /**
     * Creates a Vector from 2 sets of 2d coordinates
     * @param x1 the x coordinate of the initial point
     * @param y1 the y coordinate of the initial point
     * @param x2 the x coordinate of the terminal point
     * @param y2 the y coordinate of the terminal point
     */
    public Vector(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }
    
    /**
     * Creates a bound vector from a point.
     * @param terminal the terminal point of the Vector
     */
    public Vector(Point terminal) {
        super(Point.origin, terminal);
    }
    
    /**
     * Creates a bound vector from a set of 3d coordinates
     * @param x the x coordinate of the terminal point
     * @param y the y coordinate of the terminal point
     * @param z the z coordinate of the terminal point
     */
    public Vector(double x, double y, double z) {
        this(new Point(x, y, z));
    }
    
    /**
     * Creates a bound vector from a set of 2d coordinates
     * @param x the x coordinate of the terminal point
     * @param y the y coordinate of the terminal point
     */
    public Vector(double x, double y) {
        this(new Point(x, y));
    }
    
}
