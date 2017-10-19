package com.wdullaer.materialdatetimepicker;

import java.util.Locale;

/**
 * Created by rakawm on 10/19/17.
 */

public class MaterialDateTimePickerConfig {
    private static Locale forcedLocale;

    public static void initForcedLocale(Locale locale) {
     forcedLocale = locale;
    }

    public static Locale getForcedLocale() {
        return forcedLocale;
    }
}
