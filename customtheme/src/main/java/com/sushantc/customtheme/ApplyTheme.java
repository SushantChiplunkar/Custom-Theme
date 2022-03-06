package com.sushantc.customtheme;

import androidx.appcompat.app.AppCompatDelegate;

public class ApplyTheme {
    public static void applyThemeByString(String toggleString){
        int selectedTheme = 0;
        switch (toggleString){
            case "DEFAULT":selectedTheme = AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM;
                    break;
            case"DARK":selectedTheme = AppCompatDelegate.MODE_NIGHT_YES;
                break;
            case"LIGHT":selectedTheme = AppCompatDelegate.MODE_NIGHT_NO;
                break;

        }

        AppCompatDelegate.setDefaultNightMode(selectedTheme);
    }
}
