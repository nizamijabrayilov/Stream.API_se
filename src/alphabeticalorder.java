import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class alphabeticalorder {

    public static void main(String[] args) {
        alphabetic();
    }

    public static void alphabetic(){
        List<String> words = Arrays.asList(
                "Baku",
                "Azerbaijan",
                "Germany",
                "Colombia");

        List<String> alphabetic = words
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(alphabetic);
    }
}
