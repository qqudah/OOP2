package week5v2;

public class Test {

    public static void main(String[] args) {
        FactoryTest f = new FactoryTest();
        A a1 = f.create(1);
        A a2 = f.create(2);
        a1.m1();
        a2.m1();
    }

}
