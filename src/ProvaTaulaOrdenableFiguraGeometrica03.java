// Autor: Rafel Dalmau
// Data: 26/02/2025
// Descripció: Classe de prova per verificar el funcionament de TaulaOrdenableFiguraGeometrica.

public class ProvaTaulaOrdenableFiguraGeometrica03 {
    public static void main(String[] args) {
        TaulaOrdenableFiguraGeometrica taula = new TaulaOrdenableFiguraGeometrica(50);
        
        taula.afegir(new Rectangle(4, 5));
        taula.afegir(new Cercle(3));
        taula.afegir(new Cercle(5));
        taula.afegir(new Triangle(3, 4));
        taula.afegir(new Triangle(6, 8));
        
        System.out.println("Taula abans d'ordenar:");
        taula.visualitzar();
        
        taula.ordenar();
        
        System.out.println("\nTaula després d'ordenar:");
        taula.visualitzar();
    }
}
