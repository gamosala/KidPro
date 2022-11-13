package gaorutwe.learning.com;

public class PrimitiveTypes {

    public static void main(String[] args) {
        String name = "Potse";
        String yourName = "Potse";
        //System.out.println(name == yourName);
        /* not a proper way to this cause it's helped by optimization called interning */
        System.out.println(name.equals(yourName));

    }
}
