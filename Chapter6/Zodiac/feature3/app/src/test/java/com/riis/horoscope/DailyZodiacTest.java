package com.riis.horoscope;

import android.test.suitebuilder.annotation.SmallTest;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Godfrey on 10/24/2015.
 */
@SmallTest
public class DailyZodiacTest {
    private JsonParser mJsonParser;
    private String validJson, invalidJson;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws IOException {
        validJson = "{\n" +
                "  \"year\": 2015,\n" +
                "  \"week\": 45,\n" +
                "  \"sign\": \"aries\",\n" +
                "  \"prediction\": \"Test1\"\n" +
                "}";
        invalidJson = "bogus";
        mJsonParser = new JsonParser();
        bufferedReader = org.mockito.Mockito.mock(BufferedReader.class);
        Mockito.when(bufferedReader.readLine()).thenReturn(validJson).thenReturn(null);
    }

    @Test
    public void validJSON_true() {
        assertTrue(mJsonParser.isValidJSON(validJson));
    }

    @Test
    public void invalidJSON_false() {
        assertFalse(mJsonParser.isValidJSON(invalidJson));
    }

    @Test
    public void testCreateJsonObjectReturnsJsonObject() throws JSONException {
        JSONObject jsonObject = mJsonParser.createJsonObject(bufferedReader);
        String horoscope = jsonObject.getString("prediction");

        assertEquals("Test1", horoscope);
    }
}