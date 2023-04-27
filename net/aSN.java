/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.DisplayMode
 */
package net;

import org.lwjgl.opengl.DisplayMode;

public class aSN {
    public static int d(DisplayMode displayMode) {
        return displayMode.getFrequency();
    }

    public static int b(DisplayMode displayMode) {
        return displayMode.getHeight();
    }

    public static int c(DisplayMode displayMode) {
        return displayMode.getWidth();
    }

    public static int a(DisplayMode displayMode) {
        return displayMode.getBitsPerPixel();
    }
}

