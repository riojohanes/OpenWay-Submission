package com.openway.submission;

import java.util.Scanner;

public class Calculate
{
    public static double calculate(double a, double b, double c, double d) throws IllegalArgumentException{
        if (c + d == 0)  {
            throw new IllegalArgumentException("Error! Undefined result");
        }
        return (a + b)/(c + d);
    }

    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter value a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter value b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter value c: ");
            double c = scanner.nextDouble();
            System.out.print("Enter value d: ");
            double d = scanner.nextDouble();

            double result = calculate(a, b, c, d);
            System.out.print("Result = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            scanner.close();
        }
    }
}
