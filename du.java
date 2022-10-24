package text;

import java.util.Scanner;

public class du {


        public static void main(String[] args) {
            // Howework 07.10.2022
            // TO DO methods below
        }

        public void print11(){

            for (int i = 100; i < 1000; i++) {
                if (i % 11 == 0) {
                    System.out.println(i);
                }
            }


        }

        public void sum7(){

            int sum = 0;
            for (int i = 1; i < 100; i++) {
                if (i % 7 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }

        public void count3No9(){

            int count = 0;
            for (int i = 1000; i < 10000; i++) {
                if (i % 3 == 0 && i % 9 != 0) {
                    count++;
                }
            }
            System.out.println(count);
        }

        public void digitSum(int num){

            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println(sum);
        }

        public void alphabet(){

            for (int i = 122; i > 96; i--) {
                System.out.println((char)i);
            }
        }

        public void task(){

            Scanner scanner = new Scanner(System.in);
            int start = scanner.nextInt();
            int count = scanner.nextInt();
            int step = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                System.out.println(start);
                start += step;
            }
        }
    }


