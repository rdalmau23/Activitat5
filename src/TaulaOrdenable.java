// Autor: Rafel Dalmau
// Data: 26/02/2025
// Descripció: Classe genèrica per gestionar taules ordenables.

public class TaulaOrdenable<T extends Comparable<T>> {
    private T[] taula;
    private int nrElements;
    
    @SuppressWarnings("unchecked")
    public TaulaOrdenable(int capacitat) {
        taula = (T[]) new Comparable[capacitat];
        nrElements = 0;
    }
    
    public int capacitat() {
        return taula.length;
    }
    
    public int nrElements() {
        return nrElements;
    }
    
    public int afegir(T obj) {
        if (obj == null) return -1;
        if (nrElements >= taula.length) return -2;
        taula[nrElements++] = obj;
        return 0;
    }
    
    public T exemplarAt(int index) {
        if (index < 0 || index >= nrElements) return null;
        return taula[index];
    }
    
    public T extreureAt(int index) {
        if (index < 0 || index >= nrElements) return null;
        T obj = taula[index];
        for (int i = index; i < nrElements - 1; i++) {
            taula[i] = taula[i + 1];
        }
        taula[--nrElements] = null;
        return obj;
    }
    
    public void buidar() {
        for (int i = 0; i < nrElements; i++) {
            taula[i] = null;
        }
        nrElements = 0;
    }
    
    public void visualitzar() {
        System.out.println("Capacitat: " + capacitat());
        System.out.println("Número d'elements: " + nrElements());
        for (int i = 0; i < nrElements; i++) {
            System.out.println(taula[i]);
        }
    }
    
    public void ordenar() {
        Algorismes.ordenar(taula);
    }
}
