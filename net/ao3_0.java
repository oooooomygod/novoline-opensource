/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.events.events.ShaderEvent;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.Framebuffer;
import deobf.MCInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.ao3
 */
public class ao3_0 {
    private T4 i;
    private T4 f;
    private T4 g = new T4(ajp_0.f);
    private List<Framebuffer> c;
    private T4 m;
    private T4 a;
    private aGI e;
    private Framebuffer d;
    private T4 b;
    private static Minecraft l = MCInvoker.f();
    private aGI k;
    private T4 j;
    private T4 h = new T4(ajp_0.b);

    private void a(int n) {
        azs_0.a();
        Iterator iterator = ListInvoker.iterator(this.c);
        if (dz_0.c(iterator)) {
            Framebuffer framebuffer = (Framebuffer)dz_0.b(iterator);
            FramebufferInvoker.f(framebuffer);
        }
        ListInvoker.clear(this.c);
        int n2 = 1;
        float f = (float)n + 0.1f;
        int n3 = 0;
        if (n3 < MathInvoker.a(f / 2.0f)) {
            ListInvoker.add(this.c, new Framebuffer(ao3_0.l.displayWidth, ao3_0.l.displayHeight, false));
            if (n3 != MathInvoker.a(f / 2.0f) - 1 || n % 2 == 0) {
                n2 <<= 1;
            }
            ++n3;
        }
        if ((n3 = MathInvoker.a(f / 2.0f)) < n) {
            ListInvoker.add(this.c, new Framebuffer(ao3_0.l.displayWidth / (n2 >>= 1), ao3_0.l.displayHeight / n2, false));
            ++n3;
        }
    }

    public void a() {
        this.e = oa_0.b(oa_0.a(oa_0.a(oa_0.b(oa_0.a(), ajp_0.l), ajp_0.g), new T4[]{this.a, this.i, this.b, this.f, this.j}));
        this.k = oa_0.b(oa_0.a(oa_0.a(oa_0.b(oa_0.a(), ajp_0.o), ajp_0.h), new T4[]{this.g, this.h, this.m}));
        this.d = new Framebuffer(ao3_0.l.displayWidth, ao3_0.l.displayHeight, false);
        FramebufferInvoker.setFramebufferColor(this.d, 0.0f, 0.0f, 0.0f, 0.0f);
        this.a(8);
    }

    public ao3_0() {
        this.m = new T4(ajp_0.a);
        this.k = oa_0.b(oa_0.a(oa_0.a(oa_0.b(oa_0.a(), ajp_0.e), ajp_0.n), new T4[]{this.g, this.h, this.m}));
        this.a = new T4(ajp_0.c);
        this.i = new T4(ajp_0.i);
        this.b = new T4(ajp_0.j);
        this.f = new T4(ajp_0.d);
        this.j = new T4(ajp_0.m);
        this.e = oa_0.b(oa_0.a(oa_0.a(oa_0.b(oa_0.a(), ajp_0.k), ajp_0.p), new T4[]{this.a, this.i, this.b, this.f, this.j}));
        this.c = new ArrayList<Framebuffer>();
        this.a();
    }

    public void b() {
        azs_0.c();
        int n = 8;
        GlStateManagerInvoker.enableAlpha();
        GL11.glAlphaFunc((int)516, (float)0.0f);
        FramebufferInvoker.bindFramebuffer(this.d, false);
        FramebufferInvoker.c(this.d);
        EventManagerInvoker.call(new ShaderEvent());
        if (ao3_0.l.currentScreen != null) {
            aLW.b(ao3_0.l.currentScreen);
        }
        FramebufferInvoker.unbindFramebuffer(this.d);
        oa_0.c(this.k);
        aoh_1.a(this.g, 0);
        Framebuffer framebuffer = MCInvoker.c(l);
        float f = 1.0f;
        int n2 = 0;
        Framebuffer framebuffer2 = (Framebuffer)ListInvoker.get(this.c, 0);
        FramebufferInvoker.bindFramebuffer(framebuffer2, true);
        int n3 = framebuffer2.g;
        int n4 = framebuffer2.d;
        aoh_1.a(this.h, 3.0f / (float)n3, 3.0f / (float)n4);
        aoh_1.a(this.m, (float)n / 2.0f);
        oa_0.b(this.k, framebuffer);
        framebuffer = framebuffer2;
        ++n2;
        oa_0.c(this.e);
        aoh_1.a(this.a, 0);
        aqg_0.b(34004);
        GL11.glBindTexture((int)3553, (int)this.d.e);
        aqg_0.b(33984);
        aoh_1.a(this.j, 0);
        aoh_1.a(this.i, 20);
        n2 = 0;
        int n5 = 32;
        n3 = n / 2;
        n5 >>= 1;
        Framebuffer framebuffer3 = (Framebuffer)ListInvoker.get(this.c, n3);
        FramebufferInvoker.bindFramebuffer(framebuffer3, true);
        FramebufferInvoker.c(framebuffer3);
        int n6 = framebuffer3.g;
        int n7 = framebuffer3.d;
        aoh_1.a(this.b, 3.0f / (float)n6, 3.0f / (float)n7);
        aoh_1.a(this.f, ((float)n / 2.0f - (float)n2 + f) / (float)n5);
        int cfr_ignored_0 = n - 1;
        oa_0.b(this.e, framebuffer);
        framebuffer = framebuffer3;
        ++n2;
        ++n3;
        oa_0.a(this.e);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(l), true);
        oa_0.b(this.e, framebuffer);
        GlStateManagerInvoker.k(0);
        GL11.glAlphaFunc((int)516, (float)0.1f);
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.enableAlpha();
    }
}

