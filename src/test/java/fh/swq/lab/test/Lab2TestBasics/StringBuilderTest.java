package fh.swq.lab.test.Lab2TestBasics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringBuilderTest {

    @Test
    public void stringBuilderAppendShouldConcatinate()  {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("String2");
        stringBuilder.append("Builder");
        stringBuilder.append("Test");

        assertEquals("String2BuilderTest", stringBuilder.toString());
    }

}