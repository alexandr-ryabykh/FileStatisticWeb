package com.luxoft.webapplication.dao;


import com.luxoft.webapplication.utils.StringUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    private static String testString = "Fork-marked lemurs the genus Phaner are primates native to Madagascar";
    private static String[] testArray;

    @BeforeClass
    public static void init() {
        testArray = testString.split(" ");
    }

    @Test
    public void getShortestWord() {
        String result = StringUtils.getShortestWord(testArray);
        assertEquals("to", result);
    }

    @Test
    public void getLongestWord() {
        String result = StringUtils.getLongestWord(testArray);
        assertEquals("Fork-marked", result);
    }

    @Test
    public void getAverageWordLength() {
        int result = StringUtils.getAverageWordLength(testArray);
        assertEquals(6, result);
    }
}
