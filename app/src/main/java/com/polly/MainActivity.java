package com.polly;

import android.content.SharedPreferences;
import android.preference.PreferenceActivity;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class MainActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.category);
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        sp.edit().remove(Constant.EXTRA_INFILE).commit();

    }
}
