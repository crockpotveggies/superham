package com.superham;

import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

    public static final String ACTION_LOGIN = "com.flightaware.android.flightfeeder.LOGIN";
    public static final String ACTION_MODE_CHANGE = "com.flightaware.android.flightfeeder.MODE_CHANGE";
    public static final String ACTION_UPDATE_1HERTZ = "com.flightaware.android.flightfeeder.UPDATE_1HERTZ";
    public static final String ACTION_UPDATE_RX = "com.flightaware.android.flightfeeder.UPDATE_RX";
    public static final String ACTION_UPDATE_TX = "com.flightaware.android.flightfeeder.UPDATE_TX";
    private static final String ACTION_USB_PERMISSION = "com.flightaware.android.flightfeeder.USB_PERMISSION";

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "SuperHam";
    }
}
