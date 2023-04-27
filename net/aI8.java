/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

public class aI8 {
    private static String b = "m2Isbc";

    public static ImageInputStream a(Object object) {
        return ImageIO.createImageInputStream(object);
    }

    static {
        if (aI8.b() == null) {
            aI8.b("m2Isbc");
        }
    }

    public static BufferedImage a(File file) {
        return ImageIO.read(file);
    }

    public static void a(boolean bl) {
        ImageIO.setUseCache(bl);
    }

    public static String b() {
        return b;
    }

    public static BufferedImage a(InputStream inputStream) {
        return ImageIO.read(inputStream);
    }

    public static Iterator a(String string) {
        return ImageIO.getImageReadersBySuffix(string);
    }

    public static boolean a(RenderedImage renderedImage, String string, File file) {
        return ImageIO.write(renderedImage, string, file);
    }

    public static boolean a(RenderedImage renderedImage, String string, OutputStream outputStream) {
        return ImageIO.write(renderedImage, string, outputStream);
    }

    public static void b(String string) {
        b = string;
    }
}

