/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.Framebuffer;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.avj
 */
public class avj_2 {
    private double f;
    private long b;
    private T4 i = new T4(abt_1.e);
    private int d;
    private aGI c;
    private Framebuffer e;
    private T4 j = new T4(abt_1.b);
    private double a;
    private T4 h = new T4(abt_1.c);
    private Minecraft g;

    public avj_2() {
        this.c = oa_0.b(oa_0.a(oa_0.b(oa_0.a(oa_0.a(), abt_1.d), abt_1.a), new T4[]{this.j, this.i, this.h}));
        this.b = SystemInvoker.f();
        this.g = MCInvoker.f();
        this.e = new Framebuffer(this.g.displayWidth, this.g.displayHeight, false);
        this.a();
    }

    private void a() {
        this.e = new Framebuffer(this.g.displayWidth, this.g.displayHeight, false);
        this.c = oa_0.b(oa_0.a(oa_0.b(oa_0.a(oa_0.a(), abt_1.f), abt_1.g), new T4[]{this.j, this.i, this.h}));
    }

    public void a(Runnable runnable) {
        azs_0.a();
        if (this.f != (double)this.g.displayWidth || this.a != (double)this.g.displayHeight || this.d != this.g.gameSettings.z) {
            this.a();
        }
        FramebufferInvoker.a(this.e);
        FramebufferInvoker.bindFramebuffer(this.e, false);
        sj_1.a(runnable);
        FramebufferInvoker.unbindFramebuffer(this.e);
        aqg_0.b(34004);
        GL11.glBindTexture((int)3553, (int)this.e.e);
        aqg_0.b(33984);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)3008);
        OpenGlHelper.c(770, 771, 1, 0);
        float f = (float)(SystemInvoker.f() - this.b) / 1000.0f;
        oa_0.c(this.c);
        aoh_1.a(this.i, 20);
        aoh_1.a(this.h, f);
        aoh_1.a(this.j, this.g.displayWidth * 2, this.g.displayHeight * 2);
        FramebufferInvoker.bindFramebuffer(this.e, false);
        oa_0.b(this.c, this.e);
        oa_0.a(this.c);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.g), false);
        oa_0.b(this.c, this.e);
        this.f = this.g.displayWidth;
        this.a = this.g.displayHeight;
        this.d = this.g.gameSettings.z;
    }

    public void b(Runnable runnable) {
        azs_0.a();
        if (this.f != (double)this.g.displayWidth || this.a != (double)this.g.displayHeight || this.d != this.g.gameSettings.z) {
            this.a();
        }
        FramebufferInvoker.a(this.e);
        FramebufferInvoker.bindFramebuffer(this.e, false);
        sj_1.a(runnable);
        FramebufferInvoker.unbindFramebuffer(this.e);
        aqg_0.b(34004);
        GL11.glBindTexture((int)3553, (int)this.e.e);
        aqg_0.b(33984);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)3008);
        OpenGlHelper.c(770, 771, 1, 0);
        float f = (float)(SystemInvoker.f() - this.b) / 1000.0f;
        oa_0.c(this.c);
        aoh_1.a(this.i, 20);
        aoh_1.a(this.h, f);
        aoh_1.a(this.j, this.g.displayWidth * 2, this.g.displayHeight * 2);
        FramebufferInvoker.bindFramebuffer(this.e, false);
        oa_0.a(this.c, this.e);
        oa_0.a(this.c);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.g), false);
        oa_0.a(this.c, this.e);
        this.f = this.g.displayWidth;
        this.a = this.g.displayHeight;
        this.d = this.g.gameSettings.z;
    }
}

