import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
    
public class desafio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> primos = numeros.stream()
                                      .filter(desafio::isPrime)
                                      .collect(Collectors.toList());

        System.out.println("Números primos: " + primos);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
