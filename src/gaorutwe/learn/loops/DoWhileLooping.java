package gaorutwe.learn.loops;

import java.util.Scanner;

public class DoWhileLooping {
    public static void main(String[] args) {

        System.out.print("What's your name? : ");
        Scanner in = new Scanner(System.in);

        String response;
        String response2 = "Onkgopotse";
        do {
            response = in.nextLine();
            //System.out.println(response + " from which part of town ?") ;

        } while (!response.equals("Potse"));

        //response.equalsIgnoreCase("Potse");

        System.out.println("Hey there Druza's child, " + response2.toUpperCase() + " girl");
    }


}

