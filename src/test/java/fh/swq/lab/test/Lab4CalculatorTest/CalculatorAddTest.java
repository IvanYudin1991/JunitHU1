package fh.swq.lab.test.Lab4CalculatorTest;

import fh.swq.lab.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorAddTest {
    Calculator calc;
     
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }
     
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }
     
    @Tag("DEV")
    @Test
    void testCalcOne() {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
    }
     
    @Tag("PROD")
   // @Disabled
    @Test
    void testCalcTwo() {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , Calculator.add(2, 4));
    }


    @Test
    void testCalcThree() {
        System.out.println("======TEST THREE EXECUTED=======");
        Assertions.assertEquals( 2 , Calculator.subtrakt(6, 4));
    }

    @Test
    void testCalcFour() {
        System.out.println("======TEST FOUR EXECUTED=======");
        Assertions.assertEquals( 24 , Calculator.multiply(6, 4));
    }
     
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }
     
    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}
