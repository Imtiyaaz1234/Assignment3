package com.Imtiyaaz.Assignment3Interface;
import junit.framework.TestCase;

/**
 * Created by imtiyaaz on 2017/03/26.
 */
public class CalculatorCodeTest extends TestCase  {
    Calculator calcObject = new CalculatorCode();
    public void testAddition() throws Exception {
        float result = calcObject.add(29, 97);
        assertEquals(result,120.0f);
    }

    public void testSubtraction() throws Exception {
        float result = calcObject.substract(97, 29);
        assertEquals(result,66.0f);
    }

    public void testMultiplication() throws Exception {
        float result = calcObject.multiply(29, 97);
        assertEquals(result,2511.0f);
    }


    public void testDivision() throws Exception {
        float result = calcObject.divide(4, 2);
        assertEquals(result,2.0f);
    }
}
