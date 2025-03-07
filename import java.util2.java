import java.util.ArrayList;
import java.util.List;

public class ProgresionAritmetica {
    public static void main(String[] args) {
        int primerTermino = 3;
        int diferenciaComun = 2;
        int cantidadTerminos = 10;

        List<Integer> progresion = new ArrayList<>();

        for (int i = 0; i < cantidadTerminos; i++) {
            progresion.add(primerTermino + i * diferenciaComun);
        }

        System.out.println("Progresión aritmética: " + progresion);
    }
}
