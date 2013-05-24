/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.libJPhysics.math;

/**
 * A object that represents a spatial point in a 3d coordinate system. 
 * @author ryancwilliams
 */
public class Point {
    
    /**
     * A point that represents the ORIGIN of the coordinate system  
     */
    public final static Point ORIGIN = new Point(0, 0, 0);
    
    /**
     * The x coordinate of this point
     */
    private double x;
    /**
     * The y coordinate of this point
     */
    private double y;
    /**
     * The z coordinate of this point
     */
    private double z;

    /**
     * Creates a point object
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     * @param z the z coordinate of the point
     */
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    /**
     * Creates a point object on the XY plane
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     */
    public Point(double x, double y) {
        this(x, y, 0);
    }

    /**
     * Gets the x coordinate of this point
     * @return the x coordinate of this point
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the x coordinate of this point
     * @param x the x coordinate of this point
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Gets the y coordinate of this point
     * @return the y coordinate of this point
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the y coordinate of this point
     * @param y the y coordinate of this point
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Gets the z coordinate of this point
     * @return the z coordinate of this point
     */
    public double getZ() {
        return z;
    }

    /**
     * Sets the z coordinate of this point
     * @param z the z coordinate of this point
     */
    public void setZ(double z) {
        this.z = z;
    }

    /**
     * The toString method. 
     * @return this object as a string.
     */
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
    
}
