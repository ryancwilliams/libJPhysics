/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.libJPhysics.math;

/**
 * A object that represents a line in a 3d coordinate system.
 * @author ryancwilliams
 */
public class LineSegment {
    
    /**
     * First point of the vector
     */
    private Point p1;
    /**
     * Second point of the vector
     */
    private Point p2;

    /**
     * Creates a LineSegment from a set of points
     * @param p1 the first point of the vector
     * @param p2 the second point of the vector
     */
    public LineSegment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    /**
     * Creates a LineSegment from 2 sets of 3d coordinates
     * @param x1 the x coordinate of the first point
     * @param y1 the y coordinate of the first point
     * @param z1 the z coordinate of the first point
     * @param x2 the x coordinate of the second point
     * @param y2 the y coordinate of the second point
     * @param z2 the z coordinate of the second point
     */
    public LineSegment(double x1, double y1, double z1, 
            double x2, double y2, double z2) {
        this(new Point(x1, y1, z1), new Point(x2, y2, z2));
    }
    
    /**
     * Creates a LineSegment from 2 sets of 2d coordinates
     * @param x1 the x coordinate of the first point
     * @param y1 the y coordinate of the first point
     * @param x2 the x coordinate of the second point
     * @param y2 the y coordinate of the second point
     */
    public LineSegment(double x1, double y1, double x2, double y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }
    
    
    
}
