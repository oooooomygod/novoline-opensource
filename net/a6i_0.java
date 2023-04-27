/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Framebuffer;
import deobf.MCInvoker;
import deobf.TimerUtil;
import net.l__0;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.a6i
 */
public class a6i_0 {
    public static void b() {
        GL11.glDisable((int)2960);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
    }

    public static void a(Framebuffer framebuffer) {
        l__0.b(framebuffer.f);
        int n = l__0.b();
        l__0.b(36161, n);
        l__0.b(36161, 34041, MCInvoker.f().displayWidth, MCInvoker.f().displayHeight);
        l__0.a(36160, 36128, 36161, n);
        l__0.a(36160, 36096, 36161, n);
    }

    public static void a() {
        TimerUtil.e();
        Framebuffer framebuffer = MCInvoker.c(MCInvoker.f());
        if (framebuffer != null && framebuffer.f > -1) {
            a6i_0.a(framebuffer);
            framebuffer.f = -1;
        }
    }

    public static void a(boolean bl) {
        a6i_0.a();
        GL11.glClearStencil((int)0);
        GL11.glClear((int)1024);
        GL11.glEnable((int)2960);
        GL11.glStencilFunc((int)518, (int)1, (int)1);
        TimerUtil.e();
        GL11.glStencilOp((int)7680, (int)7680, (int)7681);
        if (!bl) {
            GlStateManagerInvoker.a(false, false, false, false);
        }
    }

    public static void b(boolean bl) {
        TimerUtil.e();
        GL11.glStencilFunc((int)(bl ? 515 : 517), (int)1, (int)1);
        GL11.glStencilOp((int)7680, (int)7680, (int)7680);
        GlStateManagerInvoker.a(true, true, true, true);
        GlStateManagerInvoker.enableBlend();
    }
}

