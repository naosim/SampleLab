package com.naosim.samplelab.app;

import android.graphics.Color;

/**
* Created by fujitanao on 2014/04/10.
*/
public class Theme {
    private static Theme instance;
    private Type type;

    Theme() {
        type = Type.RED;
    }

    public static Theme getInstance() {
        if(instance == null) instance = new Theme();
        return instance;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        RED {
            @Override
            int getBackgroundColor() {
                return Color.RED;
            }

            @Override
            int getTextColor() {
                return Color.BLACK;
            }
        },
        GREEN {
            @Override
            int getBackgroundColor() {
                return Color.GREEN;
            }

            @Override
            int getTextColor() {
                return Color.BLACK;
            }
        },
        BLUE {
            @Override
            int getBackgroundColor() {
                return Color.BLUE;
            }

            @Override
            int getTextColor() {
                return Color.WHITE;
            }
        };

        abstract int getBackgroundColor();
        abstract int getTextColor();
    }
}
