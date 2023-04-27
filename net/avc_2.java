/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.awt.image.BufferedImage;
import net.a9F;

/*
 * Renamed from net.avc
 */
public class avc_2
implements a9F {
    private int b;
    private int a;
    private int[] c;

    private void c(int n, int n2, int n3, int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                int n5 = i + j * this.b;
                this.c[n5] = this.c[n5] | 0xFF000000;
            }
        }
    }

    @Override
    public BufferedImage a(BufferedImage bufferedImage) {
        return null;
    }

    @Override
    public void a() {
    }

    private boolean b(int n, int n2, int n3, int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                int n5 = this.c[i + j * this.b];
                if ((n5 >> 24 & 0xFF) >= 128) continue;
                return true;
            }
        }
        return false;
    }

    private void a(int n, int n2, int n3, int n4) {
        if (!this.b(n, n2, n3, n4)) {
            for (int i = n; i < n3; ++i) {
                for (int j = n2; j < n4; ++j) {
                    int n5 = i + j * this.b;
                    this.c[n5] = this.c[n5] & 0xFFFFFF;
                }
            }
        }
    }
}

