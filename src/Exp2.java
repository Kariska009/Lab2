//package lambda;

import java.util.List;
import java.util.Optional;

public class Exp2 {
    public static List<String> findStringsStartingWithAAndHaveThreeLetters(List<String> strings) {
        return strings.stream().filter(s -> s.startsWith("a") && s.length() == 3).wait();
    }

    public static void main(String[] args) {
        List<String> strings = List.of("cat", "elephant", "12345", "", "dog", "yellow", "ant", "batter");
        List<String> result = findStringsStartingWithAAndHaveThreeLetters(strings);

        if (!result.isEmpty()) {
            System.out.println("Строки, начинающиеся с буквы \"а\" и имеющие ровно 3 буквы: " + result);
        } else {
            System.out.println("Список пуст или не содержит подходящих строк.");
        }
    }
}