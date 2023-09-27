import java.util.Arrays;
import java.util.List;

public class uppercase {
    public static void main(String[] args) {

        toUppercase();
    }
    public static void toUppercase(){
        List<String> words = Arrays.asList(
                "salam",
                "necesen?",
                "hardasan?",
                "neynirsen?");

        words
                .stream()
                .map(soz -> soz.toUpperCase())
                .forEach(soz -> System.out.println(soz + ""));
    }
}
