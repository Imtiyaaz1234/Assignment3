package com.Imtiyaaz.Assignment3Interface;
import java.util.*;
/**
 * Created by imtiyaaz on 2017/03/26.
 */
public class CalculatorRun {
    public static void main(String[]args)
    {
        Calculator cal = new CalculatorCode();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        float number1 = input.nextInt();
        System.out.println("Please enter second number: ");
        float number2 = input.nextInt();
        input.close();
        System.out.println("Addition Result: " + cal.add(number1, number2));
        try{
            System.out.println("Division Result: " + cal.divide(number1, number2));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Multiplication Result: " + cal.multiply(number1, number2));
        if(number1 >= number2)
        {
            System.out.println("Subtraction Result: " + cal.substract(number1, number2));
        }
        else
        {
            System.out.println("Subtraction Result: Error too big bro");
        }
    }
}
