//package lambda;

import java.util.List;
import java.util.Optional;

public class Exp3 {
    public static Optional<String> findStringWithMaxLowerCase(String... strings) {
        return List.of(strings).stream().filter(s -> !s.isEmpty())
                .max((s1, s2) -> {
                    return (int) s1.chars().filter(Character::isLowerCase).count()
                            - (int) s2.chars().filter(Character::isLowerCase).count();
                });
    }

    public static void main(String[] args) {
        Optional<String> result = findStringWithMaxLowerCase("cat", "elephant", "12345", "", "dog", "yellow", "ant",
                "batter");

        if (result.isPresent()) {
            System.out.println("Строка с максимальным числом строчных букв: " + result.get());
        } else {
            System.out.println("Список пуст или не содержит строк.");
        }
    }
}
