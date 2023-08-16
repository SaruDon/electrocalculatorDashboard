package com.example.electrocalculatordashboard.utils;

import android.content.Context;
import android.content.SharedPreferences;


public class PreferencesUtils {

    private static final String APPEND_STRING = "_pref";

    public static void setData(String name, String value, Context context) {

        SharedPreferences settings = context
                .getSharedPreferences(context.getPackageName() + APPEND_STRING, 0);

        SharedPreferences.Editor editor = settings.edit();

        editor.putString(name, value);
        editor.apply();
    }

    public static String getData(String name, Context context) {

        SharedPreferences settings = context
                .getSharedPreferences(context.getPackageName() + APPEND_STRING, 0);
        return settings.getString(name, "");
    }

    public static void clearAllSharedPreferences(Context context) {
        context.getSharedPreferences(context.getPackageName() + APPEND_STRING, 0).edit().clear().apply();
    }

}
