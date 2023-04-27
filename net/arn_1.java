/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3d
 *  javax.vecmath.Vector4d
 *  org.jetbrains.annotations.NotNull
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.events.events.Render3DEvent;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import deobf.DefaultVertexFormats;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import cc.novoline.modules.visual.HUD;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import deobf.OpenGlHelper;
import deobf.Tessellator;
import deobf.TimerUtil;
import deobf.Vec3;
import net.minecraft.renderer.WorldRenderer;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector4d;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.arN
 */
public class arn_1 {
    private static aV1 h;
    private static double k;
    private static ResourceLocation j;
    private static int i;
    private static double c;
    private static double g;
    private static float d;
    private static double e;
    private static char[] b;
    private static boolean a;
    public static double f;
    private static Minecraft l;

    public static void a(Render3DEvent render3DEvent, BlockPos blockPos, int n, int n2) {
        int n3 = BlockInvoker.a(arn_1.l.world, blockPos, 0);
        int n4 = n3 % 65536;
        int n5 = n3 / 65536;
        OpenGlHelper.a(apl_1.ab, n4, (float)n5);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        double d = hq_0.m;
        double d2 = hq_0.l;
        double d3 = hq_0.j;
        arn_1.a(render3DEvent, (double)amv_2.j(blockPos) - d, (double)amv_2.h(blockPos) - d2, (double)amv_2.i(blockPos) - d3, n, n2);
    }

