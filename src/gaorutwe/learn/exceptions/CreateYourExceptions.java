package gaorutwe.learn.exceptions;

import java.util.Scanner;

public class CreateYourExceptions {
    public static void main(String[] args) {
        boolean working = false;

        if (!working) {
            try {
                throw new Exception();
            } catch (Exception e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
            }
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
