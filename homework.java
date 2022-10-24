package text;

import java.util.Random;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        String[] cities = new String[]{"Poprad", "Kosice", "Michalovce", "Bratislava", "Zvolen", "Praha", "Tokio",
                "New York", "Vieden", "Las Vegas"};
        String city = cities[new Random().nextInt(cities.length)];
        Scanner sc = new Scanner(System.in);
        int tries = 0;
        int maxTries = 7;
        boolean[] guessed = new boolean[city.length()];
        while (tries < maxTries) {
            System.out.println("Hadaj pismeno");
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
                System.out.println("Uhadol si dalsie pismeno");
                break;
            }
            System.out.println("Ostava ti " + (maxTries - tries) + " pokusov");
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
            System.out.println("Ak chcete pokracovat zakupte si HANGMAN PRO");
        }


    }
}
