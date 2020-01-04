package com.udacity.examples.Testing;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HelperTest {

    @Test
    public void testOne() {
        List<String> employeeNames = Arrays.asList("Pranav", "Bruh");
        long actualCountBruh = Helper.getCount(employeeNames);
        assertEquals(2, actualCountBruh);
    }
}
