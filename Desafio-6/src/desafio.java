import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        List<Integer> numerosMaiores = numeros.stream()
            .filter(num -> num > 10)
            .collect(Collectors.toList());
            
            System.out.println(numerosMaiores.isEmpty() ? "Não temos números maiores que 10" : "Números maiores que 10: " + numerosMaiores);
        
    }
}
