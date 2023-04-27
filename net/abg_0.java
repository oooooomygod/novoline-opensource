/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import net.aol_1;

/*
 * Renamed from net.aBg
 */
public class abg_0 {
    public static boolean a(Graphics graphics, Image image, int n, int n2, int n3, int n4, ImageObserver imageObserver) {
        return graphics.drawImage(image, n, n2, n3, n4, imageObserver);
    }

    public static boolean a(Graphics graphics, Image image, int n, int n2, ImageObserver imageObserver) {
        return graphics.drawImage(image, n, n2, imageObserver);
    }

    public static void a(Graphics graphics) {
        graphics.dispose();
    }

    public static boolean a(Graphics graphics, Image image, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, ImageObserver imageObserver) {
        aol_1.b();
        boolean bl = graphics.drawImage(image, n, n2, n3, n4, n5, n6, n7, n8, imageObserver);
        ListInvoker.b(new ListInvoker[5]);
        return bl;
    }
}