    public static void b(double d, double d2, double d3, double d4, double d5, float f, int n) {
        double d6 = d + d3;
        double d7 = d2 + d4;
        GL11.glPushAttrib((int)0);
        GL11.glDisable((int)3553);
        arn_1.b(n);
        GlStateManagerInvoker.enableBlend();
        GL11.glEnable((int)2848);
        TimerUtil.e();
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)3);
        HUD cfr_ignored_0 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        int n2 = 0;
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * (d5 * -1.0)), (double)(d2 + d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * (d5 * -1.0)));
        n2 += 3;
        n2 = (int)(d2 + d5 + (double)MathHelper.b(1.5707963267948966) * (d5 * -1.0)) + 1;
        if ((double)n2 < d7 - d5 + (double)MathHelper.b(1.5707963267948966) * (d5 * -1.0)) {
            GL11.glVertex2d((double)d, (double)n2);
            ++n2;
        }
        n2 = 90;
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * (d5 * -1.0)), (double)(d7 - d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * (d5 * -1.0)));
        n2 += 3;
        n2 = (int)(d + d5 + (double)MathHelper.h(Math.PI) * (d5 * -1.0)) + 1;
        if ((double)n2 < d6 - d5 + (double)MathHelper.h(0.0) * d5) {
            GL11.glVertex2d((double)n2, (double)d7);
            ++n2;
        }
        n2 = 0;
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * d5), (double)(d7 - d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * d5));
        n2 += 3;
        n2 = (int)(d7 - d5 + (double)MathHelper.b(1.5707963267948966) * d5);
        if ((double)n2 > d2 + d5 + (double)MathHelper.b(1.5707963267948966) * d5) {
            GL11.glVertex2d((double)(d + d3), (double)n2);
            --n2;
        }
        n2 = 90;
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * d5), (double)(d2 + d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * d5));
        n2 += 3;
        n2 = (int)(d6 - d5 + (double)MathHelper.h(Math.PI) * d5);
        if ((double)n2 > d + d5 + (double)MathHelper.sin(0.0f) * (d5 * -1.0) - 1.0) {
            GL11.glVertex2d((double)n2, (double)d2);
            --n2;
        }
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glPopAttrib();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void d() {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)2896);
        GL11.glDepthMask((boolean)false);
        GL11.glHint((int)3154, (int)4354);
    }

    public static void a(double d, double d2, double d3, double d4, double d5, float f, int n, int n2) {
        TimerUtil.e();
        double d6 = d + d3;
        double d7 = d2 + d4;
        GL11.glPushAttrib((int)0);
        GL11.glDisable((int)3553);
        arn_1.b(n);
        GlStateManagerInvoker.enableBlend();
        GL11.glEnable((int)2848);
        GL11.glBegin((int)9);
        int n3 = 0;
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n3 * (Math.PI / 180)) * (d5 * -1.0)), (double)(d2 + d5 + (double)MathHelper.b((double)n3 * (Math.PI / 180)) * (d5 * -1.0)));
        ++n3;
        n3 = 90;
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n3 * (Math.PI / 180)) * (d5 * -1.0)), (double)(d7 - d5 + (double)MathHelper.b((double)n3 * (Math.PI / 180)) * (d5 * -1.0)));
        ++n3;
        n3 = 0;
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n3 * (Math.PI / 180)) * d5), (double)(d7 - d5 + (double)MathHelper.b((double)n3 * (Math.PI / 180)) * d5));
        ++n3;
        n3 = 90;
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n3 * (Math.PI / 180)) * d5), (double)(d2 + d5 + (double)MathHelper.b((double)n3 * (Math.PI / 180)) * d5));
        ++n3;
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glPopAttrib();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        arn_1.b(d, d2, d3, d4, d5, f, n2);
    }

    public static void a(double d, double d2, double d3, double d4, double d5, float f, long l4, boolean bl) {
        double d6 = d + d3;
        double d7 = d2 + d4;
        TimerUtil.e();
        GL11.glPushAttrib((int)0);
        GL11.glDisable((int)3553);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManagerInvoker.enableBlend();
        if (bl) {
            GL11.glEnable((int)2848);
        }
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)3);
        HUD cfr_ignored_0 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        long l5 = 0L;
        int n = 0;
        arn_1.b(hb_2.a(l5));
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n * (Math.PI / 180)) * (d5 * -1.0)), (double)(d2 + d5 + (double)MathHelper.b((double)n * (Math.PI / 180)) * (d5 * -1.0)));
        l5 -= l4;
        n += 3;
        n = (int)(d2 + d5 + (double)MathHelper.b(1.5707963267948966) * (d5 * -1.0)) + 1;
        if ((double)n < d7 - d5 + (double)MathHelper.b(1.5707963267948966) * (d5 * -1.0)) {
            arn_1.b(hb_2.a(l5));
            GL11.glVertex2d((double)d, (double)n);
            l5 -= l4;
            ++n;
        }
        n = 90;
        arn_1.b(hb_2.a(l5));
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n * (Math.PI / 180)) * (d5 * -1.0)), (double)(d7 - d5 + (double)MathHelper.b((double)n * (Math.PI / 180)) * (d5 * -1.0)));
        l5 -= l4;
        n += 3;
        n = (int)(d + d5 + (double)MathHelper.h(Math.PI) * (d5 * -1.0)) + 1;
        if ((double)n < d6 - d5 + (double)MathHelper.h(0.0) * d5) {
            arn_1.b(hb_2.a(l5));
            GL11.glVertex2d((double)n, (double)d7);
            l5 -= l4;
            ++n;
        }
        n = 0;
        arn_1.b(hb_2.a(l5));
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n * (Math.PI / 180)) * d5), (double)(d7 - d5 + (double)MathHelper.b((double)n * (Math.PI / 180)) * d5));
        l5 += l4;
        n += 3;
        n = (int)(d7 - d5 + (double)MathHelper.b(1.5707963267948966) * d5);
        if ((double)n > d2 + d5 + (double)MathHelper.b(1.5707963267948966) * d5) {
            arn_1.b(hb_2.a(l5));
            GL11.glVertex2d((double)(d + d3), (double)n);
            l5 += l4;
            --n;
        }
        n = 90;
        arn_1.b(hb_2.a(l5));
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n * (Math.PI / 180)) * d5), (double)(d2 + d5 + (double)MathHelper.b((double)n * (Math.PI / 180)) * d5));
        l5 += l4;
        n += 3;
        n = (int)(d6 - d5 + (double)MathHelper.h(Math.PI) * d5);
        if ((double)n > d + d5 + (double)MathHelper.sin(0.0f) * (d5 * -1.0) - 1.0) {
            arn_1.b(hb_2.a(l5));
            GL11.glVertex2d((double)n, (double)d2);
            l5 += l4;
            --n;
        }
        GL11.glEnd();
        GL11.glEnable((int)3553);
        if (bl) {
            GL11.glDisable((int)2848);
        }
        GL11.glEnable((int)3553);
        GL11.glPopAttrib();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void a(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        TimerUtil.e();
        if (d3 > d4) {
            d7 = d4;
            d4 = d3;
            d3 = d7;
        }
        GL11.glEnable((int)2848);
        GL11.glBegin((int)6);
        GL11.glVertex2d((double)d, (double)d2);
        d7 = d4;
        if (d7 >= d3) {
            double d8 = MathInvoker.m(d7 * Math.PI / 180.0) * d5;
            double d9 = MathInvoker.i(d7 * Math.PI / 180.0) * d6;
            GL11.glVertex2d((double)(d + d8), (double)(d2 + d9));
            d7 -= 4.0;
        }
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glEnd();
    }

    public static int[] b(eu_0 eu_02) {
        TimerUtil.e();
        double d = MathInvoker.j(SystemInvoker.f() - 15L) / 20.0;
        float f = (double)((float)(d / 360.0)) < 0.5 ? -((float)(d / 360.0)) : (float)((d %= 360.0) / 360.0);
        float[] fArray = aUL.e(eu_02);
        Color color = aol_1.b(f, fArray[1], fArray[2]);
        return new int[]{aol_1.c(color), aol_1.g(color), aol_1.f(color)};
    }

    public static void d(double d, double d2, double d3, double d4, int n) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        arn_1.b(n);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d3, (double)d2);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d, (double)d4);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GlStateManagerInvoker.enableTexture2D();
    }

    public static void b(double d, double d2, double d3, double d4, Color color) {
        double d5 = d3 / 4.0;
        arn_1.a(color);
        GL11.glPushMatrix();
        GlStateManagerInvoker.disableTexture2D();
        GL11.glEnable((int)2881);
        GL11.glPolygonMode((int)1032, (int)6914);
        GL11.glLineWidth((float)2.0f);
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)(d + d5), (double)d2);
        GL11.glVertex2d((double)d, (double)(d2 + d4));
        GL11.glVertex2d((double)(d + d3 - d5), (double)(d2 + d4));
        GL11.glVertex2d((double)(d + d3), (double)d2);
        GL11.glVertex2d((double)(d + d5), (double)d2);
        GL11.glEnd();
        GL11.glDisable((int)2881);
        GlStateManagerInvoker.enableTexture2D();
        GL11.glPopMatrix();
    }

    public static void b(double d, double d2, double d3, double d4, double d5, float f, long l4) {
        GlStateManagerInvoker.enableBlend();
        TimerUtil.e();
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        if (d3 > d4) {
            double d6 = d4;
            d4 = d3;
            d3 = d6;
        }
        GL11.glLineWidth((float)f);
        GL11.glEnable((int)2848);
        GL11.glBegin((int)3);
        int n = 0;
        double d7 = d3;
        if (d7 <= d4) {
            double d8 = MathInvoker.m(d7 * Math.PI / 180.0) * d5;
            double d9 = MathInvoker.i(d7 * Math.PI / 180.0) * d5;
            arn_1.b(hb_2.a((long)n));
            GL11.glVertex2d((double)(d + d8), (double)(d2 + d9));
            n = (int)((long)n - l4);
            d7 += 2.0;
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void a(double d, double d2, double d3, double d4, float f, boolean bl, boolean bl2, int n) {
        TimerUtil.e();
        arn_1.a();
        GL11.glPushMatrix();
        double d5 = MathInvoker.a(d3 - d);
        double d6 = MathInvoker.a(d4 - d2);
        double d7 = d5 / 4.0;
        double d8 = d6 / 4.0;
        if (d5 != 0.0 && d6 != 0.0) {
            if (bl2) {
                GL11.glLineWidth((float)2.5f);
                arn_1.a(Color.BLACK);
                GL11.glBegin((int)3);
                GL11.glVertex2d((double)(d + d7), (double)d2);
                GL11.glVertex2d((double)d, (double)d2);
                GL11.glVertex2d((double)d, (double)(d2 + d8));
                GL11.glEnd();
                GL11.glBegin((int)3);
                GL11.glVertex2d((double)d, (double)(d2 + d6 - d8));
                GL11.glVertex2d((double)d, (double)(d2 + d6));
                GL11.glVertex2d((double)(d + d7), (double)(d2 + d6));
                GL11.glEnd();
                GL11.glBegin((int)3);
                GL11.glVertex2d((double)(d + d5 - d7), (double)(d2 + d6));
                GL11.glVertex2d((double)(d + d5), (double)(d2 + d6));
                GL11.glVertex2d((double)(d + d5), (double)(d2 + d6 - d8));
                GL11.glEnd();
                GL11.glBegin((int)3);
                GL11.glVertex2d((double)(d + d5), (double)(d2 + d8));
                GL11.glVertex2d((double)(d + d5), (double)d2);
                GL11.glVertex2d((double)(d + d5 - d7), (double)d2);
                GL11.glEnd();
            }
            GL11.glLineWidth((float)1.5f);
            GL11.glBegin((int)3);
            arn_1.b(n);
            double d9 = 0.0;
            if (d9 <= d7) {
                GL11.glVertex2d((double)(d + d7 - d9), (double)d2);
                d9 += d7 / 8.0;
            }
            if ((d9 = 0.0) <= d8) {
                GL11.glVertex2d((double)d, (double)(d2 + d9));
                d9 += d8 / 8.0;
            }
            GL11.glEnd();
            GL11.glBegin((int)3);
            arn_1.b(n);
            d9 = 0.0;
            if (d9 <= d8) {
                GL11.glVertex2d((double)d, (double)(d2 + d6 - d8 + d9));
                d9 += d8 / 8.0;
            }
            if ((d9 = 0.0) <= d7) {
                GL11.glVertex2d((double)(d + d9), (double)(d2 + d6));
                d9 += d7 / 8.0;
            }
            GL11.glEnd();
            GL11.glBegin((int)3);
            arn_1.b(n);
            d9 = 0.0;
            if (d9 <= d7) {
                GL11.glVertex2d((double)(d + d5 - d7 + d9), (double)(d2 + d6));
                d9 += d7 / 8.0;
            }
            if ((d9 = 0.0) <= d8) {
                GL11.glVertex2d((double)(d + d5), (double)(d2 + d6 - d9));
                d9 += d8 / 8.0;
            }
            GL11.glEnd();
            GL11.glBegin((int)3);
            arn_1.b(n);
            d9 = 0.0;
            if (d9 <= d8) {
                GL11.glVertex2d((double)(d + d5), (double)(d2 + d8 - d9));
                d9 += d8 / 8.0;
            }
            if ((d9 = 0.0) <= d7) {
                GL11.glVertex2d((double)(d + d5 - d9), (double)d2);
                d9 += d7 / 8.0;
            }
            GL11.glEnd();
        }
        GL11.glLineWidth((float)2.5f);
        d5 = MathInvoker.a(d3 - d);
        d6 = MathInvoker.a(d4 - d2);
        if (bl2) {
            arn_1.a(new Color(-16777216));
            GL11.glBegin((int)3);
            GL11.glVertex2d((double)d, (double)d2);
            GL11.glVertex2d((double)(d + (d3 - d)), (double)d2);
            GL11.glVertex2d((double)(d + (d3 - d)), (double)(d2 + (d4 - d2)));
            GL11.glVertex2d((double)d, (double)(d2 + (d4 - d2)));
            GL11.glVertex2d((double)d, (double)d2);
            GL11.glEnd();
        }
        GL11.glLineWidth((float)1.5f);
        GL11.glBegin((int)3);
        arn_1.b(n);
        if (d6 != 0.0 && d5 != 0.0) {
            d7 = 0.0;
            if (d7 <= d6) {
                GL11.glVertex2d((double)d, (double)(d2 + d7));
                d7 += d6 / 10.0;
            }
            if ((d7 = 0.0) <= d5) {
                GL11.glVertex2d((double)(d + d7), (double)(d2 + d6));
                d7 += d5 / 10.0;
            }
            if ((d7 = 0.0) <= d6) {
                GL11.glVertex2d((double)(d + d5), (double)(d2 + d6 - d7));
                d7 += d6 / 10.0;
            }
            if ((d7 = 0.0) <= d5) {
                GL11.glVertex2d((double)(d + d5 - d7), (double)d2);
                d7 += d5 / 10.0;
            }
        }
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glEnd();
        GL11.glPopMatrix();
        arn_1.h();
    }

    public static void a(float f, float f2, float f3, float f4, float f5, float f6, Color color, boolean bl) {
        arn_1.a();
        GL11.glPushMatrix();
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glDisable((int)3553);
        GL11.glLineWidth((float)1.0f);
        GL11.glBegin((int)7);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glVertex2f((float)f, (float)f4);
        GL11.glVertex2f((float)(f + 1.5f), (float)f4);
        GL11.glVertex2f((float)(f + 1.5f), (float)f2);
        GL11.glVertex2f((float)(f3 - 1.5f), (float)f2);
        GL11.glVertex2f((float)(f3 - 1.5f), (float)f4);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glVertex2f((float)f3, (float)f2);
        GL11.glVertex2f((float)(f + 1.5f), (float)f2);
        GL11.glVertex2f((float)(f + 1.5f), (float)(f2 + 1.5f));
        GL11.glVertex2f((float)(f3 - 1.5f), (float)(f2 + 1.5f));
        GL11.glVertex2f((float)(f3 - 1.5f), (float)f2);
        GL11.glVertex2f((float)(f + 1.5f), (float)(f4 - 1.5f));
        GL11.glVertex2f((float)(f + 1.5f), (float)f4);
        GL11.glVertex2f((float)(f3 - 1.5f), (float)f4);
        GL11.glVertex2f((float)(f3 - 1.5f), (float)(f4 - 1.5f));
        arn_1.a(aol_1.d(aol_1.d(aol_1.d(color))));
        GL11.glVertex2f((float)(f + 0.5f), (float)(f2 + 0.5f));
        GL11.glVertex2f((float)(f + 0.5f), (float)(f4 - 0.5f));
        GL11.glVertex2f((float)(f + 1.0f), (float)(f4 - 0.5f));
        GL11.glVertex2f((float)(f + 1.0f), (float)(f2 + 0.5f));
        GL11.glVertex2f((float)(f3 - 1.0f), (float)(f2 + 0.5f));
        GL11.glVertex2f((float)(f3 - 1.0f), (float)(f4 - 0.5f));
        GL11.glVertex2f((float)(f3 - 0.5f), (float)(f4 - 0.5f));
        GL11.glVertex2f((float)(f3 - 0.5f), (float)(f2 + 0.5f));
        GL11.glVertex2f((float)(f + 0.5f), (float)(f2 + 0.5f));
        GL11.glVertex2f((float)(f + 0.5f), (float)(f2 + 1.0f));
        GL11.glVertex2f((float)(f3 - 0.5f), (float)(f2 + 1.0f));
        GL11.glVertex2f((float)(f3 - 0.5f), (float)(f2 + 0.5f));
        GL11.glVertex2f((float)(f + 0.5f), (float)(f4 - 1.0f));
        GL11.glVertex2f((float)(f + 0.5f), (float)(f4 - 0.5f));
        GL11.glVertex2f((float)(f3 - 0.5f), (float)(f4 - 0.5f));
        GL11.glVertex2f((float)(f3 - 0.5f), (float)(f4 - 1.0f));
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glPopMatrix();
        arn_1.h();
    }

    public static void a(float f, float f2, float f3, float f4, Color color, boolean bl) {
        arn_1.a();
        TimerUtil.e();
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glDisable((int)3553);
        GL11.glLineWidth((float)1.0f);
        GL11.glBegin((int)7);
        if (bl) {
            GL11.glVertex2f((float)f, (float)f2);
            GL11.glVertex2f((float)f, (float)f4);
            GL11.glVertex2f((float)(f + 1.5f), (float)f4);
            GL11.glVertex2f((float)(f + 1.5f), (float)f2);
            GL11.glVertex2f((float)(f3 - 1.5f), (float)f2);
            GL11.glVertex2f((float)(f3 - 1.5f), (float)f4);
            GL11.glVertex2f((float)f3, (float)f4);
            GL11.glVertex2f((float)f3, (float)f2);
            GL11.glVertex2f((float)(f + 1.5f), (float)f2);
            GL11.glVertex2f((float)(f + 1.5f), (float)(f2 + 1.5f));
            GL11.glVertex2f((float)(f3 - 1.5f), (float)(f2 + 1.5f));
            GL11.glVertex2f((float)(f3 - 1.5f), (float)f2);
            GL11.glVertex2f((float)(f + 1.5f), (float)(f4 - 1.5f));
            GL11.glVertex2f((float)(f + 1.5f), (float)f4);
            GL11.glVertex2f((float)(f3 - 1.5f), (float)f4);
            GL11.glVertex2f((float)(f3 - 1.5f), (float)(f4 - 1.5f));
        }
        arn_1.a(color);
        GL11.glVertex2f((float)(f + 0.5f), (float)(f2 + 0.5f));
        GL11.glVertex2f((float)(f + 0.5f), (float)(f4 - 0.5f));
        GL11.glVertex2f((float)(f + 1.0f), (float)(f4 - 0.5f));
        GL11.glVertex2f((float)(f + 1.0f), (float)(f2 + 0.5f));
        GL11.glVertex2f((float)(f3 - 1.0f), (float)(f2 + 0.5f));
        GL11.glVertex2f((float)(f3 - 1.0f), (float)(f4 - 0.5f));
        GL11.glVertex2f((float)(f3 - 0.5f), (float)(f4 - 0.5f));
        GL11.glVertex2f((float)(f3 - 0.5f), (float)(f2 + 0.5f));
        GL11.glVertex2f((float)(f + 0.5f), (float)(f2 + 0.5f));
        GL11.glVertex2f((float)(f + 0.5f), (float)(f2 + 1.0f));
        GL11.glVertex2f((float)(f3 - 0.5f), (float)(f2 + 1.0f));
        GL11.glVertex2f((float)(f3 - 0.5f), (float)(f2 + 0.5f));
        GL11.glVertex2f((float)(f + 0.5f), (float)(f4 - 1.0f));
        GL11.glVertex2f((float)(f + 0.5f), (float)(f4 - 0.5f));
        GL11.glVertex2f((float)(f3 - 0.5f), (float)(f4 - 0.5f));
        GL11.glVertex2f((float)(f3 - 0.5f), (float)(f4 - 1.0f));
        GL11.glEnd();
        GL11.glEnable((int)3553);
        arn_1.h();
    }

    public static void a(int n) {
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public static void a(double d, double d2, double d3, double d4, double d5, double d6, int n) {
        GlStateManagerInvoker.b(0.0f, 0.0f, 0.0f);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        arn_1.a(n);
        arn_1.a(d, d2, d3, d4, d5, d6);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void a(float f, float f2, float f3, float f4, float f5, int n) {
        arn_1.a((double)f, (double)f2, (double)f3, (double)f4, (double)f5, 1.0f, n, 0);
    }

    public static void a(double d, double d2, double d3, double d4, int n) {
        double d5;
        TimerUtil.e();
        if (d < d3) {
            d5 = d;
            d = d3;
            d3 = d5;
        }
        if (d2 < d4) {
            d5 = d2;
            d2 = d4;
            d4 = d5;
        }
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        WorldRendererInvoker.g(worldRenderer);
        WorldRendererInvoker.endVertex(worldRenderer, d, d4, 0.0);
        WorldRendererInvoker.endVertex(worldRenderer, d3, d4, 0.0);
        WorldRendererInvoker.endVertex(worldRenderer, d3, d2, 0.0);
        WorldRendererInvoker.endVertex(worldRenderer, d, d2, 0.0);
        TessellatorInvoker.draw(tessellator);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void b(double d, double d2, int n) {
        arn_1.d(d, d2, d + (double)(n * 2) + 0.5, d2 + (double)(n * 2) + 0.5, hb_2.a(asx_1.WHITE));
        arn_1.d(d, d2, d + (double)n, d2 + (double)n, hb_2.a(242, 80, 35));
        arn_1.d(d + (double)n + 0.5, d2, d + (double)(n * 2) + 0.5, d2 + (double)n, hb_2.a(124, 187, 0));
        arn_1.d(d, d2 + (double)n + 0.5, d + (double)n, d2 + (double)(n * 2) + 0.5, hb_2.a(1, 163, 240));
        arn_1.d(d + (double)n + 0.5, d2 + (double)n + 0.5, d + (double)(n * 2) + 0.5, d2 + (double)(n * 2) + 0.5, hb_2.a(255, 184, 2));
    }

    public static void b(Entity entity, int n) {
        float f = arn_1.l.timer.renderPartialTicks;
        TimerUtil.e();
        EntityLivingBase entityLivingBase = (EntityLivingBase)entity;
        if (MCInvoker.j(l) == null || entityLivingBase == null) {
            return;
        }
        double d = entityLivingBase.prevPosX + (entityLivingBase.posX - entityLivingBase.prevPosX) * (double)f - MCInvoker.j((Minecraft)arn_1.l).s;
        double d2 = entityLivingBase.prevPosY + (entityLivingBase.posY - entityLivingBase.prevPosY) * (double)f + MathInvoker.i((double)SystemInvoker.f() / 200.0) + 1.0 - MCInvoker.j((Minecraft)arn_1.l).h;
        double d3 = entityLivingBase.prevPosZ + (entityLivingBase.posZ - entityLivingBase.prevPosZ) * (double)f - MCInvoker.j((Minecraft)arn_1.l).m;
        GL11.glPushMatrix();
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glEnable((int)2832);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glHint((int)3154, (int)4354);
        GL11.glHint((int)3155, (int)4354);
        GL11.glHint((int)3153, (int)4354);
        GL11.glDepthMask((boolean)false);
        GlStateManagerInvoker.alphaFunc(516, 0.0f);
        GL11.glShadeModel((int)7425);
        GlStateManagerInvoker.A();
        GL11.glBegin((int)5);
        float f2 = 0.0f;
        double d4 = (double)f2 - 6.4795348480289485;
        int cfr_ignored_2 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
        double d5 = d + 0.67 * MathInvoker.m(f2);
        double d6 = d3 + 0.67 * MathInvoker.i(f2);
        arn_1.b(hb_2.a(n, 82));
        GL11.glVertex3d((double)d5, (double)d2, (double)d6);
        f2 = (float)((double)f2 + 0.19634954084936207);
        f2 = 0.0f;
        double d7 = (double)f2 - 6.4795348480289485;
        int cfr_ignored_3 = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        d5 = d + 0.67 * MathInvoker.m(f2);
        d6 = d3 + 0.67 * MathInvoker.i(f2);
        arn_1.b(hb_2.a(n, 82));
        GL11.glVertex3d((double)d5, (double)d2, (double)d6);
        arn_1.b(hb_2.a(n, 0));
        GL11.glVertex3d((double)d5, (double)(d2 - MathInvoker.m((double)SystemInvoker.f() / 200.0) / 2.0), (double)d6);
        f2 = (float)((double)f2 + 0.19634954084936207);
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        GlStateManagerInvoker.b();
        GL11.glDisable((int)2848);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)2832);
        GL11.glEnable((int)3553);
        GL11.glPopMatrix();
        arn_1.a(Color.WHITE);
    }

    public static void b(double d, double d2, double d3, double d4, double d5, int n) {
        arn_1.a();
        GL11.glPushMatrix();
        GL11.glLineWidth((float)((float)d5));
        arn_1.a(new Color(n));
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d, (double)(d2 + (d4 - d2)));
        GL11.glVertex2d((double)(d + (d3 - d)), (double)(d2 + (d4 - d2)));
        GL11.glVertex2d((double)(d + (d3 - d)), (double)d2);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glEnd();
        GL11.glPopMatrix();
        arn_1.h();
    }

    @NotNull
    public static Color a(@NotNull Color color, @NotNull Color color2, double d) {
        float f = (float)d;
        float f2 = 1.0f - f;
        float[] fArray = new float[3];
        float[] fArray2 = new float[3];
        aol_1.a(color, fArray);
        aol_1.a(color2, fArray2);
        return new Color(fArray[0] * f + fArray2[0] * f2, fArray[1] * f + fArray2[1] * f2, fArray[2] * f + fArray2[2] * f2);
    }

    public static void a(double d, double d2, double d3, double d4, double d5, float f, int[] nArray, long l4) {
        double d6 = d + d3;
        double d7 = d2 + d4;
        GL11.glPushAttrib((int)0);
        GL11.glDisable((int)3553);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        TimerUtil.e();
        GlStateManagerInvoker.enableBlend();
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)3);
        HUD cfr_ignored_0 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        long l5 = 0L;
        int n = 0;
        arn_1.b(hb_2.a(nArray[0], nArray[1], l5));
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n * (Math.PI / 180)) * (d5 * -1.0)), (double)(d2 + d5 + (double)MathHelper.b((double)n * (Math.PI / 180)) * (d5 * -1.0)));
        l5 -= l4;
        n += 3;
        n = (int)(d2 + d5 + (double)MathHelper.b(1.5707963267948966) * (d5 * -1.0)) + 1;
        if ((double)n < d7 - d5 + (double)MathHelper.b(1.5707963267948966) * (d5 * -1.0)) {
            arn_1.b(hb_2.a(nArray[0], nArray[1], l5));
            GL11.glVertex2d((double)d, (double)n);
            l5 -= l4;
            ++n;
        }
        n = 90;
        arn_1.b(hb_2.a(nArray[0], nArray[1], l5));
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n * (Math.PI / 180)) * (d5 * -1.0)), (double)(d7 - d5 + (double)MathHelper.b((double)n * (Math.PI / 180)) * (d5 * -1.0)));
        l5 -= l4;
        n += 3;
        n = (int)(d + d5 + (double)MathHelper.h(Math.PI) * (d5 * -1.0)) + 1;
        if ((double)n < d6 - d5 + (double)MathHelper.h(0.0) * d5) {
            arn_1.b(hb_2.a(nArray[0], nArray[1], l5));
            GL11.glVertex2d((double)n, (double)d7);
            l5 -= l4;
            ++n;
        }
        n = 0;
        arn_1.b(hb_2.a(nArray[0], nArray[1], l5));
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n * (Math.PI / 180)) * d5), (double)(d7 - d5 + (double)MathHelper.b((double)n * (Math.PI / 180)) * d5));
        l5 += l4;
        n += 3;
        n = (int)(d7 - d5 + (double)MathHelper.b(1.5707963267948966) * d5);
        if ((double)n > d2 + d5 + (double)MathHelper.b(1.5707963267948966) * d5) {
            arn_1.b(hb_2.a(nArray[0], nArray[1], l5));
            GL11.glVertex2d((double)(d + d3), (double)n);
            l5 += l4;
            --n;
        }
        n = 90;
        arn_1.b(hb_2.a(nArray[0], nArray[1], l5));
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n * (Math.PI / 180)) * d5), (double)(d2 + d5 + (double)MathHelper.b((double)n * (Math.PI / 180)) * d5));
        l5 += l4;
        n += 3;
        n = (int)(d6 - d5 + (double)MathHelper.h(Math.PI) * d5);
        if ((double)n > d + d5 + (double)MathHelper.sin(0.0f) * (d5 * -1.0) - 1.0) {
            arn_1.b(hb_2.a(nArray[0], nArray[1], l5));
            GL11.glVertex2d((double)n, (double)d2);
            l5 += l4;
            --n;
        }
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glPopAttrib();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void a(double d, double d2, double d3, float f, int n, long l4) {
        GL11.glPushMatrix();
        TimerUtil.e();
        GlStateManagerInvoker.enableBlend();
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)3);
        int n2 = 0;
        int n3 = 0;
        if (n3 <= n) {
            arn_1.b(hb_2.a((long)n2));
            GL11.glVertex2d((double)(d - MathInvoker.i((double)n3 * Math.PI / 180.0) * d3), (double)(d2 + MathInvoker.m((double)n3 * Math.PI / 180.0) * d3));
            n2 = (int)((long)n2 - l4);
            ++n3;
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GlStateManagerInvoker.disableBlend();
        GL11.glPopMatrix();
    }

    public static void b(BlockPos blockPos, int n) {
        Minecraft minecraft = MCInvoker.f();
        double d = (double)amv_2.j(blockPos) - MCInvoker.j((Minecraft)minecraft).s + 0.5;
        double d2 = (double)amv_2.h(blockPos) - MCInvoker.j((Minecraft)minecraft).h + 0.5;
        double d3 = (double)amv_2.i(blockPos) - MCInvoker.j((Minecraft)minecraft).m + 0.5;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.0f);
        float cfr_ignored_0 = (float)(minecraft.player.posX - (double)amv_2.j(blockPos));
        float cfr_ignored_1 = (float)(minecraft.player.posY - (double)amv_2.h(blockPos));
        float f = (float)(n >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n & 0xFF) / 255.0f;
        float f4 = (float)(n >> 24 & 0xFF) / 255.0f;
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        GL11.glLoadIdentity();
        boolean bl = minecraft.gameSettings.aR;
        minecraft.gameSettings.aR = false;
        EntityRendererInvoker.c(minecraft.entityRenderer, minecraft.timer.renderPartialTicks);
        GL11.glBegin((int)3);
        GL11.glVertex3d((double)0.0, (double)PlayerInvoker.X(minecraft.player), (double)0.0);
        GL11.glVertex3d((double)d, (double)d2, (double)d3);
        GL11.glVertex3d((double)d, (double)d2, (double)d3);
        GL11.glEnd();
        minecraft.gameSettings.aR = bl;
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void a(double d, double d2, double d3, double d4, double d5, float f, int n, int n2, l9 l92, int n3, int n4) {
        TimerUtil.e();
        adp_0.b(false);
        arn_1.c(d, d2, d3, d4, d5, hb_2.a(asx_1.BLACK));
        adp_0.a(false);
        agg_2.a(l92, n3, (int)(1.5686274509803921 * (double)n4), true, () -> arn_1.lambda$drawGlowingOutlineRect$0(d, d2, d3, d4, d5, n2), null);
        adp_0.a();
        arn_1.a(d, d2, d3, d4, d5, f, n, (long)n2, true);
    }

    public static void c(float f, float f2, float f3, float f4, int n) {
        GlStateManagerInvoker.disableTexture2D();
        GL11.glLineWidth((float)1.0f);
        arn_1.b(n);
        GL11.glBegin((int)7);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glVertex2f((float)f, (float)(f2 + (f4 - f2)));
        GL11.glVertex2f((float)(f + (f3 - f)), (float)(f2 + (f4 - f2)));
        GL11.glVertex2f((float)(f + (f3 - f)), (float)f2);
        GL11.glEnd();
        GlStateManagerInvoker.enableTexture2D();
    }

    public static Vector3d a(int n, double d, double d2, double d3) {
        if (afs_2.a((float)d, (float)d2, (float)d3, fz_0.e, fz_0.j, fz_0.d, fz_0.b)) {
            return new Vector3d((double)(aHB.b(fz_0.b, 0) / (float)n), (double)(((float)DisplayInvoker.getHeight() - aHB.b(fz_0.b, 1)) / (float)n), (double)aHB.b(fz_0.b, 2));
        }
        return null;
    }

    public static void b(float f, float f2, float f3, float f4, int n) {
        GL11.glPushMatrix();
        TimerUtil.e();
        f *= 2.0f;
        f2 *= 2.0f;
        float f5 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n & 0xFF) / 255.0f;
        float f9 = 6.283185f / f4;
        float f10 = MathHelper.cos(f9);
        float f11 = MathHelper.sin(f9);
        float f12 = f3 * 2.0f;
        float f13 = 0.0f;
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        GL11.glColor4f((float)f6, (float)f7, (float)f8, (float)f5);
        GL11.glBegin((int)2);
        int n2 = 0;
        if ((float)n2 < f4) {
            GL11.glVertex2f((float)(f12 + f), (float)(f13 + f2));
            float f14 = f12;
            f12 = f10 * f12 - f11 * f13;
            f13 = f11 * f14 + f10 * f13;
            ++n2;
        }
        GL11.glEnd();
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        arn_1.f();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPopMatrix();
    }

    public static void a(ResourceLocation resourceLocation, int n, int n2, int n3, int n4) {
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        GL11.glDepthMask((boolean)false);
        OpenGlHelper.c(770, 771, 1, 0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(l), resourceLocation);
        wh_1.a(n, n2, 0.0f, 0.0f, n3, n4, n3, n4);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2929);
    }

    public static void a(Entity entity, double[] dArray, double d, double d2, double d3) {
        TimerUtil.e();
        GL11.glEnable((int)2848);
        if (dArray.length >= 4) {
            if (dArray[3] <= 0.1) {
                return;
            }
            GL11.glColor4d((double)dArray[0], (double)dArray[1], (double)dArray[2], (double)dArray[3]);
        }
        GL11.glColor3d((double)dArray[0], (double)dArray[1], (double)dArray[2]);
        GL11.glLineWidth((float)1.5f);
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)0.0, (double)PlayerInvoker.X(arn_1.l.player), (double)0.0);
        GL11.glVertex3d((double)d, (double)d2, (double)d3);
        GL11.glEnd();
        GL11.glDisable((int)2848);
    }

    public static void a(FontRenderer fontRenderer, String string, double d, double d2) {
        int n = 0;
        TimerUtil.e();
        char[] cArray = StringInvoker.f(string);
        int n2 = cArray.length;
        int n3 = 0;
        if (n3 < n2) {
            char c = cArray[n3];
            a7l_0.b(fontRenderer, StringInvoker.a(c), d, d2, hb_2.a((long)n), true);
            d += a7l_0.a(fontRenderer, c);
            n -= 120;
            ++n3;
        }
    }

    public static boolean c(rm_2 rm_22) {
        Entity entity = MCInvoker.v(MCInvoker.f());
        ahz_1.a(h, entity.posX, entity.posY, entity.posZ);
        return ahz_1.a(h, rm_22);
    }

    public static void a(double d, double d2, int n, int n2, double d3) {
        arn_1.a();
        GL11.glPushMatrix();
        GL11.glLineWidth((float)n);
        arn_1.a(new Color(n2));
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)(d + 3.0), (double)(d2 + d3));
        GL11.glVertex2d((double)(d + 6.0), (double)d2);
        GL11.glEnd();
        GL11.glPopMatrix();
        arn_1.h();
    }

    public static void b(int n) {
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public static void a(float f, float f2, float f3, float f4, float f5, Color color) {
        aV3.a(aV3.a(), (double)f, (double)(f2 + 2.0f), (double)f3, (double)(f4 - 4.0f), (double)(f5 * 2.0f), 4.0, color, true);
    }

    public static void h() {
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void d(double d, double d2, double d3, int n) {
        arn_1.a(d, d2, 0.0, 360.0, d3 - 1.0, n);
    }

    public static void a(double d, double d2, double d3, double d4, double d5, Color color) {
        double d6 = MathInvoker.a(d3 - d);
        double d7 = MathInvoker.a(d4 - d2);
        double d8 = d6 / 4.0;
        double d9 = d7 / 4.0;
        arn_1.a();
        GL11.glPushMatrix();
        GL11.glLineWidth((float)((float)d5));
        arn_1.a(color);
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)(d + d8), (double)d2);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d, (double)(d2 + d9));
        GL11.glEnd();
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)d, (double)(d2 + d7 - d9));
        GL11.glVertex2d((double)d, (double)(d2 + d7));
        GL11.glVertex2d((double)(d + d8), (double)(d2 + d7));
        GL11.glEnd();
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)(d + d6 - d8), (double)(d2 + d7));
        GL11.glVertex2d((double)(d + d6), (double)(d2 + d7));
        GL11.glVertex2d((double)(d + d6), (double)(d2 + d7 - d9));
        GL11.glEnd();
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)(d + d6), (double)(d2 + d9));
        GL11.glVertex2d((double)(d + d6), (double)d2);
        GL11.glVertex2d((double)(d + d6 - d8), (double)d2);
        GL11.glEnd();
        GL11.glPopMatrix();
        arn_1.h();
    }

    private static void lambda$drawGlowingOutlineRect$0(double d, double d2, double d3, double d4, double d5, int n) {
        arn_1.a(d + 4.0, d2 + 4.0, d3 - 8.0, d4 - 8.0, d5, 32.0f, hb_2.a(asx_1.BLACK), (long)n, false);
    }

    public static void a(double d, double d2, int n) {
        arn_1.d(d, d2, d + (double)n, d2 + (double)n, hb_2.a(242, 80, 35));
        arn_1.d(d + (double)n + 2.0, d2, d + (double)(n * 2) + 2.0, d2 + (double)n, hb_2.a(124, 187, 0));
        arn_1.d(d, d2 + (double)n + 2.0, d + (double)n, d2 + (double)(n * 2) + 2.0, hb_2.a(1, 163, 240));
        arn_1.d(d + (double)n + 2.0, d2 + (double)n + 2.0, d + (double)(n * 2) + 2.0, d2 + (double)(n * 2) + 2.0, hb_2.a(255, 184, 2));
    }

    public static void a(double d, double d2, double d3, double d4, int n, int n2) {
        double d5 = d + d3;
        double d6 = d2 + d4;
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)7);
        arn_1.a(n);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d, (double)d6);
        arn_1.a(n2);
        GL11.glVertex2d((double)d5, (double)d6);
        GL11.glVertex2d((double)d5, (double)d2);
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
    }

    public static void a(double d, double d2, double d3, double d4, Color color, double d5) {
        arn_1.a(color);
        GL11.glPushMatrix();
        GlStateManagerInvoker.disableTexture2D();
        GL11.glEnable((int)2881);
        GL11.glPolygonMode((int)1032, (int)6914);
        GL11.glBegin((int)9);
        GL11.glVertex2d((double)(d + d5), (double)d2);
        GL11.glVertex2d((double)d, (double)(d2 + d4));
        GL11.glVertex2d((double)(d + d3 - d5), (double)(d2 + d4));
        GL11.glVertex2d((double)(d + d3), (double)d2);
        GL11.glEnd();
        GL11.glDisable((int)2881);
        GlStateManagerInvoker.enableTexture2D();
        GL11.glPopMatrix();
    }

    public static void a(double d, double d2, double d3, double d4, double d5, float f, long l4) {
        TimerUtil.e();
        double d6 = d + d3;
        double d7 = d2 + d4;
        GL11.glPushAttrib((int)0);
        GL11.glDisable((int)3553);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManagerInvoker.enableBlend();
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)3);
        HUD cfr_ignored_0 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        long l5 = 0L;
        int n = 0;
        arn_1.b(hb_2.a(l5));
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n * (Math.PI / 180)) * (d5 * -1.0)), (double)(d2 + d5 + (double)MathHelper.b((double)n * (Math.PI / 180)) * (d5 * -1.0)));
        l5 -= l4;
        n += 3;
        n = (int)(d2 + d5 + (double)MathHelper.b(1.5707963267948966) * (d5 * -1.0)) + 1;
        if ((double)n < d7 - d5 + (double)MathHelper.b(1.5707963267948966) * (d5 * -1.0)) {
            arn_1.b(hb_2.a(l5));
            GL11.glVertex2d((double)d, (double)n);
            l5 -= l4;
            ++n;
        }
        n = 90;
        arn_1.b(hb_2.a(l5));
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n * (Math.PI / 180)) * (d5 * -1.0)), (double)(d7 - d5 + (double)MathHelper.b((double)n * (Math.PI / 180)) * (d5 * -1.0)));
        l5 -= l4;
        n += 3;
        n = (int)(d + d5 + (double)MathHelper.h(Math.PI) * (d5 * -1.0)) + 1;
        if ((double)n < d6 - d5 + (double)MathHelper.h(0.0) * d5) {
            arn_1.b(hb_2.a(l5));
            GL11.glVertex2d((double)n, (double)d7);
            l5 -= l4;
            ++n;
        }
        n = 0;
        arn_1.b(hb_2.a(l5));
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n * (Math.PI / 180)) * d5), (double)(d7 - d5 + (double)MathHelper.b((double)n * (Math.PI / 180)) * d5));
        l5 += l4;
        n += 3;
        n = (int)(d7 - d5 + (double)MathHelper.b(1.5707963267948966) * d5);
        if ((double)n > d2 + d5 + (double)MathHelper.b(1.5707963267948966) * d5) {
            arn_1.b(hb_2.a(l5));
            GL11.glVertex2d((double)(d + d3), (double)n);
            l5 += l4;
            --n;
        }
        n = 90;
        arn_1.b(hb_2.a(l5));
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n * (Math.PI / 180)) * d5), (double)(d2 + d5 + (double)MathHelper.b((double)n * (Math.PI / 180)) * d5));
        l5 += l4;
        n += 3;
        n = (int)(d6 - d5 + (double)MathHelper.h(Math.PI) * d5);
        if ((double)n > d + d5 + (double)MathHelper.sin(0.0f) * (d5 * -1.0) - 1.0) {
            arn_1.b(hb_2.a(l5));
            GL11.glVertex2d((double)n, (double)d2);
            l5 += l4;
            --n;
        }
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glPopAttrib();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void f() {
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glHint((int)3155, (int)4352);
    }

    public static void a(double d, double d2, float f, float f2, double[] dArray) {
        float f3 = 2.0f;
        aV3.a(aV3.a(), d, d2, (double)f, (double)f, (double)(f / 4.0f), (double)f3, new Color(242, 80, 34), dArray, true);
        aV3.a(aV3.a(), d + (double)f + (double)f2, d2, (double)f, (double)f, (double)(f / 4.0f), (double)f3, new Color(127, 186, 0), dArray, true);
        aV3.a(aV3.a(), d, d2 + (double)f + (double)f2, (double)f, (double)f, (double)(f / 4.0f), (double)f3, new Color(0, 164, 239), dArray, true);
        aV3.a(aV3.a(), d + (double)f + (double)f2, d2 + (double)f + (double)f2, (double)f, (double)f, (double)(f / 4.0f), (double)f3, new Color(255, 185, 0), dArray, true);
    }

    public static void i() {
        GL11.glEnable((int)3042);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        EntityRendererInvoker.a(arn_1.l.entityRenderer, arn_1.l.timer.renderPartialTicks, 0);
    }

    public static void a(double d, double d2, int n, int n2) {
        arn_1.a();
        GL11.glPushMatrix();
        GL11.glLineWidth((float)n);
        arn_1.a(new Color(n2));
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)(d + 2.0), (double)(d2 + 3.0));
        GL11.glVertex2d((double)(d + 6.0), (double)(d2 - 2.0));
        GL11.glEnd();
        GL11.glPopMatrix();
        arn_1.h();
    }

    public static void a(Color color) {
        float f = (float)(aol_1.b(color) >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(aol_1.b(color) >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(aol_1.b(color) >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(aol_1.b(color) & 0xFF) / 255.0f;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public static int a(@NotNull EntityLivingBase entityLivingBase) {
        float f = atn_0.c(entityLivingBase);
        float f2 = atn_0.y(entityLivingBase);
        float f3 = MathInvoker.b(0.0f, MathInvoker.a(f, f2) / f2);
        return aol_1.a(f3 / 3.5f, 1.0f, 0.9f) | 0xFF000000;
    }

    public static void a(float f, float f2, float f3, int n, double d) {
        float f4 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f5 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f6 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f7 = (float)(n & 0xFF) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        TimerUtil.e();
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)f5, (float)f6, (float)f7, (float)f4);
        GL11.glBegin((int)9);
        int n2 = 180;
        GL11.glVertex2d((double)((double)f - d - MathInvoker.i(MathInvoker.o(n2)) * (double)f3), (double)((double)f2 + MathInvoker.m(MathInvoker.o(n2)) * (double)f3));
        --n2;
        n2 = 360;
        GL11.glVertex2d((double)((double)f + d - MathInvoker.i(MathInvoker.o(n2)) * (double)f3), (double)((double)f2 + MathInvoker.m(MathInvoker.o(n2)) * (double)f3));
        --n2;
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void c(double d, double d2, double d3, double d4, int n) {
        double d5 = d + d3;
        double d6 = d2 + d4;
        GlStateManagerInvoker.disableTexture2D();
        GL11.glLineWidth((float)1.0f);
        arn_1.b(n);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d, (double)(d2 + (d6 - d2)));
        GL11.glVertex2d((double)(d + (d5 - d)), (double)(d2 + (d6 - d2)));
        GL11.glVertex2d((double)(d + (d5 - d)), (double)d2);
        GL11.glEnd();
        GlStateManagerInvoker.enableTexture2D();
    }

    public static double a(double d, double d2, double d3) {
        return d2 + (d - d2) * d3;
    }

    public static void a(double d, double d2, double d3, double d4, float f, boolean bl, boolean bl2) {
        TimerUtil.e();
        arn_1.a();
        GL11.glPushMatrix();
        double d5 = MathInvoker.a(d3 - d);
        double d6 = MathInvoker.a(d4 - d2);
        double d7 = d5 / 4.0;
        double d8 = d6 / 4.0;
        int n = 0;
        if (d5 != 0.0 && d6 != 0.0) {
            if (bl2) {
                GL11.glLineWidth((float)2.5f);
                arn_1.a(Color.BLACK);
                GL11.glBegin((int)3);
                GL11.glVertex2d((double)(d + d7), (double)d2);
                GL11.glVertex2d((double)d, (double)d2);
                GL11.glVertex2d((double)d, (double)(d2 + d8));
                GL11.glEnd();
                GL11.glBegin((int)3);
                GL11.glVertex2d((double)d, (double)(d2 + d6 - d8));
                GL11.glVertex2d((double)d, (double)(d2 + d6));
                GL11.glVertex2d((double)(d + d7), (double)(d2 + d6));
                GL11.glEnd();
                GL11.glBegin((int)3);
                GL11.glVertex2d((double)(d + d5 - d7), (double)(d2 + d6));
                GL11.glVertex2d((double)(d + d5), (double)(d2 + d6));
                GL11.glVertex2d((double)(d + d5), (double)(d2 + d6 - d8));
                GL11.glEnd();
                GL11.glBegin((int)3);
                GL11.glVertex2d((double)(d + d5), (double)(d2 + d8));
                GL11.glVertex2d((double)(d + d5), (double)d2);
                GL11.glVertex2d((double)(d + d5 - d7), (double)d2);
                GL11.glEnd();
            }
            GL11.glLineWidth((float)1.5f);
            GL11.glBegin((int)3);
            double d9 = 0.0;
            if (d9 <= d7) {
                arn_1.a(new Color(hb_2.a((long)n)));
                GL11.glVertex2d((double)(d + d7 - d9), (double)d2);
                n -= 120;
                d9 += d7 / 8.0;
            }
            if ((d9 = 0.0) <= d8) {
                arn_1.a(new Color(hb_2.a((long)n)));
                GL11.glVertex2d((double)d, (double)(d2 + d9));
                n -= 120;
                d9 += d8 / 8.0;
            }
            GL11.glEnd();
            GL11.glBegin((int)3);
            d9 = 0.0;
            if (d9 <= d8) {
                arn_1.a(new Color(hb_2.a((long)n)));
                GL11.glVertex2d((double)d, (double)(d2 + d6 - d8 + d9));
                n -= 120;
                d9 += d8 / 8.0;
            }
            if ((d9 = 0.0) <= d7) {
                arn_1.a(new Color(hb_2.a((long)n)));
                GL11.glVertex2d((double)(d + d9), (double)(d2 + d6));
                n -= 120;
                d9 += d7 / 8.0;
            }
            GL11.glEnd();
            GL11.glBegin((int)3);
            d9 = 0.0;
            if (d9 <= d7) {
                arn_1.a(new Color(hb_2.a((long)n)));
                GL11.glVertex2d((double)(d + d5 - d7 + d9), (double)(d2 + d6));
                n -= 240;
                d9 += d7 / 8.0;
            }
            if ((d9 = 0.0) <= d8) {
                arn_1.a(new Color(hb_2.a((long)n)));
                GL11.glVertex2d((double)(d + d5), (double)(d2 + d6 - d9));
                n -= 240;
                d9 += d8 / 8.0;
            }
            GL11.glEnd();
            GL11.glBegin((int)3);
            d9 = 0.0;
            if (d9 <= d8) {
                arn_1.a(new Color(hb_2.a((long)n)));
                GL11.glVertex2d((double)(d + d5), (double)(d2 + d8 - d9));
                n -= 240;
                d9 += d8 / 8.0;
            }
            if ((d9 = 0.0) <= d7) {
                arn_1.a(new Color(hb_2.a((long)n)));
                GL11.glVertex2d((double)(d + d5 - d9), (double)d2);
                n -= 240;
                d9 += d7 / 8.0;
            }
            GL11.glEnd();
        }
        GL11.glLineWidth((float)2.5f);
        d5 = MathInvoker.a(d3 - d);
        d6 = MathInvoker.a(d4 - d2);
        if (bl2) {
            arn_1.a(new Color(-16777216));
            GL11.glBegin((int)3);
            GL11.glVertex2d((double)d, (double)d2);
            GL11.glVertex2d((double)(d + (d3 - d)), (double)d2);
            GL11.glVertex2d((double)(d + (d3 - d)), (double)(d2 + (d4 - d2)));
            GL11.glVertex2d((double)d, (double)(d2 + (d4 - d2)));
            GL11.glVertex2d((double)d, (double)d2);
            GL11.glEnd();
        }
        GL11.glLineWidth((float)1.5f);
        GL11.glBegin((int)3);
        int n2 = 0;
        if (d6 != 0.0 && d5 != 0.0) {
            double d10 = 0.0;
            if (d10 <= d6) {
                arn_1.b(hb_2.a((long)n2));
                GL11.glVertex2d((double)d, (double)(d2 + d10));
                n2 -= 240;
                d10 += d6 / 10.0;
            }
            if ((d10 = 0.0) <= d5) {
                arn_1.a(new Color(hb_2.a((long)n2)));
                GL11.glVertex2d((double)(d + d10), (double)(d2 + d6));
                n2 -= 240;
                d10 += d5 / 10.0;
            }
            if ((d10 = 0.0) <= d6) {
                arn_1.a(new Color(hb_2.a((long)n2)));
                GL11.glVertex2d((double)(d + d5), (double)(d2 + d6 - d10));
                n2 += 240;
                d10 += d6 / 10.0;
            }
            if ((d10 = 0.0) <= d5) {
                arn_1.a(new Color(hb_2.a((long)n2)));
                GL11.glVertex2d((double)(d + d5 - d10), (double)d2);
                n2 += 240;
                d10 += d5 / 10.0;
            }
        }
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glEnd();
        GL11.glPopMatrix();
        arn_1.h();
    }

    public static void a(ItemStack itemStack, double d, double d2, double d3) {
        TimerUtil.e();
        GL11.glPushMatrix();
        GlStateManagerInvoker.disableLighting();
        if (arn_1.l.world != null) {
            ne_0.f();
        }
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.clear(256);
        MCInvoker.A((Minecraft)arn_1.l).e = -150.0f;
        DU.a(MCInvoker.A(l), itemStack, (float)d, (float)d2, d3);
        MCInvoker.A((Minecraft)arn_1.l).e = 0.0f;
        GlStateManagerInvoker.enableBlend();
        float f = 0.5f;
        GlStateManagerInvoker.c(f, f, f);
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.c(2.0f, 2.0f, 2.0f);
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.popMatrix();
        GL11.glPopMatrix();
    }

    public static void a(double d, double d2, double d3, double d4, double d5, float f, int n, long l4, boolean bl) {
        double d6 = d + d3;
        double d7 = d2 + d4;
        GL11.glPushAttrib((int)0);
        GL11.glDisable((int)3553);
        TimerUtil.e();
        arn_1.b(n);
        GlStateManagerInvoker.enableBlend();
        GL11.glEnable((int)2848);
        GL11.glBegin((int)9);
        int n2 = 0;
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * (d5 * -1.0)), (double)(d2 + d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * (d5 * -1.0)));
        ++n2;
        n2 = 90;
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * (d5 * -1.0)), (double)(d7 - d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * (d5 * -1.0)));
        ++n2;
        n2 = 0;
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * d5), (double)(d7 - d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * d5));
        ++n2;
        n2 = 90;
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * d5), (double)(d2 + d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * d5));
        ++n2;
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glPopAttrib();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        arn_1.a(d, d2, d3, d4, d5, f, l4, bl);
    }

    public static void c(double d, double d2, double d3, int n) {
        arn_1.d(d - d3 / 2.0, d2 - d3 / 2.0, d + d3 / 2.0, d2 + d3 / 2.0, n);
    }

    public static void a(int n, int n2, float f, EntityLivingBase entityLivingBase) {
        GlStateManagerInvoker.enableColorMaterial();
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.b(255.0f, 255.0f, 255.0f);
        GlStateManagerInvoker.translate(n, n2, 50.0f);
        GlStateManagerInvoker.c(-f, f, f);
        GlStateManagerInvoker.b(180.0f, 0.0f, 0.0f, 1.0f);
        GlStateManagerInvoker.b(135.0f, 0.0f, 1.0f, 0.0f);
        ne_0.a();
        GlStateManagerInvoker.b(-135.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.translate(0.0f, 0.0f, 0.0f);
        RenderManager renderManager = MCInvoker.j(MCInvoker.f());
        FT.a(renderManager, 1.0f);
        FT.b(renderManager, false);
        FT.a(renderManager, entityLivingBase, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        FT.b(renderManager, true);
        GlStateManagerInvoker.popMatrix();
        ne_0.e();
        GlStateManagerInvoker.y();
        aoj_0.a(apl_1.ab);
        GlStateManagerInvoker.disableTexture2D();
        aoj_0.a(apl_1.S);
    }

    public static void a(double d, double d2, int n, NetworkPlayerInfo networkPlayerInfo) {
        int n2 = aNL.b(networkPlayerInfo);
        int n3 = hb_2.a(asx_1.BLACK);
        arn_1.d(d, d2, d + 1.0, d2 - 1.0, n3);
        arn_1.d(d + 2.0, d2, d + 3.0, d2 - 2.0, n3);
        TimerUtil.e();
        arn_1.d(d + 4.0, d2, d + 5.0, d2 - 3.0, n3);
        arn_1.d(d + 6.0, d2, d + 7.0, d2 - 4.0, n3);
        arn_1.d(d + 8.0, d2, d + 9.0, d2 - 5.0, n3);
        double d3 = MathInvoker.a(350.0 / (double)MathInvoker.max(1, n2), 5.0);
        double d4 = d;
        double d5 = d2;
        int n4 = 0;
        if ((double)n4 < d3) {
            arn_1.d(d4, d2, d4 + 1.0, d5 - 1.0, n);
            d5 -= 1.0;
            d4 += 2.0;
            ++n4;
        }
    }

    public static void g() {
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2929);
        GlStateManagerInvoker.disableBlend();
    }

    static {
        l = MCInvoker.f();
        c = 0.0;
        e = 0.0;
        b = new char[]{'a', '1', 'c', '3', 'e', '5', 'g', '7'};
        k = 0.0;
        g = 0.0;
        i = 150;
        d = 0.0f;
        h = new aV1();
        j = new ResourceLocation(aQZ.c);
    }

    public static void d(@NotNull rm_2 rm_22) {
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(TessellatorInvoker.getInstance());
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRendererInvoker.g(worldRenderer);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d));
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.g(worldRenderer);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d));
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.g(worldRenderer);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f));
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.g(worldRenderer);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f));
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.g(worldRenderer);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f));
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.g(worldRenderer);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d));
        TessellatorInvoker.draw(tessellator);
    }

    public static void a(String string, double d, double d2) {
        TimerUtil.e();
        int n = 0;
        char[] cArray = StringInvoker.f(string);
        int n2 = cArray.length;
        int n3 = 0;
        if (n3 < n2) {
            char c = cArray[n3];
            FontRendererInvoker.a(arn_1.l.fontRendererObj, StringInvoker.a(c), (float)d, (float)d2, hb_2.a((long)n), true);
            d += (double)FontRendererInvoker.a(arn_1.l.fontRendererObj, c);
            n -= 120;
            ++n3;
        }
    }

    public static void a(ItemStack itemStack, float f, float f2) {
        TimerUtil.e();
        GL11.glPushMatrix();
        Minecraft minecraft = MCInvoker.f();
        if (minecraft.world != null) {
            ne_0.f();
        }
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.clear(256);
        MCInvoker.A((Minecraft)minecraft).e = -150.0f;
        DU.b(MCInvoker.A(minecraft), itemStack, f, f2);
        MCInvoker.A((Minecraft)minecraft).e = 0.0f;
        GlStateManagerInvoker.enableBlend();
        float f3 = 0.5f;
        GlStateManagerInvoker.c(f3, f3, f3);
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.c(2.0f, 2.0f, 2.0f);
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.popMatrix();
        GL11.glPopMatrix();
    }

    public static void a(double d, double d2, double d3, double d4, Color color, Color color2) {
        arn_1.a(d, d2, d3, d4, color);
        arn_1.b(d, d2, d3, d4, color2);
    }

    public static void a(double d, double d2, double d3, int n) {
        GL11.glEnable((int)3008);
        GL11.glEnable((int)3042);
        OpenGlHelper.c(770, 771, 1, 0);
        GlStateManagerInvoker.disableTexture2D();
        arn_1.b(n);
        GL11.glPointSize((float)((float)d3 * 2.0f));
        GL11.glEnable((int)2832);
        GL11.glBegin((int)0);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glEnd();
        GL11.glDisable((int)2832);
        GlStateManagerInvoker.enableTexture2D();
    }

    public static void a(ResourceLocation resourceLocation, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        GL11.glDepthMask((boolean)false);
        OpenGlHelper.c(770, 771, 1, 0);
        arn_1.b(n);
        TextureManagerInvoker.bindTexture(MCInvoker.E(l), resourceLocation);
        wh_1.a(n2, n3, n8, n9, n4, n5, n6, n7);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2929);
    }

    public static void a(ItemStack itemStack, float f, float f2, double d) {
        GL11.glPushMatrix();
        TimerUtil.e();
        GlStateManagerInvoker.disableLighting();
        if (arn_1.l.world != null) {
            ne_0.f();
        }
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.clear(256);
        MCInvoker.A((Minecraft)arn_1.l).e = -150.0f;
        DU.a(MCInvoker.A(l), itemStack, f, f2, d);
        MCInvoker.A((Minecraft)arn_1.l).e = 0.0f;
        GlStateManagerInvoker.enableBlend();
        float f3 = 0.5f;
        GlStateManagerInvoker.c(f3, f3, f3);
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.c(2.0f, 2.0f, 2.0f);
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.popMatrix();
        GL11.glPopMatrix();
    }

    public static void b(@NotNull rm_2 rm_22) {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.a);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d);
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.a);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d);
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.a);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f);
        TimerUtil.e();
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f);
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.a);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f);
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.a);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f);
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.a);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d);
        WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d);
        TessellatorInvoker.draw(tessellator);
        if (ListInvoker.b() != null) {
            TimerUtil.b("oN6Zac");
        }
    }

    public static void c(double d, double d2, double d3, double d4, double d5, int n) {
        arn_1.a(d, d2, d3, d4, d5, 1.0f, n, 0);
    }

    public static void a(float f, float f2, float f3, float f4, int n, int n2) {
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)7);
        arn_1.a(n);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glVertex2f((float)f, (float)f4);
        arn_1.a(n2);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glVertex2f((float)f3, (float)f2);
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
    }

    public static void b(double d, double d2, double d3, double d4, int n) {
        TimerUtil.e();
        int n2 = 0;
        double d5 = d;
        if (d5 < d + d3) {
            arn_1.d(d5, d2, d5 + 0.5, d2 + d4, hb_2.a((long)n2));
            n2 -= n;
            d5 += 0.5;
        }
    }

    public static void a() {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    public static int a(int n, int n2) {
        float f = (SystemInvoker.f() + (long)n2) % (long)n;
        return aol_1.b(aol_1.b(f /= (float)n, 0.75f, 1.0f));
    }

    public static void a(double d, double d2, double d3, double d4, double d5, float f, int n, int[] nArray, long l4) {
        double d6 = d + d3;
        TimerUtil.e();
        double d7 = d2 + d4;
        GL11.glPushAttrib((int)0);
        GL11.glDisable((int)3553);
        arn_1.b(n);
        GlStateManagerInvoker.enableBlend();
        GL11.glEnable((int)2848);
        GL11.glBegin((int)9);
        int n2 = 0;
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * (d5 * -1.0)), (double)(d2 + d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * (d5 * -1.0)));
        ++n2;
        n2 = 90;
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * (d5 * -1.0)), (double)(d7 - d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * (d5 * -1.0)));
        ++n2;
        n2 = 0;
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * d5), (double)(d7 - d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * d5));
        ++n2;
        n2 = 90;
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * d5), (double)(d2 + d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * d5));
        ++n2;
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glPopAttrib();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        arn_1.a(d, d2, d3, d4, d5, f, nArray, l4);
    }

    public static void b(double d, double d2, double d3, float f, int n, int n2) {
        TimerUtil.e();
        GL11.glPushMatrix();
        GlStateManagerInvoker.enableBlend();
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        arn_1.b(n);
        GL11.glBegin((int)6);
        int n3 = 0;
        GL11.glVertex2d((double)(d + (double)MathHelper.h((double)n3 * Math.PI / 180.0) * d3), (double)(d2 + (double)MathHelper.b((double)n3 * Math.PI / 180.0) * d3));
        ++n3;
        GL11.glEnd();
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)3);
        arn_1.b(n2);
        n3 = 0;
        GL11.glVertex2d((double)(d - MathInvoker.i((double)n3 * Math.PI / 180.0) * d3), (double)(d2 + MathInvoker.m((double)n3 * Math.PI / 180.0) * d3));
        ++n3;
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GlStateManagerInvoker.disableBlend();
        GL11.glPopMatrix();
    }

    private static void a(Render3DEvent render3DEvent, double d, double d2, double d3, int n, int n2) {
        float f = 1.0f;
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        float f2 = f - 0.0f;
        int cfr_ignored_1 = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        GlStateManagerInvoker.disableFog();
        int n3 = 0;
        int n4 = n3 + n;
        TextureManagerInvoker.bindTexture(MCInvoker.E(l), j);
        GL11.glTexParameterf((int)3553, (int)10242, (float)10497.0f);
        GL11.glTexParameterf((int)3553, (int)10243, (float)10497.0f);
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.A();
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.c(true);
        GlStateManagerInvoker.b(770, 1, 1, 0);
        double d4 = (double)BlockInvoker.l(arn_1.l.world) + (double)a1j.a(render3DEvent);
        double d5 = MathHelper.d(-d4 * 0.2 - (double)MathHelper.floor_double(-d4 * 0.1));
        float f3 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n2 & 0xFF) / 255.0f;
        double d6 = d4 * 0.025 * -1.5;
        double d7 = 0.5 + (double)MathHelper.b(d6 + 2.356194490192345) * 0.2;
        double d8 = 0.5 + (double)MathHelper.h(d6 + 2.356194490192345) * 0.2;
        double d9 = 0.5 + (double)MathHelper.b(d6 + 0.7853981633974483) * 0.2;
        double d10 = 0.5 + (double)MathHelper.h(d6 + 0.7853981633974483) * 0.2;
        double d11 = 0.5 + (double)MathHelper.b(d6 + 3.9269908169872414) * 0.2;
        double d12 = 0.5 + (double)MathHelper.h(d6 + 3.9269908169872414) * 0.2;
        double d13 = 0.5 + (double)MathHelper.b(d6 + 5.497787143782138) * 0.2;
        double d14 = 0.5 + (double)MathHelper.h(d6 + 5.497787143782138) * 0.2;
        double d15 = -1.0 + d5;
        double d16 = (double)((float)n * f) * 2.5 + d15;
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d7, d2 + (double)n4, d3 + d8), 1.0, d16), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d7, d2 + (double)n3, d3 + d8), 1.0, d15), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d9, d2 + (double)n3, d3 + d10), 0.0, d15), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d9, d2 + (double)n4, d3 + d10), 0.0, d16), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d13, d2 + (double)n4, d3 + d14), 1.0, d16), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d13, d2 + (double)n3, d3 + d14), 1.0, d15), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d11, d2 + (double)n3, d3 + d12), 0.0, d15), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d11, d2 + (double)n4, d3 + d12), 0.0, d16), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d9, d2 + (double)n4, d3 + d10), 1.0, d16), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d9, d2 + (double)n3, d3 + d10), 1.0, d15), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d13, d2 + (double)n3, d3 + d14), 0.0, d15), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d13, d2 + (double)n4, d3 + d14), 0.0, d16), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d11, d2 + (double)n4, d3 + d12), 1.0, d16), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d11, d2 + (double)n3, d3 + d12), 1.0, d15), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d7, d2 + (double)n3, d3 + d8), 0.0, d15), f3, f4, f5, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d7, d2 + (double)n4, d3 + d8), 0.0, d16), f3, f4, f5, 1.0f));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.c(false);
        double d17 = -1.0 + d5;
        double d18 = (double)((float)n * f) + d17;
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n4, d3 + 0.2), 1.0, d18), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n3, d3 + 0.2), 1.0, d17), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n3, d3 + 0.2), 0.0, d17), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n4, d3 + 0.2), 0.0, d18), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n4, d3 + 0.8), 1.0, d18), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n3, d3 + 0.8), 1.0, d17), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n3, d3 + 0.8), 0.0, d17), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n4, d3 + 0.8), 0.0, d18), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n4, d3 + 0.2), 1.0, d18), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n3, d3 + 0.2), 1.0, d17), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n3, d3 + 0.8), 0.0, d17), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n4, d3 + 0.8), 0.0, d18), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n4, d3 + 0.8), 1.0, d18), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n3, d3 + 0.8), 1.0, d17), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n3, d3 + 0.2), 0.0, d17), f3, f4, f5, 0.125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n4, d3 + 0.2), 0.0, d18), f3, f4, f5, 0.125f));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.c(true);
        n3 = n4;
    }

    public static void b(double d, double d2, double d3, int n) {
        double d4 = d - MCInvoker.j((Minecraft)arn_1.l).s;
        double d5 = d2 - MCInvoker.j((Minecraft)arn_1.l).h;
        double d6 = d3 - MCInvoker.j((Minecraft)arn_1.l).m;
        double d7 = BlocksInvoker.C(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(arn_1.l.world, new BlockPos(d, d2, d3)))) - BlocksInvoker.j(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(arn_1.l.world, new BlockPos(d, d2, d3))));
        float f = (float)(n >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n & 0xFF) / 255.0f;
        float f4 = (float)(n >> 24 & 0xFF) / 255.0f;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glLineWidth((float)1.0f);
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        arn_1.a(new rm_2(d4, d5, d6, d4 + 1.0, d5 + d7, d6 + 1.0));
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static int[] a(eu_0 eu_02) {
        float[] fArray = aUL.e(eu_02);
        Color color = new Color(hb_2.a(0L));
        float[] fArray2 = aol_1.a(aol_1.c(color), aol_1.g(color), aol_1.f(color), new float[3]);
        Color color2 = aol_1.b(fArray2[0], fArray[1], fArray[2]);
        return new int[]{aol_1.c(color2), aol_1.g(color2), aol_1.f(color2)};
    }

    public static String a(String string, String string2) {
        TimerUtil.e();
        String string3 = aQZ.b;
        int n = 0;
        if (n < StringInvoker.c(string)) {
            char c = b[MathHelper.b(b.length - 1, 0)];
            string3 = StringInvoker.f(string3, StringInvoker.a(c));
            ++n;
        }
        if (StringInvoker.a(string2, (CharSequence)string)) {
            return StringInvoker.a(string2, (CharSequence)string, (CharSequence)aL0.a(aL0.a(aL0.a(new StringBuilder(), aQZ.e), string3), aQZ.d).toString());
        }
        return null;
    }

    public static void a(double d, double d2, double d3, double d4, float f, int n, int n2) {
        arn_1.d(d, d2, d3, d4, n2);
        float f2 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n & 0xFF) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4f((float)f3, (float)f4, (float)f5, (float)f2);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d, (double)d4);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d3, (double)d2);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d3, (double)d2);
        GL11.glVertex2d((double)d, (double)d4);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
        GL11.glPopMatrix();
        GL11.glColor4f((float)255.0f, (float)1.0f, (float)1.0f, (float)255.0f);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
    }

    public static void a(double d, double d2, double d3, double d4, double d5, float f, float f2, float f3, float f4) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        arn_1.a(new rm_2(d - d4, d2, d3 - d4, d + d4, d2 + d5, d3 + d4));
        arn_1.d(new rm_2(d - d4, d2, d3 - d4, d + d4, d2 + d5, d3 + d4));
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private arn_1() {
        throw new UnsupportedOperationException(aQZ.a);
    }

    public static void a(double d, double d2, double d3, double d4, Color color) {
        double d5 = d3 / 4.0;
        arn_1.a(color);
        GL11.glPushMatrix();
        GlStateManagerInvoker.disableTexture2D();
        GL11.glEnable((int)2881);
        GL11.glPolygonMode((int)1032, (int)6914);
        GL11.glBegin((int)9);
        GL11.glVertex2d((double)(d + d5), (double)d2);
        GL11.glVertex2d((double)d, (double)(d2 + d4));
        GL11.glVertex2d((double)(d + d3 - d5), (double)(d2 + d4));
        GL11.glVertex2d((double)(d + d3), (double)d2);
        GL11.glEnd();
        GL11.glDisable((int)2881);
        GlStateManagerInvoker.enableTexture2D();
        GL11.glPopMatrix();
    }

    public static void a(float f, float f2, float f3, float f4, float f5, int n, int n2) {
        arn_1.a(f, f2, f3, f4, n2);
        float f6 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f7 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f8 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f9 = (float)(n & 0xFF) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4f((float)f7, (float)f8, (float)f9, (float)f6);
        GL11.glLineWidth((float)f5);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)255.0f);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
    }

    public static void a(double d, double d2, double d3, double d4, double d5, int n) {
        arn_1.a(d, d2, d3, d4, d5, d5, n);
    }

    public static void e() {
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glHint((int)3155, (int)4354);
    }

    public static void a(float f, float f2, float f3, float f4, int n) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        arn_1.b(n);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GlStateManagerInvoker.enableTexture2D();
    }

    public static void a(Render3DEvent render3DEvent, Color color, Entity entity) {
        TimerUtil.e();
        if (entity != null) {
            i = 200;
            double d = (double)entity.n + 0.2;
            if (!a && k < d + 0.5) {
                k += 0.01;
                g += 0.01;
            }
            a = true;
            g = k + 0.5;
            if (a && k > -0.5) {
                k -= 0.01;
                g -= 0.01;
            }
            a = false;
            g = k - 0.5;
            GL11.glPushMatrix();
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glDisable((int)3553);
            GlStateManagerInvoker.disableDepth();
            GL11.glDisable((int)2896);
            GL11.glLineWidth((float)1.0f);
            GL11.glShadeModel((int)7425);
            double d2 = 0.7;
            double d3 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)arn_1.l).s;
            double d4 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)arn_1.l).h;
            double d5 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)arn_1.l).m;
            double d6 = atn_0.c((EntityLivingBase)entity) / (atn_0.y((EntityLivingBase)entity) / 100.0f) / 100.0f;
            arn_1.d = (float)((double)arn_1.d + (d6 - (double)arn_1.d) * (double)0.85f);
            long l4 = MCInvoker.a();
            GlStateManagerInvoker.A();
            GL11.glBegin((int)5);
            int n = 0;
            double d7 = d2 * MathInvoker.m((double)n * Math.PI / 180.0);
            double d8 = d2 * MathInvoker.i((double)n * Math.PI / 180.0);
            arn_1.a(new Color(aol_1.c(color), aol_1.g(color), aol_1.f(color), 100));
            GL11.glVertex3d((double)(d3 + d7), (double)(d4 + MathHelper.b(k, 0.0, d)), (double)(d5 + d8));
            arn_1.a(new Color(aol_1.c(color), aol_1.g(color), aol_1.f(color), 0));
            GL11.glVertex3d((double)(d3 + d7), (double)(d4 + MathHelper.b(g, 0.0, d)), (double)(d5 + d8));
            ++n;
            GL11.glEnd();
            GL11.glLineWidth((float)2.0f);
            GL11.glBegin((int)3);
            n = 0;
            d7 = d2 * MathInvoker.m((double)n * Math.PI / 180.0);
            d8 = d2 * MathInvoker.i((double)n * Math.PI / 180.0);
            arn_1.a(new Color(aol_1.c(color), aol_1.g(color), aol_1.f(color), i));
            GL11.glVertex3d((double)(d3 + d7), (double)(d4 + MathHelper.b(k, 0.0, d)), (double)(d5 + d8));
            l4 += 6L;
            ++n;
            GL11.glEnd();
            GlStateManagerInvoker.enableDepth();
            GL11.glEnable((int)2929);
            GL11.glDisable((int)2848);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
            GL11.glPopMatrix();
        }
    }

    public static boolean a(Entity entity) {
        TimerUtil.e();
        return arn_1.c(ayj_0.u(entity)) || entity.G;
    }

    public static void b(double d, double d2, double d3, double d4, int n, int n2) {
        double d5 = d + d3;
        double d6 = d2 + d4;
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GL11.glShadeModel((int)7425);
        GL11.glLineWidth((float)1.0f);
        GL11.glBegin((int)7);
        arn_1.b(n);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d, (double)(d2 + (d6 - d2)));
        arn_1.b(n2);
        GL11.glVertex2d((double)(d + (d5 - d)), (double)(d2 + (d6 - d2)));
        GL11.glVertex2d((double)(d + (d5 - d)), (double)d2);
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
        GlStateManagerInvoker.enableTexture2D();
    }

    public static void a(BlockPos blockPos, int n) {
        double d = (double)amv_2.j(blockPos) - MCInvoker.j((Minecraft)arn_1.l).s;
        double d2 = (double)amv_2.h(blockPos) - MCInvoker.j((Minecraft)arn_1.l).h;
        double d3 = (double)amv_2.i(blockPos) - MCInvoker.j((Minecraft)arn_1.l).m;
        double d4 = BlocksInvoker.C(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(arn_1.l.world, blockPos))) - BlocksInvoker.j(BlockStateInvoker.getBlock(BlockInvoker.getMaterial(arn_1.l.world, blockPos)));
        float f = (float)(n >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n & 0xFF) / 255.0f;
        float f4 = (float)(n >> 24 & 0xFF) / 255.0f;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glLineWidth((float)1.0f);
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        arn_1.a(new rm_2(d, d2, d3, d + 1.0, d2 + d4, d3 + 1.0));
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2929);
        GlStateManagerInvoker.disableBlend();
        GL11.glPopMatrix();
    }

    public static void a(ItemStack itemStack, double d, double d2, int n) {
        GL11.glPushMatrix();
        TimerUtil.e();
        Minecraft minecraft = MCInvoker.f();
        if (minecraft.world != null) {
            ne_0.f();
        }
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.clear(256);
        MCInvoker.A((Minecraft)minecraft).e = -150.0f;
        DU.a(MCInvoker.A(minecraft), itemStack, (float)d, (float)d2, n);
        MCInvoker.A((Minecraft)minecraft).e = 0.0f;
        GlStateManagerInvoker.enableBlend();
        float f = 0.5f;
        GlStateManagerInvoker.c(f, f, f);
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.c(2.0f, 2.0f, 2.0f);
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.popMatrix();
        GL11.glPopMatrix();
    }

    public static int b() {
        float f = (SystemInvoker.f() - 15L) % 6000L;
        Color color = aol_1.b(f /= 6000.0f, 1.0f, 1.0f);
        return aol_1.b(color);
    }

    public static Vec3 a(EntityPlayer entityPlayer) {
        float f = MCInvoker.f().timer.renderPartialTicks;
        double d = entityPlayer.lastTickPosX + (entityPlayer.posX - entityPlayer.lastTickPosX) * (double)f;
        double d2 = entityPlayer.lastTickPosY + (entityPlayer.posY - entityPlayer.lastTickPosY) * (double)f;
        double d3 = entityPlayer.lastTickPosZ + (entityPlayer.posZ - entityPlayer.lastTickPosZ) * (double)f;
        return new Vec3(d, d2, d3);
    }

    public static int b(Color color, Color color2, double d) {
        int n = (int)((double)aol_1.c(color) + (double)(aol_1.c(color2) - aol_1.c(color)) * d);
        int n2 = (int)((double)aol_1.g(color) + (double)(aol_1.g(color2) - aol_1.g(color)) * d);
        int n3 = (int)((double)aol_1.f(color) + (double)(aol_1.f(color2) - aol_1.f(color)) * d);
        int n4 = (int)((double)aol_1.e(color) + (double)(aol_1.e(color2) - aol_1.e(color)) * d);
        try {
            return aol_1.b(new Color(n, n2, n3, n4));
        }
        catch (Exception exception) {
            return -1;
        }
    }

    private static void lambda$drawGlowingBarRect$1(double d, double d2, double d3, int n) {
        arn_1.b(d, d2 - 1.5, d3, 3.0, n);
    }

    public static void a(ItemStack itemStack, double d, double d2) {
        GL11.glPushMatrix();
        TimerUtil.e();
        Minecraft minecraft = MCInvoker.f();
        if (minecraft.world != null) {
            ne_0.f();
        }
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.clear(256);
        MCInvoker.A((Minecraft)minecraft).e = -150.0f;
        DU.b(MCInvoker.A(minecraft), itemStack, (float)d, (float)d2);
        MCInvoker.A((Minecraft)minecraft).e = 0.0f;
        GlStateManagerInvoker.enableBlend();
        float f = 0.5f;
        GlStateManagerInvoker.c(f, f, f);
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.c(2.0f, 2.0f, 2.0f);
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.popMatrix();
        GL11.glPopMatrix();
    }

    public static void a(double d, double d2, float f, int n, double d3, double d4) {
        arn_1.a();
        GL11.glPushMatrix();
        GL11.glLineWidth((float)f);
        arn_1.a(new Color(n));
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)(d + -MathInvoker.i(MathInvoker.o(d4 - 90.0)) * (d3 / 2.0)), (double)(d2 + MathInvoker.m(MathInvoker.o(d4 - 90.0)) * (d3 / 2.0)));
        GL11.glVertex2d((double)(d + -MathInvoker.i(MathInvoker.o(d4)) * (d3 / 2.0)), (double)(d2 + MathInvoker.m(MathInvoker.o(d4)) * (d3 / 2.0)));
        GL11.glVertex2d((double)(d + -MathInvoker.i(MathInvoker.o(d4 + 90.0)) * (d3 / 2.0)), (double)(d2 + MathInvoker.m(MathInvoker.o(d4 + 90.0)) * (d3 / 2.0)));
        GL11.glEnd();
        GL11.glPopMatrix();
        arn_1.h();
    }

    public static void c() {
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void a(float f, float f2, float f3, int n) {
        float f4 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f5 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f6 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f7 = (float)(n & 0xFF) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        TimerUtil.e();
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)f5, (float)f6, (float)f7, (float)f4);
        GL11.glBegin((int)6);
        int n2 = 0;
        GL11.glVertex2d((double)(f + MathHelper.sin((float)n2 * (float)Math.PI / 180.0f) * f3), (double)(f2 + MathHelper.cos((float)n2 * (float)Math.PI / 180.0f) * f3));
        ++n2;
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static Vector4d a(Entity entity, int n) {
        TimerUtil.e();
        float f = arn_1.l.timer.renderPartialTicks;
        double d = arn_1.a(entity.posX, entity.lastTickPosX, (double)f);
        double d2 = arn_1.a(entity.posY, entity.lastTickPosY, (double)f);
        double d3 = arn_1.a(entity.posZ, entity.lastTickPosZ, (double)f);
        double d4 = ((double)entity.width + 0.2) * 0.5;
        double d5 = (double)entity.n + (ayj_0.l(entity) ? -0.3 : 0.2) + 0.05;
        rm_2 rm_22 = new rm_2(d - d4, d2, d3 - d4, d + d4, d2 + d5, d3 + d4);
        List list = a7r_0.a(new Vector3d[]{new Vector3d(rm_22.e, rm_22.a, rm_22.f), new Vector3d(rm_22.e, rm_22.c, rm_22.f), new Vector3d(rm_22.b, rm_22.a, rm_22.f), new Vector3d(rm_22.b, rm_22.c, rm_22.f), new Vector3d(rm_22.e, rm_22.a, rm_22.d), new Vector3d(rm_22.e, rm_22.c, rm_22.d), new Vector3d(rm_22.b, rm_22.a, rm_22.d), new Vector3d(rm_22.b, rm_22.c, rm_22.d)});
        Vector4d vector4d = null;
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator)) {
            Vector3d vector3d = (Vector3d)dz_0.b(iterator);
            vector3d = arn_1.a(n, vector3d.x - MCInvoker.j((Minecraft)arn_1.l).k, vector3d.y - MCInvoker.j((Minecraft)arn_1.l).n, vector3d.z - MCInvoker.j((Minecraft)arn_1.l).j);
            if (vector3d != null && vector3d.z >= 0.0 && vector3d.z < 1.0) {
                if (vector4d == null) {
                    vector4d = new Vector4d(vector3d.x, vector3d.y, vector3d.z, 0.0);
                }
                vector4d.x = MathInvoker.a(vector3d.x, vector4d.x);
                vector4d.y = MathInvoker.a(vector3d.y, vector4d.y);
                vector4d.z = MathInvoker.d(vector3d.x, vector4d.z);
                vector4d.w = MathInvoker.d(vector3d.y, vector4d.w);
            }
        }
        return vector4d;
    }

    public static void a(double d, double d2, double d3, float f, int n, int n2) {
        GL11.glPushMatrix();
        GlStateManagerInvoker.enableBlend();
        TimerUtil.e();
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)3);
        arn_1.b(n2);
        int n3 = 0;
        if (n3 <= n) {
            GL11.glVertex2d((double)(d - MathInvoker.i((double)n3 * Math.PI / 180.0) * d3), (double)(d2 + MathInvoker.m((double)n3 * Math.PI / 180.0) * d3));
            ++n3;
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GlStateManagerInvoker.disableBlend();
        GL11.glPopMatrix();
    }

    public static void a(rm_2 rm_22) {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.k);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f));
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.k);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f));
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 1, DefaultVertexFormats.k);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d));
        TessellatorInvoker.draw(tessellator);
    }

    public static void a(double d, double d2, double d3, double d4, double d5, float f, int n) {
        double d6;
        TimerUtil.e();
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        arn_1.b(n);
        if (d3 > d4) {
            d6 = d4;
            d4 = d3;
            d3 = d6;
        }
        GL11.glLineWidth((float)f);
        GL11.glEnable((int)2848);
        GL11.glBegin((int)3);
        d6 = d3;
        if (d6 <= d4) {
            double d7 = MathInvoker.m(d6 * Math.PI / 180.0) * d5;
            double d8 = MathInvoker.i(d6 * Math.PI / 180.0) * d5;
            GL11.glVertex2d((double)(d + d7), (double)(d2 + d8));
            d6 += 2.0;
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void a(double d, double d2, double d3, double d4, double d5, int n, int n2) {
        double d6 = d + d3;
        double d7 = d2 + d4;
        TimerUtil.e();
        GL11.glPushAttrib((int)0);
        GL11.glDisable((int)3553);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GL11.glEnable((int)2848);
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)9);
        arn_1.b(n);
        int n3 = 0;
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n3 * (Math.PI / 180)) * (d5 * -1.0)), (double)(d2 + d5 + (double)MathHelper.b((double)n3 * (Math.PI / 180)) * (d5 * -1.0)));
        ++n3;
        n3 = 90;
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n3 * (Math.PI / 180)) * (d5 * -1.0)), (double)(d7 - d5 + (double)MathHelper.b((double)n3 * (Math.PI / 180)) * (d5 * -1.0)));
        ++n3;
        arn_1.b(n2);
        n3 = 0;
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n3 * (Math.PI / 180)) * d5), (double)(d7 - d5 + (double)MathHelper.b((double)n3 * (Math.PI / 180)) * d5));
        ++n3;
        n3 = 90;
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n3 * (Math.PI / 180)) * d5), (double)(d2 + d5 + (double)MathHelper.b((double)n3 * (Math.PI / 180)) * d5));
        ++n3;
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glPopAttrib();
        GlStateManagerInvoker.disableBlend();
    }

    public static void a(double d, double d2, double d3, double d4, int n, int n2, l9 l92, int n3, int n4) {
        TimerUtil.e();
        adp_0.b(false);
        arn_1.d(d, d2, d + d3, d2 + d4, hb_2.a(asx_1.BLACK));
        adp_0.a(false);
        agg_2.a(l92, n3, (int)(1.5686274509803921 * (double)n4), true, () -> arn_1.lambda$drawGlowingBarRect$1(d, d2, d3, n2), null);
        adp_0.a();
        arn_1.d(d, d2, d + d3, d2 + d4, n);
        arn_1.b(d, d2 - 1.5, d3, 1.5, n2);
    }

    public static void a(double d, double d2, double d3, double d4) {
        TimerUtil.e();
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        double d5 = d;
        if (d5 < d3) {
            float f = (float)(1.0 / (d3 - d) * (d5 - d));
            float[] fArray = aUL.e(cw_2.k(hUD));
            Color color = aol_1.b(f, fArray[1], fArray[2]);
            arn_1.d(d5, d2, d5 + 0.5, d4, aol_1.b(color));
            d5 += 0.5;
        }
    }

    public static float[] c(int n) {
        return new float[]{(float)(n >> 16 & 0xFF) / 255.0f, (float)(n >> 8 & 0xFF) / 255.0f, (float)(n & 0xFF) / 255.0f, (float)(n >> 24 & 0xFF) / 255.0f};
    }

    public static void a(double d, double d2, double d3, double d4, double d5, float f, int n, long l4) {
        TimerUtil.e();
        double d6 = d + d3;
        double d7 = d2 + d4;
        GL11.glPushAttrib((int)0);
        GL11.glDisable((int)3553);
        arn_1.b(n);
        GlStateManagerInvoker.enableBlend();
        GL11.glEnable((int)2848);
        GL11.glBegin((int)9);
        int n2 = 0;
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * (d5 * -1.0)), (double)(d2 + d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * (d5 * -1.0)));
        ++n2;
        n2 = 90;
        GL11.glVertex2d((double)(d + d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * (d5 * -1.0)), (double)(d7 - d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * (d5 * -1.0)));
        ++n2;
        n2 = 0;
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * d5), (double)(d7 - d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * d5));
        ++n2;
        n2 = 90;
        GL11.glVertex2d((double)(d6 - d5 + (double)MathHelper.h((double)n2 * (Math.PI / 180)) * d5), (double)(d2 + d5 + (double)MathHelper.b((double)n2 * (Math.PI / 180)) * d5));
        ++n2;
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glPopAttrib();
        GlStateManagerInvoker.disableBlend();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        arn_1.a(d, d2, d3, d4, d5, f, l4);
    }
}

