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
     * First point of the LineSegment
     */
    private Point p1;
    /**
     * Second point of the LineSegment
     */
    private Point p2;

    /**
     * Creates a LineSegment from a set of points
     * @param p1 the first point of the LineSegment
     * @param p2 the second point of the LineSegment
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

    /**
     * Gets the first point of this LineSegment
     * @return the first point of this LineSegment
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Sets the first point of this LineSegment
     * @param p1 the first point of this LineSegment
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    /**
     * Gets the second point of this LineSegment
     * @return the second point of this LineSegment
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Sets the second point of this LineSegment
     * @param p2 the second point of this LineSegment
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }
    
    /**
     * Calculates the length along the x axis
     * @return the length along the x axis
     */
    public double getXLength() {
        return Math.abs(this.p2.getX() - this.p1.getX());
    }
    
    /**
     * Calculates the length along the y axis
     * @return the length along the x axis
     */
    public double getYLength() {
        return Math.abs(this.p2.getY() - this.p1.getY());
    }
    
    /**
     * Calculates the length along the z axis
     * @return the length along the z axis
     */
    public double getZLength() {
        return Math.abs(this.p2.getZ() - this.p1.getZ());
    }
    
    /**
     * Calculates the magnitude of this LineSegment
     * @return the magnitude of this LineSegment
     */
    public double getMagnitude() {
        //Caculate Length of the unit lines
        double xLength = this.getXLength();
        double yLength = this.getYLength();
        double zLength = this.getZLength();
        
        //Caculate distance between the points
        return Math.sqrt(xLength*xLength + yLength*yLength + zLength*zLength);
    }
    
    /**
     * Calculates the azimuthal angle, in radians, of this LineSegment 
     * as measured at the first point of this LineSegment
     * @return the azimuthal angle, in radians, of this LineSegment as 
     * measured at the first point of this LineSegment
     */
    public double getAzimuth() {
        return Math.atan2(this.getYLength(), this.getXLength());
    }
    
    /**
     * Calculates the polar angle, in radians, of this LineSegment 
     * as measured at the first point of this LineSegment
     * @return the polar angle, in radians, of this LineSegment as 
     * measured at the first point of this LineSegment
     */
    public double getInclination() {
        return Math.acos((this.getZLength())/(this.getMagnitude()));
    }

    /**
     * The toString method.
     * @return this object as a string.
     */
    @Override
    public String toString() {
        return "LineSegment{" + "p1=" + p1 + ", p2=" + p2 + '}';
    }
    
}
