/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.FontRenderer;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class QG
extends Gui {
    protected int o;
    public String k;
    public int m;
    public boolean g = true;
    public boolean j = true;
    protected boolean f;
    public double n;
    protected static ResourceLocation l = new ResourceLocation(anw_2.b);
    protected int i;
    public double h;

    public boolean b(Minecraft minecraft, int n, int n2) {
        return this.g && this.j && (double)n >= this.n && (double)n2 >= this.h && (double)n < this.n + (double)this.o && (double)n2 < this.h + (double)this.i;
    }

    public void a(String string) {
        this.k = string;
    }

    public void a(int n) {
        this.i = n;
    }

    public QG(int n, int n2, int n3, int n4, int n5, String string) {
        this.m = n;
        this.n = n2;
        this.h = n3;
        this.o = n4;
        this.i = n5;
        this.k = string;
    }

    public QG(int n, double d, double d2, String string) {
        this(n, d, d2, 200, 20, string);
    }

    protected void a(Minecraft minecraft, int n, int n2) {
    }

    public QG(int n, int n2, int n3, String string) {
        this(n, n2, n3, 200, 20, string);
    }

    public int c() {
        return this.o;
    }

    public QG(int n, double d, double d2, int n2, int n3, String string) {
        this.m = n;
        this.n = d;
        this.h = d2;
        this.o = n2;
        this.i = n3;
        this.k = string;
    }

    public boolean d() {
        return this.f;
    }

    public void c(Minecraft minecraft, int n, int n2) {
        if (this.j) {
            FontRenderer fontRenderer = minecraft.fontRendererObj;
            TextureManagerInvoker.bindTexture(MCInvoker.E(minecraft), l);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.f = (double)n >= this.n && (double)n2 >= this.h && (double)n < this.n + (double)this.o && (double)n2 < this.h + (double)this.i;
            int n3 = this.a(this.f);
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            GlStateManagerInvoker.b(770, 771);
            QG.b(this.n, this.h, 0, 46 + n3 * 20, this.o / 2, this.i);
            QG.b(this.n + (double)(this.o / 2), this.h, 200 - this.o / 2, 46 + n3 * 20, this.o / 2, this.i);
            this.a(minecraft, n, n2);
            int n4 = 0xE0E0E0;
            if (!this.g) {
                n4 = 0xA0A0A0;
            } else if (this.f) {
                n4 = 0xFFFFA0;
            }
            this.b(fontRenderer, this.k, (int)(this.n + (double)(this.o / 2)), (int)(this.h + (double)((this.i - 8) / 2)), n4);
        }
    }

    public void a(@NotNull SoundHandler soundHandler) {
        SoundHandlerInvoker.c(soundHandler, aih_1.a(new ResourceLocation(anw_2.a), 1.0f));
    }

    public void a(int n, int n2) {
    }

    protected int a(boolean bl) {
        int n = 1;
        n = !this.g ? 0 : 2;
        return n;
    }

    public void a(double d) {
        this.h = d;
    }

    public int a() {
        return this.i;
    }

    public void b(int n) {
        this.o = n;
    }

    public void b(int n, int n2) {
    }

    public String b() {
        return this.k;
    }
}

