package com.example.android.networkconnect;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import java.io.IOException;


@RunWith(MockitoJUnitRunner.class)
public class DownloadUrlTest {

    public DownloadUrl tDownloadUrl = Mockito.mock(DownloadUrl.class);

    @Before
    public void setUp() {
        try {
            Mockito.when(tDownloadUrl.loadFromNetwork("http://www.google.com")).thenReturn("<!doctype html><html itemscope=\"\" itemtype=\"http://schema.org/WebPage\" lang=\"en\"><head>");
        } catch (IOException e) {
            // network error
        }
    }

    @Test
    public void downloadUrlTest_ReturnsTrue() {
        try {
            assertThat(tDownloadUrl.loadFromNetwork("http://www.google.com"),containsString("doctype"));
        } catch (IOException e) {
            //
        }
    }
}

