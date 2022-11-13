package gaorutwe.learn.operators;

public class ConditionalDemo {

    public static void main(String[] args) {
        int valueA = 1;
        int valueB = 2;
        if ((valueA == 1) && (valueA == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if ((valueA == 1) || (valueA == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }
}
