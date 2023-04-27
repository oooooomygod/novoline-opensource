/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.renderer.texture.DynamicTexture;
import deobf.MCInvoker;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

public class aHK {
    private a4c_0[] d = new a4c_0[0];
    private DynamicTexture g = null;
    private BufferedImage n = null;
    public static int l = 0;
    public static int m = 4;
    public static int f = 5;
    private Dimension k = null;
    public static int a = 3;
    public static int c = 1;
    private ResourceLocation i = new ResourceLocation(a8B.a);
    public static int h = 2;
    private boolean j = false;
    public static int b = 6;
    private ResourceLocation e = null;

    public aHK(Dimension dimension, boolean bl, a4c_0[] a4c_0Array) {
        this.k = dimension;
        this.j = bl;
        this.d = a4c_0Array;
    }

    public ResourceLocation a() {
        return this.e;
    }

    public void a(ry_1 ry_12, AbstractClientPlayer abstractClientPlayer, float f, float f2) {
        aP2.b();
        TextureManager textureManager = ys_2.l();
        if (this.j) {
            TextureManagerInvoker.bindTexture(textureManager, aUi.a(abstractClientPlayer));
        }
        if (this.e != null) {
            if (this.g == null && this.n != null) {
                this.g = new DynamicTexture(this.n);
                TextureManagerInvoker.a(MCInvoker.E(MCInvoker.f()), this.e, this.g);
            }
            TextureManagerInvoker.bindTexture(textureManager, this.e);
        }
        TextureManagerInvoker.bindTexture(textureManager, this.i);
        int n = 0;
        if (n < this.d.length) {
            a4c_0 a4c_02 = this.d[n];
            GlStateManagerInvoker.pushMatrix();
            if (aUi.m(abstractClientPlayer)) {
                GlStateManagerInvoker.translate(0.0f, 0.2f, 0.0f);
            }
            a3E.a(a4c_02, ry_12, f);
            GlStateManagerInvoker.popMatrix();
            ++n;
        }
    }

    public static a5Y a(ry_1 ry_12, int n) {
        switch (n) {
            case 0: {
                return ry_12.q;
            }
            case 1: {
                return ry_12.r;
            }
            case 2: {
                return ry_12.j;
            }
            case 3: {
                return ry_12.h;
            }
            case 4: {
                return ry_12.o;
            }
            case 5: {
                return ry_12.l;
            }
        }
        return null;
    }

    public DynamicTexture b() {
        return this.g;
    }

    public void a(ResourceLocation resourceLocation) {
        this.e = resourceLocation;
    }

    public void a(BufferedImage bufferedImage) {
        this.n = bufferedImage;
    }

    public boolean d() {
        return this.j;
    }

    public BufferedImage c() {
        return this.n;
    }
}

