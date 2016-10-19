package com.riis.mockitosharedpreferencessolution;

import android.app.Activity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static org.hamcrest.CoreMatchers.is;

@RunWith(MockitoJUnitRunner.class)
public class UserPreferencesTest {

    //TODO: Use Mockito to initialize UserPreferences
    public UserPreferences tUserPreferences = Mockito.mock(UserPreferences.class);
    private Activity tActivity;

    @Before
    public void setUp() {
        //TODO: Use Mockito to declare the return value of getSharedPreferences()
        Mockito.when(tUserPreferences.getSharedPreferences(tActivity)).thenReturn("true");
    }

    @Test
    public void sharedPreferencesTest_ReturnsTrue() {
        //TODO: Test
        Assert.assertThat(tUserPreferences.getSharedPreferences(tActivity), is("true"));
    }
}

