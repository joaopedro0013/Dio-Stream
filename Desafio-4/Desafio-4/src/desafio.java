import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio {
    public static void main(String[] args) throws Exception {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        List<Integer> numerosSemImpares = numeros.stream()
            .filter(num -> num % 2 == 1)
            .collect(Collectors.toList());
        System.out.println("Lista após remover números ímpares: "  + numerosSemImpares);

    }
}
