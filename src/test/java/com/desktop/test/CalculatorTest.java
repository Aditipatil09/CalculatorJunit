package com.desktop.test;


import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.Date;


public class CalculatorTest {
    private int Count;

   @BeforeAll
   public static void init(){
       System.out.println("Before the test cases:");
       System.out.println("Started test :" + new Date());
   }

     @BeforeEach
     public  void beforeEach(){
       System.out.println("Before each test cases:");
       Count=0;
     }


     @Test
    public void addTwoNumbersTest(){
         for(int i=1; i<=100;i++){
             Count+=i;
         }
         System.out.println("addTwoNumbersTest:");
        int result = Calculator.addTwoNumbers(12, 23);
        int expected =35;
         System.out.println("Conter value in first case:" +Count);
        Assertions.assertEquals(expected ,result);
    }
@Test
    public void sumAnyNumbers(){
       for(int i=1; i<=70;i++){
           Count+=i;
       }
    System.out.println("sumAnyNumbers:");
    int result = Calculator.sumAnyNumbers(12, 25);
        int expected =37;

        System.out.println("Conter value in second case:" +Count);
        Assertions.assertEquals(expected ,result);
    }

    @AfterAll
    public static void cleanUp(){
       System.out.println("After all test cases:");
       System.out.println("End Test:" +new Date());
    }



}
