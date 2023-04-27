/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.FontRenderer;
import java.util.List;
import net.minecraft.client.Minecraft;

public class Qw
extends Gui {
    public int k;
    private FontRenderer q;
    private List<String> h;
    private boolean o;
    protected int f = 20;
    private boolean r;
    private int i;
    protected int n = 200;
    private int g;
    private int s;
    private int p;
    public int l;
    private int m;
    public boolean j = true;
    public int t;

    public void a(Minecraft minecraft, int n, int n2) {
        if (this.j) {
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            this.b(minecraft, n, n2);
            int n3 = this.t + this.f / 2 + this.m / 2;
            int n4 = n3 - ListInvoker.size(this.h) * 10 / 2;
            for (int i = 0; i < ListInvoker.size(this.h); ++i) {
                if (this.r) {
                    this.b(this.q, (String)ListInvoker.get(this.h, i), this.k + this.n / 2, n4 + i * 10, this.p);
                    continue;
                }
                this.a(this.q, (String)ListInvoker.get(this.h, i), this.k, n4 + i * 10, this.p);
            }
        }
    }

    protected void b(Minecraft minecraft, int n, int n2) {
        if (this.o) {
            int n3 = this.n + this.m * 2;
            int n4 = this.f + this.m * 2;
            int n5 = this.k - this.m;
            int n6 = this.t - this.m;
            this.a(n5, n6, n5 + n3, n6 + n4, this.i);
            this.b(n5, n5 + n3, n6, this.s);
            this.b(n5, n5 + n3, n6 + n4, this.g);
            this.a(n5, n6, n6 + n4, this.s);
            this.a(n5 + n3, n6, n6 + n4, this.g);
        }
    }

    public Qw a() {
        this.r = true;
        return this;
    }

    public void a(String string) {
        ListInvoker.add(this.h, I18n.format(string, new Object[0]));
    }

    public Qw(FontRenderer fontRenderer, int n, int n2, int n3, int n4, int n5, int n6) {
        this.q = fontRenderer;
        this.l = n;
        this.k = n2;
        this.t = n3;
        this.n = n4;
        this.f = n5;
        this.h = my_0.c();
        this.r = false;
        this.o = false;
        this.p = n6;
        this.i = -1;
        this.s = -1;
        this.g = -1;
        this.m = 0;
    }
}

