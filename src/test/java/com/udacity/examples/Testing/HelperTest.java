package com.udacity.examples.Testing;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

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

    @Test
    public void testCompareArrays() {
        int[] arrayOneBruh = {1, 2, 3};
        int[] arrayTwoBruh = {1, 2, 3};

        assertArrayEquals(arrayOneBruh, arrayTwoBruh);
    }

    @Test
    public void testGetStringsOfLength3() {
        List<String> employeeNames = Arrays.asList("Oranav", "Bruh", "Bru", "Bro");

        long stringCountBruh = Helper.getStringsOfLength3(employeeNames);

        assertEquals(2, stringCountBruh);
    }

    @Test
    public void testGetSquareList() {

        List<Integer> yrsOfExperience = Arrays.asList(13,4,15,6,17,8,19,1,2,3);
        List<Integer> squaredYearsOfExperienceBruh = yrsOfExperience.stream().map(bruh -> bruh = (int) Math.pow(bruh, 2)).collect(Collectors.toList());

        List<Integer> squaredListToTestBruh = Helper.getSquareList(yrsOfExperience);

        assertNotNull(squaredListToTestBruh);
        assertEquals(squaredYearsOfExperienceBruh, squaredListToTestBruh);
    }
}