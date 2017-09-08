package it.intre.fizzbuzzTDD;
import java.util.Scanner;

public class App {

    static Scanner keyboard = new Scanner(System.in);

    public static void main( String[] args )
    {
        int number=checkValidInput();
        fromInputToOne(number);
    }

    public static void fromInputToOne(int number)
    {
        while(number >= 1)
        {
            System.out.println(outputMaker(number));
            number--;
        }
    }

    public static int checkValidInput()
    {
        int number;
        System.out.println("Insert a positive integer: ");
        do
        {
            number = keyboard.nextInt();
            if(number < 1)
                System.out.println("ERROR! The number must be positive! Insert it again: ");
        }while(number < 1);
        return number;
    }

    public static String outputMaker(int number)
    {
        String output = "";
        output += checkNumberMultiple(number,3,"fizz");
        output += checkNumberMultiple(number,5,"buzz");
        output += checkEmptyString(number,output);
        return "number: " + number + " output: " + output;
    }

    public static String checkNumberMultiple(int number,int divider,String output)
    {
        return (number % divider == 0) ? output : "";
    }

    public static String checkEmptyString(int number,String output)
    {
        return (output.equals("")) ? String.valueOf(number) : "";
    }
}
