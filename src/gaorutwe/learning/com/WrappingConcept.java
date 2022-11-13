package gaorutwe.learning.com;

import gaorutwe.learn.cameras.Camera;

public class WrappingConcept {
    public static void main(String[] args) {
        Camera camera = new Camera();   // camera is an object


        int x = 5 + 5;  //primitive
        Integer y = 4;  //object (instance of a class)

        //wrapping
        y.floatValue();
        y.doubleValue();
        System.out.println("Print Float Value: " + y.floatValue() + "\nPrint Double Value: " + y.doubleValue());

    }
}
