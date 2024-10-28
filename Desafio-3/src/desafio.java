import java.util.Arrays;
import java.util.List;

public class desafio {
   public static void main(String[] args) {
    // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calcular a soma dos números pares
        boolean todosPositivos = numeros.stream()
        .allMatch(num -> num > 0);

        System.out.println("Todos os números são positivos: " + todosPositivos);
    }
}
