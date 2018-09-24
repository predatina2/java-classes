package com.example.hadlak.util;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private String input;
    private String output;

    public UtilitiesTestParameterized(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {

    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"ABCDEFF", "ABCDEF"},
            {"AB88EFFG", "AB8EFG"},
            {"112233445566", "123456"},
            {"ZYZQQB", "ZYZQB"},
            {"A", "A"}
        });
    }

    @Test
    public void removePairs() {
        assertEquals(output, Utilities.removePairs(input));
    }
}