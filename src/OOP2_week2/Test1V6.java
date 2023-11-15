package oop.OOP2_week2;

import static oop.OOP2_week2.Util.println;
import static oop.OOP2_week2.Util.readNumber;

public class Test1V6 {
    public static void main(String[] args) {

        int n1 = readNumber();
        int n2 = readNumber(" Please enter number2");
        int sum = n1 + n2;
        println(sum);
    }
}
