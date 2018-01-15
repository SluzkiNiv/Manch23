package com.example.niv.munch23;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.util.Log;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class UiAutoTest {

    private static final String BASIC_SAMPLE_PACKAGE = "com.example.niv.munch23";
    private static final int LAUNCH_TIMEOUT = 5000;
    private static final String STRING_TO_TYPE = "Test is running...";
    private UiDevice mDevice;
    public static final String TEST_STRING = "This is a string";
    public static final long TEST_LONG = 12345678L;
    private Log mLogHistory;

    @Before
    public void startMainActivityFromHomeScreen() {
        // Initialize UiDevice instance
        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        // Start from the home screen
        mDevice.pressHome();


    }

    @Test
    public void infoButtonCheck(){
        // Trying to press on the info button ("About Munch23");
        UiObject aboutBtn = mDevice.findObject(new UiSelector()
                .text("infoBtn")
                .className("android.widget.Button"));

        try {
            if(aboutBtn.exists() && aboutBtn.isEnabled()) {
                aboutBtn.click();
            }
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }
}
