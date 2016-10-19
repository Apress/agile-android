package com.riis.mockitosharedpreferencessolution;

import android.app.Activity;
import android.content.SharedPreferences;

public class UserPreferences  {

    private static String USERNAME = "username";

    public void saveSharedPreferences(Activity activity, String uName) {
        SharedPreferences preferences = activity
                .getPreferences(Activity.MODE_PRIVATE);
        preferences.edit().putString(USERNAME, uName).apply();
    }

    public String getSharedPreferences(Activity activity) {
        SharedPreferences preferences = activity
                .getPreferences(Activity.MODE_PRIVATE);
        return preferences.getString(USERNAME, "Something wrong here");
    }

}
