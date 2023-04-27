/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.Tessellator;
import net.AB;
import net.co_2;
import net.uy_0;

/*
 * Renamed from net.y4
 */
public class y4_0 {
    public static y4_0 b;
    public static Tessellator a;

    public void a(float f, float f2, float f3) {
        WorldRendererInvoker.d(TessellatorInvoker.getWorldRenderer(a), f, f2, f3);
    }

    static {
        a = TessellatorInvoker.getInstance();
        b = new y4_0();
    }

    public void a() {
        TessellatorInvoker.draw(a);
    }

    public void b() {
        TessellatorInvoker.getWorldRenderer(a).c();
    }

    public void b(double d, double d2, double d3) {
        WorldRendererInvoker.b(TessellatorInvoker.getWorldRenderer(a), d, d2, d3);
    }

    public y4_0 a(double d, double d2, double d3) {
        WorldRendererInvoker.endVertex(TessellatorInvoker.getWorldRenderer(a), d, d2, d3);
        return this;
    }

    public y4_0 a(double d, double d2) {
        WorldRendererInvoker.color(TessellatorInvoker.getWorldRenderer(a), d, d2);
        return this;
    }

    public void a(float f, float f2, float f3, float f4) {
        WorldRendererInvoker.a(TessellatorInvoker.getWorldRenderer(a), f, f2, f3, f4);
    }

    public void a(int n, AB aB10) {
        WorldRendererInvoker.begin(TessellatorInvoker.getWorldRenderer(a), n, uy_0.a(aB10));
    }

    public co_2 a(int n, int n2, int n3, int n4) {
        return new co_2(WorldRendererInvoker.tex(TessellatorInvoker.getWorldRenderer(a), n, n2, n3, n4));
    }

    public void a(short s, short s3) {
        WorldRendererInvoker.a(TessellatorInvoker.getWorldRenderer(a), s, s3);
    }
}

