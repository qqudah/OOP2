package oop.OOP2_week2;

import static oop.OOP2_week2.Util.*;

public class SimpleCalculatorV2 {
    /////////////////////////////////////////////////////////
    private static double memory = 0;

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {

            int choice = showMenu();
            switch (choice) {
                case 1:
                    double n1Add = readNumber("Enter n1 for addition");
                    double n2Add = readNumber("Enter n2 for addition");
                    addNumbers(n1Add, n2Add);
                    break;
                case 2:
                    double n1Subtract = readNumber("Enter n1 for subtraction");
                    double n2Subtract = readNumber("Enter n2 for subtraction");
                    subtractNumbers(n1Subtract, n2Subtract);
                    break;
                case 3:
                    double n1Multiply = readNumber("Enter n1 for multiplication");
                    double n2Multiply = readNumber("Enter n2 for multiplication");
                    multiplyNumbers(n1Multiply, n2Multiply);
                    break;
                case 4:
                    double n1Divide = readNumber("Enter n1 for division");
                    double n2Divide = readNumber("Enter n2 for division");
                    divideNumbers(n1Divide, n2Divide);
                    break;
                case 5:
                    memoryRecall();
                    break;
                case 6:
                    memoryClear();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    println("Invalid Input");
            }
        }

        println("Thank you, bye!!");
    }

    /////////////////////////////////////////////////////////
    private static int showMenu() {
        println("Menu:");
        println("1- Add");
        println("2- Subtract");
        println("3- Multiply");
        println("4- Divide");
        println("5- Memory Recall");
        println("6- Memory Clear");
        println("7- Quit");
        println("---------------------");

        int choice = readNumber("Please enter your choice");
        return choice;
    }

    private static void addNumbers(double n1, double n2) {
        double result = n1 + n2;
        memory = result;
        println("Result: " + result);
    }

    private static void subtractNumbers(double n1, double n2) {
        double result = n1 - n2;
        memory = result;
        println("Result: " + result);
    }

    private static void multiplyNumbers(double n1, double n2) {
        double result = n1 * n2;
        memory = result;
        println("Result: " + result);
    }

    private static void divideNumbers(double n1, double n2) {
        if (n2 != 0) {
            double result = n1 / n2;
            memory = result;
            println("Result: " + result);
        } else {
            println("Cannot divide by zero. Please enter a valid number.");
        }
    }


    private static void memoryRecall() {
        println("Memory Recall: " + memory);
    }

    private static void memoryClear() {
        memory = 0;
        println("Memory Cleared.");
    }
}

