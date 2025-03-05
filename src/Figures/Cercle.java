/**
 * 
 * @author Rafel Dalmau
 * @version 1.0 26/02/2025
 * 
 */

package Figures;

public class Cercle extends FiguraGeometrica {
    private double radi;
    
    public Cercle(double radi) {
        this.radi = radi;
    }
    
    @Override
    public double area() {
        return Math.PI * radi * radi;
    }
    
    @Override
    public String toString() {
        return "Cercle [radi=" + radi + ", area=" + area() + "]";
    }
} 
