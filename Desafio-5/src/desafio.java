import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        double mediaMaior = numeros.stream()
            .filter(num -> num > 5)
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0);
        System.out.println("Media maior que 5: "  + mediaMaior);

    }
}
