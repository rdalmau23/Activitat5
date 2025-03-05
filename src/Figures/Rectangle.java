/**
 * 
 * @author Rafel Dalmau
 * @version 1.0 26/02/2025
 * 
 */

package Figures;

public class Rectangle extends FiguraGeometrica {
    private double ample;
    private double alt;
    
    public Rectangle(double ample, double alt) {
        this.ample = ample;
        this.alt = alt;
    }
    
    @Override
    public double area() {
        return ample * alt;
    }
    
    @Override
    public String toString() {
        return "Rectangle [ample=" + ample + ", alt=" + alt + ", area=" + area() + "]";
    }
}