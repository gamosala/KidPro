package gaorutwe.learning.com;

import java.util.Scanner;

public class StringCase {
    public static void main(String[] args) {

        String str_upp = "onkgo";
        String str_low = "Potse";

        System.out.println(str_upp.toUpperCase());
        System.out.println(str_low.toLowerCase());

        String strUpperCase = str_upp.toUpperCase();
        String strLowerCase = str_low.toLowerCase();

        System.out.println("Love you, " + strUpperCase);
        System.out.println("Love you, " + strLowerCase);

        readUserInputAndPrintInUpperCase();
    }

    private static void readUserInputAndPrintInUpperCase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write input String and press Enter: ");
        String str = sc.nextLine();
        System.out.println("What is the little girl's name, " + str.toUpperCase());

    }
}

