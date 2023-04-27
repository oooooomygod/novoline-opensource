/*
 * Decompiled with CFR 0.152.
 */
package net;

import javax.imageio.ImageReader;

/*
 * Renamed from net.aiM
 */
public class aim_1 {
    public static void a(ImageReader imageReader) {
        imageReader.dispose();
    }

    public static void a(ImageReader imageReader, Object object) {
        imageReader.setInput(object);
    }

    public static int a(ImageReader imageReader, int n) {
        return imageReader.getHeight(n);
    }

    public static int b(ImageReader imageReader) {
        return imageReader.getMinIndex();
    }

    public static int b(ImageReader imageReader, int n) {
        return imageReader.getWidth(n);
    }
}

