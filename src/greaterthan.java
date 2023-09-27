import java.util.List;
import java.util.stream.Collectors;

public class greaterthan {
    public static void main(String[] args) {

        greaterThan();
    }
public static void greaterThan(){
        List<String> strings = List.of(
                "Iphone",
                "Samsung",
                "Dell",
                "Xiaomi",
                "Nokia",
                "Asus"
        );
        List<String> filtered = strings
                .stream()
                .filter(x -> x.length() > 5)
                .collect(Collectors.toList());

        System.out.println(filtered
                + "\n"
                + filtered.stream().count()
        );


    }
}
