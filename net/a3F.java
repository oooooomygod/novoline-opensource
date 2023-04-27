/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.PixelFormat
 */
package net;

import org.lwjgl.opengl.PixelFormat;

public class a3F {
    public static PixelFormat a(PixelFormat pixelFormat, int n) {
        return pixelFormat.withDepthBits(n);
    }

    public static PixelFormat b(PixelFormat pixelFormat, int n) {
        return pixelFormat.withSamples(n);
    }
}

