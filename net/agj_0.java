/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

/*
 * Renamed from net.aGj
 */
public class agj_0 {
    public static Rectangle2D a(FontMetrics fontMetrics, String string, Graphics graphics) {
        return fontMetrics.getStringBounds(string, graphics);
    }

    public static int a(FontMetrics fontMetrics) {
        return fontMetrics.getAscent();
    }
}

