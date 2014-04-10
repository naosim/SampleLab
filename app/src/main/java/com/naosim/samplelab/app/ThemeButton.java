package com.naosim.samplelab.app;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;

/**
 * Created by fujitanao on 2014/04/10.
 */
public class ThemeButton extends Button {
    Theme.Type currentThemeType = null;

    public ThemeButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        Log.e("ThemeButton", "onWindowVisibilityChanged: " + visibility);
        if(visibility == 0) {
            Log.e("ThemeButton", "### VISIBLE ###");
            setThemeType(Theme.getInstance().getType());
        }
    }

    private void setThemeType(Theme.Type type) {
        boolean isChangedType = (currentThemeType != type);
        currentThemeType = type;
        if(isChangedType) {
            onThemeTypeChanged(type);
        }
    }

    private void onThemeTypeChanged(Theme.Type type) {
        setBackgroundColor(type.getBackgroundColor());
        setTextColor(type.getTextColor());
    }

}
