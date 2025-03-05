package Figures;
/**
 * 
 * @author Rafel Dalmau
 * @version 1.0 26/02/2025
 * 
 */

public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica> {
    public abstract double area();
    
    @Override
    public int compareTo(FiguraGeometrica altra) {
        return Double.compare(this.area(), altra.area());
    }
}
