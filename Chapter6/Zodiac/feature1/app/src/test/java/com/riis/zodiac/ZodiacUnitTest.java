package com.riis.zodiac;

import android.widget.ListAdapter;
import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Godfrey on 11/7/2015.
 *
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 *
 * If the Robolectric test will not run, edit the test configuration by adding /$MODULE_NAME to the
 * end of the Working Directory path.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = "src/main/AndroidManifest.xml")
public class ZodiacUnitTest {
    private ListView listView;
    private String[] zodiacSigns;

    @Before
    public void setUp() {
        MainActivity mainActivity = Robolectric.buildActivity(MainActivity.class).create().get();
        assertNotNull("Main Activity not setup", mainActivity);
        listView=(ListView) mainActivity.findViewById(R.id.list_of_signs);
        zodiacSigns = RuntimeEnvironment.application.getResources().getStringArray(R.array.zodiac_array);
    }

    @Test
    public void listLoaded() throws Exception {
        assertThat("should be a dozen star signs", zodiacSigns.length, equalTo(listView.getCount()));
    }

    @Test
    public void listContentCheck() {
        ListAdapter listViewAdapter = listView.getAdapter();
        assertEquals(zodiacSigns[0], listViewAdapter.getItem(0));
        assertEquals(zodiacSigns[1], listViewAdapter.getItem(1));
        assertEquals(zodiacSigns[2], listViewAdapter.getItem(2));
        assertEquals(zodiacSigns[3], listViewAdapter.getItem(3));
        assertEquals(zodiacSigns[4], listViewAdapter.getItem(4));
        assertEquals(zodiacSigns[5], listViewAdapter.getItem(5));
        assertEquals(zodiacSigns[6], listViewAdapter.getItem(6));
        assertEquals(zodiacSigns[7], listViewAdapter.getItem(7));
        assertEquals(zodiacSigns[8], listViewAdapter.getItem(8));
        assertEquals(zodiacSigns[9], listViewAdapter.getItem(9));
        assertEquals(zodiacSigns[10], listViewAdapter.getItem(10));
        assertEquals(zodiacSigns[11], listViewAdapter.getItem(11));
    }
}
