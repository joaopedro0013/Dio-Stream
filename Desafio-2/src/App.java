import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class App {
   public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

     // Calcular a soma dos números pares
     int somaPares = numeros.stream()
     .filter(num -> num % 2 == 0)
     .mapToInt(Integer::intValue)
     .sum();

     System.out.println("Soma dos números pares: " + somaPares);



    // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
    
    }
}
