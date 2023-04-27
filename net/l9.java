/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Framebuffer;
import deobf.MCInvoker;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.util.ConcurrentModificationException;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class l9 {
    private aeh_0 l;
    private T4 g;
    private T4 j;
    private T4 b;
    private T4 c;
    private T4 a;
    private Framebuffer n;
    private T4 k;
    private T4 m;
    private T4 f;
    private aGI e;
    private Framebuffer d;
    private T4 i;
    private static Minecraft h = MCInvoker.f();

    public void b() {
        azs_0.a();
        if (l9.h.displayWidth != this.n.g || l9.h.displayHeight != this.n.d) {
            FramebufferInvoker.f(this.n);
            this.n = new Framebuffer(l9.h.displayWidth, l9.h.displayHeight, true);
            FramebufferInvoker.f(this.d);
            this.d = new Framebuffer(l9.h.displayWidth, l9.h.displayHeight, true);
        }
        FramebufferInvoker.a(this.n);
        FramebufferInvoker.a(this.d);
        FramebufferInvoker.setFramebufferColor(this.n, 0.0f, 0.0f, 0.0f, 0.0f);
        FramebufferInvoker.setFramebufferColor(this.d, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public static l9 a() {
        return arx_2.a(arx_2.INSTANCE);
    }

    public l9() {
        this.n = new Framebuffer(l9.h.displayWidth, l9.h.displayHeight, true);
        this.d = new Framebuffer(l9.h.displayWidth, l9.h.displayHeight, true);
        this.l = new aeh_0(0);
        this.j = new T4(aCi.a);
        this.g = new T4(aCi.k);
        this.i = new T4(aCi.e);
        this.c = new T4(aCi.j);
        this.k = new T4(aCi.i);
        this.a = new T4(aCi.g);
        this.m = new T4(aCi.c);
        this.f = new T4(aCi.b);
        this.b = new T4(aCi.d);
        this.e = oa_0.b(oa_0.a(oa_0.b(oa_0.a(oa_0.a(), aCi.h), aCi.f), new T4[]{this.j, this.g, this.i, this.c, this.k, this.a, this.f, this.m, this.b}));
    }

    public void a(int n, int n2, boolean bl, Runnable runnable, Color color) {
        azs_0.a();
        this.b();
        FramebufferInvoker.bindFramebuffer(this.n, true);
        try {
            sj_1.a(runnable);
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
        FramebufferInvoker.bindFramebuffer(this.d, true);
        oa_0.c(this.e);
        float f = 0.003921569f * (float)n2;
        aoh_1.a(this.f, f);
        aoh_1.a(this.m, false);
        aoh_1.a(this.m, true);
        aoh_1.a(this.b, 0.003921569f * (float)aol_1.c(color), 0.003921569f * (float)aol_1.g(color), 0.003921569f * (float)aol_1.f(color));
        if (avk_0.b(this.l) != n) {
            this.l = new aeh_0(n);
            avk_0.a(this.l);
            FloatBuffer floatBuffer = a9w_0.a(n);
            aHB.a(floatBuffer, avk_0.c(this.l));
            aHB.b(floatBuffer);
            aoh_1.a(this.j, (float)n);
            aoh_1.a(this.g, floatBuffer);
            aoh_1.a(this.i, 0);
            aoh_1.a(this.c, 15);
        }
        aoh_1.a(this.k, 1.0f / (float)l9.h.displayWidth, 1.0f / (float)l9.h.displayHeight);
        aoh_1.a(this.a, 1.0f, 0.0f);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(1, 770);
        boolean bl2 = GL11.glIsEnabled((int)3008);
        if (!bl2) {
            GlStateManagerInvoker.enableAlpha();
        }
        GL11.glAlphaFunc((int)516, (float)0.0f);
        FramebufferInvoker.e(this.n);
        if (bl) {
            oa_0.a(this.e, this.n);
        }
        oa_0.b(this.e, this.n);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(h), true);
        GlStateManagerInvoker.b(770, 771);
        aoh_1.a(this.a, 0.0f, 1.0f);
        FramebufferInvoker.e(this.d);
        aqg_0.b(33999);
        FramebufferInvoker.e(this.n);
        aqg_0.b(33984);
        oa_0.a(this.e, this.n);
        oa_0.b(this.e, this.n);
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.C();
        oa_0.a(this.e);
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}

