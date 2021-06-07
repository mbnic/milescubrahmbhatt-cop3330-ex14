/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */
package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    static float taxWI = .55f;

    public static void main(String[] args) {
        App myApp = new App();

        float orderAMNT = myApp.getOrderAmount();
        String state = myApp.getState();

        String output = myApp.produceOutput(orderAMNT, state);

        myApp.printOutput(output);
    }

    public void printOutput(String out) {
        System.out.println(out);
    }

    public String produceOutput(float orderAMNT, String state) {
        if (state.equals("WI") || state.equals("wi")) {
            return String.format("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.",
                    orderAMNT, taxWI, (orderAMNT + taxWI));
        }

        return String.format("The total is $%.2f", orderAMNT);

    }

    public String getState() {
        System.out.printf("What is the state? ");
        return in.nextLine();
    }

    public float getOrderAmount() {
        System.out.printf("What is the order amount? ");
        return Float.parseFloat(in.nextLine());
    }
}
