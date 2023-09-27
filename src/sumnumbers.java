import java.util.List;
import java.util.stream.Collectors;

public class sumnumbers {
    public static void main(String[] args) {
        sumOfNumbers();
    }
    public static void sumOfNumbers(){

        List<Integer> numbers = List.of(1, 3, 5, 7, 9);

        Integer sum = numbers
                .stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
    }
}
