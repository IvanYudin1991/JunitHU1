package fh.swq.lab.test.Lab3TestSuite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit1 {

    String message = "Robert2";

    @Test
    public void testRobertMessage() {
        System.out.println("Inside testRobertMessage()");
        assertEquals("Robert2",message);
    }
}