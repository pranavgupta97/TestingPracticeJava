package com.udacity.examples.Testing;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HelperTest {

    @Test
    public void testGetCount() {
        List<String> employeeNames = Arrays.asList("Pranav", "Bruh");
        long actualCountBruh = Helper.getCount(employeeNames);
        assertEquals(2, actualCountBruh);
    }

    @Test
    public void testGetStats() {
        List<Integer> yrsOfExperience = Arrays.asList(13,4,15,6,17,8,19,1,2,3);
        List<Integer> actualYearsOfExperience = Arrays.asList(13, 4, 15, 6, 17, 8, 19, 1, 2, 3);
        IntSummaryStatistics statistics = Helper.getStats(yrsOfExperience);

        assertEquals(19, statistics.getMax());

        assertEquals(yrsOfExperience, actualYearsOfExperience);
    }
}
