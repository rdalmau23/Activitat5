/**
 * 
 * @author Rafel Dalmau
 * @version 1.0 26/02/2025
 * 
 */

package Figures;

public class Triangle extends FiguraGeometrica {
    private double base;
    private double altura;
    
    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double area() {
        return (base * altura) / 2;
    }
    
    @Override
    public String toString() {
        return "Triangle [base=" + base + ", altura=" + altura + ", area=" + area() + "]";
    }
}