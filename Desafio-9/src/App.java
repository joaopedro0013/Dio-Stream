import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {
       List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
            .distinct()
            .sorted((a, b) -> b - a)
            .skip(1)
            .findFirst();

        if (segundoMaior.isPresent()) {
            System.out.println("O segundo número maior é: " + segundoMaior.get());
        } else {
            System.out.println("Não há segundo número maior na lista.");
        }
    }
}
