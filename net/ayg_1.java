/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import net.aP2;
import net.abg_0;
import net.azy_2;
import net.jj_0;

/*
 * Renamed from net.ayG
 */
public class ayg_1 {
    public static int a = 64;

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    public static BufferedImage a(BufferedImage bufferedImage) {
        aP2.b();
        if (bufferedImage == null) {
            return null;
        }
        BufferedImage bufferedImage2 = new BufferedImage(64, 64, 2);
        Graphics graphics = jj_0.c(bufferedImage2);
        abg_0.a(graphics, bufferedImage, 0, 0, 64, 64, null);
        abg_0.a(graphics);
        return bufferedImage2;
    }

    private ayg_1() {
        throw new UnsupportedOperationException(azy_2.a);
    }
}

