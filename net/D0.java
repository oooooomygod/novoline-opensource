/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.SoundHandlerInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import java.awt.Color;
import net.ResourceLocation;
import net.SoundHandler;
import net.a1V;
import net.a7l_0;
import net.adj_1;
import net.aih_1;
import net.ant_0;
import net.aol_1;
import net.ll_1;
import net.ng_0;
import org.jetbrains.annotations.NotNull;

public class D0 {
    private float e;
    private float g;
    private int b;
    private float a;
    private float c;
    private FontRenderer f = adj_1.a(ng_0.a, 20);
    private String d;

    public boolean b(int n, int n2) {
        ant_0.b();
        return (float)n >= this.e && (float)n <= this.a && (float)n2 >= this.c && (float)n2 <= this.g;
    }

    public void a(int n, int n2) {
        ant_0.b();
        a1V.c(this.e, this.c, this.a, this.g, this.b);
        a7l_0.b(this.f, this.d, this.e + (this.a - this.e) / 2.0f - (float)(a7l_0.a(this.f, this.d) / 2), this.c + (this.g - this.c) / 2.0f - 3.0f, this.b(n, n2) ? 0xFFFFFF : aol_1.b(aol_1.d(new Color(0xFFFFFF))), true);
    }

    public D0(String string, float f, float f2, float f3, float f4, int n) {
        this.e = f;
        this.a = f3;
        this.c = f2;
        this.g = f4;
        this.d = string;
        this.b = n;
    }

    public void a(@NotNull SoundHandler soundHandler) {
        SoundHandlerInvoker.c(soundHandler, aih_1.a(new ResourceLocation(ll_1.a), 1.0f));
    }

    public float a() {
        return this.g;
    }

    public float b() {
        return this.e;
    }

    public float c() {
        return this.c;
    }

    public float d() {
        return this.a;
    }
}

