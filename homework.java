package text;

import java.util.Random;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        String[] cities = new String[]{"Poprad", "Havitovo", "Washington", "Moskva", "Tokio", "Helsinki", "Tacna",
                "Aarau", "Mainz", "Buenos Aires", "Clarkesville", "Nitra", "Bole El-Geress", "Poprad", "Havitovo"};
        String city = cities[new Random().nextInt(cities.length)];
        Scanner sc = new Scanner(System.in);
        int tries = 0;
        int maxTries = 7;
        boolean[] guessed = new boolean[city.length()];
        while (tries < maxTries) {
            System.out.println("Guess a letter");
            char letter = sc.nextLine().charAt(0);
            boolean found = false;
            for (int i = 0; i < city.length(); i++) {
                if (city.charAt(i) == letter) {
                    guessed[i] = true;
                    found = true;
                }
            }
            if (!found) {
                tries++;
            }
            boolean win = true;
            for (int i = 0; i < city.length(); i++) {
                if (!guessed[i]) {
                    win = false;
                }
            }
            if (win) {
                System.out.println("You win!");
                break;
            }
            System.out.println("You have " + (maxTries - tries) + " tries left");
            for (int i = 0; i < city.length(); i++) {
                if (guessed[i]) {
                    System.out.print(city.charAt(i));
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        if (tries >= maxTries) {
            System.out.println("You lose!");
        }


    }
}
