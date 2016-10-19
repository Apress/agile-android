package com.riis.zodiac;

import android.app.ListActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 *
 * If the Robolectric test will not run, edit the test configuration by adding /$MODULE_NAME to the
 * end of the Working Directory path.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = "src/main/AndroidManifest.xml")
public class ZodiacUnitTest {
    private ListView listView;

    @Before
    public void setUp() {
        ListActivity mainActivity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull("Main Activity not setup", mainActivity);
        listView = mainActivity.getListView();
    }

    @Test
    public void listLoaded() throws Exception {
        assertThat("should be a dozen star signs", Zodiac.signs.length, equalTo(listView.getCount()));
    }

    @Test
    public void listContentCheck() {
        ListAdapter listViewAdapter = listView.getAdapter();
        assertEquals(Zodiac.signs[0], listViewAdapter.getItem(0));
        assertEquals(Zodiac.signs[1], listViewAdapter.getItem(1));
        assertEquals(Zodiac.signs[2], listViewAdapter.getItem(2));
        assertEquals(Zodiac.signs[3], listViewAdapter.getItem(3));
        assertEquals(Zodiac.signs[4], listViewAdapter.getItem(4));
        assertEquals(Zodiac.signs[5], listViewAdapter.getItem(5));
        assertEquals(Zodiac.signs[6], listViewAdapter.getItem(6));
        assertEquals(Zodiac.signs[7], listViewAdapter.getItem(7));
        assertEquals(Zodiac.signs[8], listViewAdapter.getItem(8));
        assertEquals(Zodiac.signs[9], listViewAdapter.getItem(9));
        assertEquals(Zodiac.signs[10], listViewAdapter.getItem(10));
        assertEquals(Zodiac.signs[11], listViewAdapter.getItem(11));
    }
}