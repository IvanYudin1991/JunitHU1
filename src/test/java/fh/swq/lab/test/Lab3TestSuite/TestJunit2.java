package fh.swq.lab.test.Lab3TestSuite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit2 {

    String message = "Susi2";

    @Test
    public void testSusiMessage() {
        System.out.println("Inside testSusiMessage()");
        message = "Hi!" + "Susi2";
        assertEquals("Hi!Susi2",message);
    }
}