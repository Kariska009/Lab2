import java.util.Scanner;

import java.util.function.Predicate;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line: ");
        String str = scanner.nextLine();
        Predicate<Character> isLowerCase = ch -> Character.isLowerCase(ch);
        long count = str.chars().filter(Character::isLowerCase)
                .mapToObj(ch -> (char) ch)
                .filter(isLowerCase)
                .count();
        System.out.println("Number of lowercase letters; " + count);
    }
}