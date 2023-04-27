/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.ImageObserver;
import net.aol_1;

/*
 * Renamed from net.adZ
 */
public class adz_0 {
    public static void a(Graphics2D graphics2D, int n, int n2, int n3, int n4) {
        graphics2D.fillRect(n, n2, n3, n4);
    }

    public static FontMetrics a(Graphics2D graphics2D) {
        return graphics2D.getFontMetrics();
    }

    public static void a(Graphics2D graphics2D, Color color) {
        graphics2D.setColor(color);
    }

    public static void a(Graphics2D graphics2D, RenderingHints.Key key, Object object) {
        graphics2D.setRenderingHint(key, object);
    }

    public static void a(Graphics2D graphics2D, String string, int n, int n2) {
        graphics2D.drawString(string, n, n2);
    }

    public static boolean a(Graphics2D graphics2D, Image image, int n, int n2, int n3, int n4, ImageObserver imageObserver) {
        aol_1.b();
        boolean bl = graphics2D.drawImage(image, n, n2, n3, n4, imageObserver);
        if (ListInvoker.b() != null) {
            aol_1.b(false);
        }
        return bl;
    }

    public static void a(Graphics2D graphics2D, Font font) {
        graphics2D.setFont(font);
    }
}

