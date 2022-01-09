package org.example.Java_jenkin_in_docker;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestMain 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testInputIsEven()
    {
        assertTrue(Main.checkIfInputIsAnEventNumber(14));
    }
}
