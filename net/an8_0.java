/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EnumPlayerType;
import deobf.Framebuffer;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import deobf.TimerUtil;
import java.awt.Color;
import net.Glow;
import net.P8;
import net.a1V;
import net.a8F;
import net.aUL;
import net.aol_1;
import net.apl_1;
import net.aqr_1;
import net.arn_1;
import net.ayj_0;
import net.hb_2;
import net.l__0;
import net.pl_1;
import net.qc_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.an8
 */
public class an8_0 {
    public static void a(Glow glow, Entity entity, int n) {
        block10: {
            block9: {
                TimerUtil.e();
                if (!(entity instanceof EntityPlayer)) break block9;
                if (a8F.a(NovolineInvoker.A(NovolineInvoker.getInstance()), ayj_0.x(entity), EnumPlayerType.TARGET)) {
                    arn_1.a(glow.u);
                }
                if (a8F.a(NovolineInvoker.A(NovolineInvoker.getInstance()), ayj_0.x(entity), EnumPlayerType.FRIEND)) {
                    arn_1.a(glow.A);
                }
                if (StringPropertyInvoker.isMode(qc_0.c(glow), aqr_1.d)) {
                    arn_1.a(pl_1.a(entity));
                }
                if (StringPropertyInvoker.isMode(qc_0.c(glow), aqr_1.g)) {
                    a1V.a(P8.b(aUL.f(qc_0.d(glow))));
                }
                if (!StringPropertyInvoker.isMode(qc_0.c(glow), aqr_1.a)) break block10;
                a1V.a(hb_2.a(StringPropertyInvoker.isMode(qc_0.e(glow), aqr_1.h) ? (long)n : 0L));
            }
            if (StringPropertyInvoker.isMode(qc_0.c(glow), aqr_1.e) || StringPropertyInvoker.isMode(qc_0.c(glow), aqr_1.c)) {
                a1V.a(P8.b(aUL.f(qc_0.d(glow))));
            }
            if (StringPropertyInvoker.isMode(qc_0.c(glow), aqr_1.f)) {
                a1V.a(hb_2.a(StringPropertyInvoker.isMode(qc_0.e(glow), aqr_1.b) ? (long)n : 0L));
            }
        }
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)10754);
        GL11.glPolygonOffset((float)1.0f, (float)-2000000.0f);
        OpenGlHelper.a(apl_1.ab, 240.0f, 240.0f);
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    private an8_0() {
        throw new UnsupportedOperationException(aqr_1.i);
    }

    public static void c() {
        GL11.glStencilFunc((int)512, (int)0, (int)15);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glPolygonMode((int)1032, (int)6914);
    }

    public static void a(@NonNull Framebuffer framebuffer) {
        l__0.b(framebuffer.f);
        int n = l__0.b();
        l__0.b(36161, n);
        l__0.b(36161, 34041, MCInvoker.f().displayWidth, MCInvoker.f().displayHeight);
        l__0.a(36160, 36128, 36161, n);
        l__0.a(36160, 36096, 36161, n);
    }

    public static void a(@NonNull Color color) {
        GL11.glColor4d((double)((float)aol_1.c(color) / 255.0f), (double)((float)aol_1.g(color) / 255.0f), (double)((float)aol_1.f(color) / 255.0f), (double)((float)aol_1.e(color) / 255.0f));
    }

    public static Color a(Color color, int n) {
        return new Color(aol_1.c(color), aol_1.g(color), aol_1.f(color), n);
    }

    public static void d() {
        GL11.glPolygonOffset((float)1.0f, (float)2000000.0f);
        GL11.glDisable((int)10754);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)2960);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)3008);
        GL11.glPopAttrib();
    }

    public static void b() {
        GL11.glStencilFunc((int)514, (int)1, (int)15);
        GL11.glStencilOp((int)7680, (int)7680, (int)7680);
        GL11.glPolygonMode((int)1032, (int)6913);
    }

    public static void a(int n, int n2, int n3, float f) {
        GL11.glColor4d((double)(0.003921569f * (float)n), (double)(0.003921569f * (float)n2), (double)(0.003921569f * (float)n3), (double)(0.003921569f * f));
    }

    public static void a() {
        an8_0.e();
        GL11.glPushAttrib((int)1048575);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)3.0f);
        GL11.glEnable((int)2848);
        GL11.glEnable((int)2960);
        GL11.glClear((int)1024);
        GL11.glClearStencil((int)15);
        GL11.glStencilFunc((int)512, (int)1, (int)15);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glPolygonMode((int)1032, (int)6913);
    }

    public static void e() {
        TimerUtil.e();
        Framebuffer framebuffer = MCInvoker.c(MCInvoker.f());
        if (framebuffer != null && framebuffer.f > -1) {
            an8_0.a(framebuffer);
            framebuffer.f = -1;
        }
    }
}

