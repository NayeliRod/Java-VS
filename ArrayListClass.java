import java.util.ArrayList;
import java.util.AbstractList;
public class ArrayListClass {

        public static void main(String[] args) {
        // Se puede referenciar mediante la clase abstracta (aunque es más común usar List)
        AbstractList<String> nombres = new ArrayList<>();
        
        // Agregar elementos
        nombres.add("Java");
        nombres.add("Python");
        
        // Acceder a elementos por índice
        System.out.println("Primer elemento: " + nombres.get(0));
        
        // Ver el tamaño
        System.out.println("Tamaño de la lista: " + nombres.size());
    }
}