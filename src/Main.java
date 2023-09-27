import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        evenNumbers();
    }

    public static void evenNumbers() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> even = list.
                stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(even);


    }
}