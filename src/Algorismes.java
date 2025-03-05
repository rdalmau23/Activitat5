import java.lang.Comparable;

public class Algorismes {

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static void ordenar( Comparable[] figs) {
    for (int i = 0; i < figs.length-1; i++) {
      for (int j = 0; j < figs.length-1-i; j++) {
        if (figs[j].compareTo(figs[j+1]) == 1) {
        
          Comparable c = figs[j+1];
          figs[j+1] = figs[j];
          figs[j] = c;
        }
      }
    }
  }
}
