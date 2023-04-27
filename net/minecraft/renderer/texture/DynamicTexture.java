/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.renderer.texture;

import java.awt.image.BufferedImage;
import net.AbstractTexture;
import net.aI_;
import net.ahf_1;
import net.aiv_2;
import net.jj_0;
import net.ys_2;

public class DynamicTexture
extends AbstractTexture {
    private boolean i = false;
    private static String h = "CL_00001048";
    private int k;
    private int[] j;
    private int l;


    public void d() {
        if (ys_2.aC()) {
            if (!this.i) {
                ahf_1.a(this.a(), this.l, this.k, this);
                this.i = true;
            }
            ahf_1.a(this.a(), this.j, this.l, this.k, this);
        } else {
            aiv_2.a(this.a(), this.j, this.l, this.k);
        }
    }

    public int[] a() {
        return this.j;
    }

    public DynamicTexture(BufferedImage bufferedImage) {
        this(jj_0.f(bufferedImage), jj_0.d(bufferedImage));
        jj_0.a(bufferedImage, 0, 0, jj_0.f(bufferedImage), jj_0.d(bufferedImage), this.j, 0, jj_0.f(bufferedImage));
        this.d();
    }

    public DynamicTexture(int n, int n2) {
        this.l = n;
        this.k = n2;
        this.j = new int[n * n2 * 3];
        if (ys_2.aC()) {
            ahf_1.a(this.a(), n, n2, this);
            this.i = true;
        } else {
            aiv_2.a(this.a(), n, n2);
        }
    }

    @Override
    public void a(aI_ aI_2) {
    }
}

