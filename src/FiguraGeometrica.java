// Autor: Rafel Dalmau
// Data: 26/02/2025
// Descripció: Classe abstracta per a figures geomètriques.

public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica> {
    public abstract double area();
    
    @Override
    public int compareTo(FiguraGeometrica altra) {
        return Double.compare(this.area(), altra.area());
    }
}
