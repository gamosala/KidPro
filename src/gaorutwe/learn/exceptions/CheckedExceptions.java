package gaorutwe.learn.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptions {

    public static void main(String[] args) {

 /*       try {
            FileInputStream f = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }*/

        try {
            Integer.parseInt("Hello");
        } catch (NumberFormatException e) {
            System.out.println("Unable to format");
        }


        System.out.print("What's your name? : ");
        Scanner in = new Scanner(System.in);
        String response;
        do {
            response = in.nextLine();
        } while (!response.equals("Druza"));
        System.out.println("Hey there Druza");
    }
}
