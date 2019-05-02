package com.example.autandroidapp;

import android.view.View;
import android.widget.Button;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class architecture_buttonTest {

    /*public ActivityTestRule<architecture_button> architectureTestRule = new ActivityTestRule<architecture_button>(architecture_button.class);
    private architecture_button mainActivity = null;
//method to get architecture activity for testing
    @Before
    public void setUp() throws Exception {
        mainActivity = architectureTestRule.getActivity();
    }
    //a method to test the home button being pressed
    @Test
    public void homeActivity()throws Throwable {
        onView(withId(R.id.action_home)).perform(click());
        View view = mainActivity.findViewById(R.id.action_home);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }*/
}