package gaorutwe.learn.loops;

import java.util.Scanner;

public class WhatsYourName {
    public static void main(String[] args) {

        System.out.print("What's your name? : ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();

        String response2 = "Onkgopotse";

        if(response.equals("Potse") || response.equalsIgnoreCase("Potse")){
            System.out.println("Hey there Druza's child, " + response2.toUpperCase() + " girl");
        } else {
            System.out.println(response +  " from which part of town ?");
        }
    }
}
