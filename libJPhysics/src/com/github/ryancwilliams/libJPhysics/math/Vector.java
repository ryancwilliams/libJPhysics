/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.libJPhysics.math;

/**
 * A object that represents a vector in a 3d coordinate system. 
 * This class also provides functions for working with Vectors.
 * @author ryancwilliams
 */
public class Vector extends LineSegment {
    
    /**
     * Standard basis for the x axis on the Euclidean plane
     */
    public static final Vector EX = new Vector(1, 0, 0);
    /**
     * Standard basis for the y axis on the Euclidean plane
     */
    public static final Vector EY = new Vector(0, 1, 0);
    /**
     * Standard basis for the z axis on the Euclidean plane
     */
    public static final Vector EZ = new Vector(0, 0, 1);
    
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
        super(Point.ORIGIN, terminal);
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
    
    /**
     * Multiplies a vector by a scalar.
     * @param vector the vector to multiply
     * @param scalar the scalar to multiply by.
     * @return the result vector
     */
    public static Vector scalarMultiply(Vector vector, double scalar) {
        return new Vector(vector.getXLength()*scalar, 
                vector.getYLength()*scalar, 
                vector.getZLength()*scalar);
    }
    
    /**
     * Adds 2 vectors together. 
     * The addition may be represented graphically by placing the tail of the 
     * arrow b at the head of the arrow a, and then drawing an arrow from the 
     * tail of a to the head of b. The new arrow drawn represents the vector 
     * a + b
     * @param a the first vector to add
     * @param b the second vector to add
     * @return the result vector
     */
    public static Vector add(Vector a, Vector b) {
        //Caculate new lengths
        double newX = a.getXLength() + b.getXLength();
        double newY = a.getYLength() + b.getYLength();
        double newZ = a.getZLength() + b.getZLength();
        
        //Return new vector
        return new Vector(newX, newY, newZ);
    }
    
    /**
     * Subtracts a vector from another vector. 
     * The subtraction may be represented graphically by placing the tail of the 
     * arrow b at the tail of the arrow a, and then drawing an arrow from the 
     * head of b to the head of a. The new arrow drawn represents the vector 
     * a - b
     * @param a the vector to subtract from
     * @param b the vector to subtract
     * @return the result vector
     */
    public static Vector subtract(Vector a, Vector b) {
        //Caculate new lengths
        double newX = a.getXLength() - b.getXLength();
        double newY = a.getYLength() - b.getYLength();
        double newZ = a.getZLength() - b.getZLength();
        
        //Return new vector
        return new Vector(newX, newY, newZ);
    }
    
    /**
     * Calculates the dot product of 2 vectors.
     * @param a the first vector.
     * @param b the second vector.
     * @return the result vector.
     */
    public static double dotProduct(Vector a, Vector b) {
        return (a.getXLength()*b.getXLength())+
                (a.getYLength()*b.getYLength())+
                (a.getZLength()*b.getZLength());
    }
    
    /**
     * Calculates the cross product of 2 vectors.
     * @param a the first vector.
     * @param b the second vector.
     * @return the result vector.
     */
    public static Vector crossProduct(Vector a, Vector b) {
        //Caculate new lengths
        double newX = (a.getYLength()*b.getZLength())-(a.getZLength()*b.getYLength());
        double newY = (a.getZLength()*b.getXLength())-(a.getXLength()*b.getZLength());
        double newZ = (a.getXLength()*b.getYLength())-(a.getYLength()*b.getXLength());
        
        //return new Vector
        return new Vector(newX, newY, newZ);
    }
    
    /**
     * Calculates the scalar triple product, or box product, of 3 vectors.
     * @param a the first vector.
     * @param b the second vector.
     * @param c the third vector.
     * @return the result scalar.
     */
    public static double boxProduct(Vector a, Vector b, Vector c) {
        return Vector.dotProduct(a, Vector.crossProduct(b, c));
    }
    
    /**
     * Calculates the vector triple product of 3 vectors.
     * @param a the first vector.
     * @param b the second vector.
     * @param c the third vector.
     * @return the result vector.
     */
    public static Vector vectorTripleProduct(Vector a, Vector b, Vector c) {
        return Vector.crossProduct(a, Vector.crossProduct(b, c));
    }
    
}
