
import com.github.ryancwilliams.libJPhysics.math.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryancwilliams
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vector a = new Vector(1, 2, 3);
        Vector b = new Vector(3, 4, 5);
        
        Vector result = Vector.crossProduct(a, b);
        
        System.out.println(result);
    }
}
