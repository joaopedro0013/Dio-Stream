import java.util.Arrays;
import java.util.List;

public class desafio {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosQuadrados = numeros.stream()
                                      .map(n -> n * n)
                                      .reduce(0, Integer::sum);

        System.out.println("A soma dos quadrados é: " + somaDosQuadrados);
    }
}
