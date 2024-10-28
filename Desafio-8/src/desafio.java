import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class desafio {
    public static void main(String[] args) throws Exception {
        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        BinaryOperator<Integer> somar = Integer::sum;

        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
            .reduce(0, Integer::sum);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
    }
}
