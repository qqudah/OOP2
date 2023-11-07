/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author LENOVO
 */
public class Test {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "mo";
        System.out.println(p1.name);
        Person p2 = new Person();
        p2.name = "ko";
        System.out.println(p2.name);
        Person p3 = p1;
        System.out.println(p3.name);
        p3.name = "dsf";
        System.out.println(p1.name);
        Circle c1= new Circle();
        c1.radius=3;
        c1.getArea();
        c1.getRound();
         c1.radius=10;
        c1.getArea();
        c1.getRound();

    }
}
