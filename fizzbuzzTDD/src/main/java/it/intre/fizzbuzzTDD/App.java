package it.intre.fizzbuzzTDD;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    static Scanner keyboard = new Scanner(System.in);

    public static void main( String[] args )
    {
        int number = inputNumber();
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

    public static int inputNumber()
    {
        int number = 0;
        boolean validInput;
        System.out.println("Insert a positive integer: ");
        do
        {
            try{
                number = keyboard.nextInt();
            }catch(InputMismatchException e)
            {
                keyboard.nextLine();
                number = -1;
            }finally{
                validInput = checkValidInput(number);
            }
        }while(!validInput);
        return number;
    }

    public static boolean checkValidInput(int number)
    {
        boolean check;
        if(number < 1)
        {
            System.out.println("ERROR! Invalid input! Insert a positive integer: ");
            check = false;
        }
        else
        {
            check = true;
        }
        return check;
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
