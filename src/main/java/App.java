/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Scanner;

 public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String choice = in.next();
        choice = choice.toLowerCase();

        if(choice.equals("c"))
            myApp.calculateFtoC(myApp);
        else
            myApp.calculateCtoF(myApp);
    }

    private void calculateFtoC(App myApp)
    {
        double input;
        System.out.print("Please enter the temperature in Fahrenheit: ");
        input = myApp.validation();

        double result = ((input - 32) * (5 / 9.0));

        System.out.printf("The temperature in Celsius is %.0f.", result);
    }

    private void calculateCtoF(App myApp)
    {
        double input;
        System.out.print("Please enter the temperature in Celsius: ");
        input = myApp.validation();

        double result = (input * (9 / 5.0)) + 32;

        System.out.printf("The temperature in Fahrenheit is %.0f.", result);
    }

    private double validation()
    {
        double result = -1;
        if(in.hasNextDouble())
            result = in.nextDouble();
        else
        {
            int numberFlag = 0;
            while(numberFlag == 0)
            {
                System.out.print("Please enter a numeric value ");
                in.next();
                if(in.hasNextDouble())
                {
                    result = in.nextDouble();
                    numberFlag = 1;
                }
            }
        }

        return result;
    }
}
