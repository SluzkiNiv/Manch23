package com.example.niv.munch23;

import android.content.res.Resources;
import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Niv on 15/01/2018.
 */



public class EspressoTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule(Login.class);
    private Resources resources;

    @Before
    public void init() {
        resources = mActivityRule.getActivity().getResources();
    }

    @Test
    public void infoBtnSuccess() {

        //check button by id if Enabled after click
        onView(withId(R.id.etEmail))        // withId(R.id.my_view) is a ViewMatcher
                .perform(click())               // click() is a ViewAction
                .check(matches(isDisplayed())); // matches(isDisplayed()) is a ViewAssertion

    }

}