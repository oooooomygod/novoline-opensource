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
import java.awt.Color;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.a2f
 */
public class a2f_0 {
    private int a;
    private T4 j = new T4(aqi_2.f);
    private double h;
    private long i;
    private T4 g = new T4(aqi_2.c);
    private Framebuffer b;
    private T4 f = new T4(aqi_2.a);
    private T4 l = new T4(aqi_2.d);
    private double c;
    private Minecraft k;
    private T4 e = new T4(aqi_2.e);
    private aGI d;

    public a2f_0() {
        this.i = SystemInvoker.f();
        this.k = MCInvoker.f();
        this.b = new Framebuffer(this.k.displayWidth, this.k.displayHeight, false);
        this.a();
    }

    public void a(Consumer<Void> consumer, Color color) {
        azs_0.a();
        if (this.c != (double)this.k.displayWidth || this.h != (double)this.k.displayHeight || this.a != this.k.gameSettings.z) {
            this.a();
        }
        FramebufferInvoker.a(this.b);
        FramebufferInvoker.bindFramebuffer(this.b, false);
        aan_1.a(consumer, null);
        FramebufferInvoker.unbindFramebuffer(this.b);
        aqg_0.b(34004);
        GL11.glBindTexture((int)3553, (int)this.b.e);
        aqg_0.b(33984);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)3008);
        OpenGlHelper.c(770, 771, 1, 0);
        float f = (float)(SystemInvoker.f() - this.i) / 500.0f;
        oa_0.c(this.d);
        aoh_1.a(this.f, 20);
        aoh_1.a(this.j, f);
        aoh_1.a(this.g, this.k.displayWidth, this.k.displayHeight);
        aoh_1.a(this.e, (float)aol_1.c(color) / 255.0f, (float)aol_1.g(color) / 255.0f, (float)aol_1.f(color) / 255.0f);
        aoh_1.a(this.l, (float)aol_1.c(color) / 255.0f, (float)aol_1.g(color) / 255.0f, (float)aol_1.f(color) / 255.0f, (float)aol_1.e(color) / 255.0f);
        FramebufferInvoker.bindFramebuffer(this.b, false);
        oa_0.b(this.d, this.b);
        oa_0.a(this.d);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.k), false);
        oa_0.b(this.d, this.b);
        this.c = this.k.displayWidth;
        this.h = this.k.displayHeight;
        this.a = this.k.gameSettings.z;
    }

    private void a() {
        this.b = new Framebuffer(this.k.displayWidth, this.k.displayHeight, false);
        this.d = oa_0.b(oa_0.a(oa_0.b(oa_0.a(oa_0.a(), aqi_2.b), aqi_2.g), new T4[]{this.j, this.g, this.f, this.l, this.e}));
    }
}

