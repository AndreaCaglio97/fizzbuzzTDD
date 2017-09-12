package it.intre.fizzbuzzTDD;

import org.junit.Test;

import static it.intre.fizzbuzzTDD.App.*;
import static org.junit.Assert.*;


public class AppTest {
    @Test
    public void numberMultipleOf3ReturnStringFizzTest()
    {
        assertEquals("fizz",checkNumberMultiple(6,3,"fizz"));
    }

    @Test
    public void numberNotMultipleOf3ReturnEmptyStringTest()
    {
        assertEquals("",checkNumberMultiple(7,3,"fizz"));
    }

    @Test
    public void numberMultipleOf5ReturnStringBuzzTest()
    {
        assertEquals("buzz",checkNumberMultiple(10,5,"buzz"));
    }

    @Test
    public void numberNotMultipleOf5ReturnEmptyStringTest()
    {
        assertEquals("",checkNumberMultiple(11,5,"buzz"));
    }

    @Test
    public void outputStringEmptyReturnStringOfNumberGivenInInputTest()
    {
        assertEquals("7",checkEmptyString(7,""));
    }

    @Test
    public void outputStringContainsFizzReturnEmptyStringTest()
    {
        assertEquals("",checkEmptyString(6,"fizz"));
    }

    @Test
    public void outputStringContainsBuzzReturnEmptyStringTest()
    {
        assertEquals("",checkEmptyString(10,"buzz"));
    }

    @Test
    public void outputStringContainsFizzBuzzReturnEmptyStringTest()
    {
        assertEquals("",checkEmptyString(15,"fizzbuzz"));
    }

    @Test
    public void numberMultipleOf3ReturnFinalStringFizzTest()
    {
        assertEquals("number: 6 output: fizz",outputMaker(6));
    }

    @Test
    public void numberMultipleOf5ReturnFinalStringBuzzTest()
    {
        assertEquals("number: 10 output: buzz",outputMaker(10));
    }

    @Test
    public void numberMultipleOf3And5ReturnFinalStringFizzBuzzTest()
    {
        assertEquals("number: 15 output: fizzbuzz",outputMaker(15));
    }

    @Test
    public void numberNotMultipleOf3AndNotMultipleOf5ReturnStringOfNumberGivenInInputTest()
    {
        assertEquals("number: 7 output: 7",outputMaker(7));
    }

    @Test
    public void number0GivenInInputTest()
    {
        assertEquals(false,checkValidInput(0));
    }

    @Test
    public void stringGivenInInputTest()
    {
        assertEquals(false,checkValidInput(-1));
    }

    @Test
    public void negativeNumberGivenInInputTest()
    {
        assertEquals(false,checkValidInput(-5));
    }

    @Test
    public void positiveNumberGivenInInputTest()
    {
        assertEquals(true,checkValidInput(20));
    }
}
