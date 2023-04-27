/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Framebuffer;
import deobf.OpenGlHelper;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import net.HD;
import net.a4E;
import net.aI8;
import net.aiv_2;
import net.apj_1;
import net.cc_1;
import net.jj_0;

/*
 * Renamed from net.afO
 */
class afo_0
extends Thread {
    String b;
    File c;
    Framebuffer a;

    afo_0(String string, Framebuffer framebuffer, String string2, File file) {
        this.a = framebuffer;
        this.b = string2;
        this.c = file;
        super(string);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void run() {
        HD.a(apj_1.b(), apj_1.a());
        aiv_2.a(apj_1.a(), this.a.g, this.a.d);
        BufferedImage bufferedImage = null;
        if (OpenGlHelper.g()) {
            int n;
            bufferedImage = new BufferedImage(this.a.g, this.a.d, 1);
            for (int i = n = this.a.c - this.a.d; i < this.a.c; ++i) {
                for (int j = 0; j < this.a.g; ++j) {
                    jj_0.a(bufferedImage, j, i - n, apj_1.a()[i * this.a.i + j]);
                }
            }
        } else {
            bufferedImage = new BufferedImage(this.a.g, this.a.d, 1);
            jj_0.b(bufferedImage, 0, 0, this.a.g, this.a.d, apj_1.a(), 0, this.a.g);
        }
        File file = this.b == null ? apj_1.b(this.c) : new File(this.c, this.b);
        try {
            aI8.a((RenderedImage)bufferedImage, cc_1.a, file);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
        super.run();
    }
}

