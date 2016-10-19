package com.example.android.testing.androidjunitrunnersample;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class CalculatorAddTest extends ActivityInstrumentationTestCase2<CalculatorActivity> {

    public static final String THREE = "3";
    public static final String FOUR = "4";
    public static final String RESULT = "7.0";


    public CalculatorAddTest() {
        super(CalculatorActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testCalculatorAdd() {

        onView(withId(R.id.operand_one_edit_text)).perform(typeText(THREE));
        onView(withId(R.id.operand_two_edit_text)).perform(typeText(FOUR));
        onView(withId(R.id.operation_add_btn)).perform(click());
        onView(withId(R.id.operation_result_text_view)).check(matches(withText(RESULT)));
   }
}