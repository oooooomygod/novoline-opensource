/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.MCInvoker;
import deobf.TimerUtil;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.agT
 */
public class agt_1 {
    private static Minecraft a = MCInvoker.f();

    public static double[] a(double d, double d2, double d3) {
        return new double[]{agt_1.c(d, d3), agt_1.b(d2, d3)};
    }

    public static int b(int n, double d) {
        TimerUtil.e();
        int n2 = n;
        double d2 = 1.0 / d;
        switch (agt_1.a.gameSettings.z) {
            case 1: {
                n2 = (int)((double)n2 * (0.5 * d2));
            }
            case 2: {
                n2 = (int)((double)n2 * d2);
            }
            case 3: {
                n2 = (int)((double)n2 * (1.5 * d2));
            }
        }
        return n2;
    }

    public static int a(int n, double d) {
        TimerUtil.e();
        int n2 = n;
        double d2 = 1.0 / d;
        switch (agt_1.a.gameSettings.z) {
            case 1: {
                n2 = (int)((double)n2 * (0.5 * d2));
            }
            case 2: {
                n2 = (int)((double)n2 * d2);
            }
            case 3: {
                n2 = (int)((double)n2 * (1.5 * d2));
            }
        }
        return n2;
    }

    public static int[] a(int n, int n2, double d) {
        return new int[]{agt_1.b(n, d), agt_1.a(n2, d)};
    }

    public static double b(double d) {
        TimerUtil.e();
        double d2 = d;
        switch (agt_1.a.gameSettings.z) {
            case 1: {
                d2 *= 0.5;
            }
            case 3: {
                d2 *= 1.5;
            }
        }
        return d2;
    }

    public static double b(double d, double d2) {
        double d3 = d;
        TimerUtil.e();
        double d4 = 1.0 / d2;
        switch (agt_1.a.gameSettings.z) {
            case 1: {
                d3 *= 0.5 * d4;
            }
            case 2: {
                d3 *= d4;
            }
            case 3: {
                d3 *= 1.5 * d4;
            }
        }
        return d3;
    }

    public static void a(double d) {
        GL11.glScaled((double)(1.0 / d), (double)(1.0 / d), (double)(1.0 / d));
    }

    public static double c(double d) {
        TimerUtil.e();
        double d2 = d;
        switch (agt_1.a.gameSettings.z) {
            case 1: {
                d2 *= 0.5;
            }
            case 3: {
                d2 *= 1.5;
            }
        }
        return d2;
    }

    public static double c(double d, double d2) {
        TimerUtil.e();
        double d3 = d;
        double d4 = 1.0 / d2;
        switch (agt_1.a.gameSettings.z) {
            case 1: {
                d3 *= 0.5 * d4;
            }
            case 2: {
                d3 *= d4;
            }
            case 3: {
                d3 *= 1.5 * d4;
            }
        }
        return d3;
    }

    public static void a(Runnable runnable) {
        TimerUtil.e();
        double d = 1.0;
        if (agt_1.a.gameSettings.z == 1) {
            d = 2.0;
        }
        if (agt_1.a.gameSettings.z == 3) {
            d = 0.6666666666666666;
        }
        GL11.glScaled((double)d, (double)d, (double)d);
        sj_1.a(runnable);
        agt_1.a(d);
    }

    public static double a(boolean bl) {
        TimerUtil.e();
        double d = 1.0;
        if (agt_1.a.gameSettings.z == 1) {
            d = 2.0;
        }
        if (agt_1.a.gameSettings.z == 3) {
            d = 0.6666666666666666;
        }
        if (bl) {
            GlStateManagerInvoker.b(d, d, d);
        }
        return d;
    }

    public static int b(int n) {
        TimerUtil.e();
        int n2 = n;
        switch (agt_1.a.gameSettings.z) {
            case 1: {
                n2 = (int)((double)n2 * 0.5);
            }
            case 3: {
                n2 = (int)((double)n2 * 1.5);
            }
        }
        return n2;
    }

    public static int[] a(int n, int n2) {
        return new int[]{agt_1.b(n), agt_1.a(n2)};
    }

    public static double[] a(double d, double d2) {
        return new double[]{agt_1.b(d), agt_1.c(d2)};
    }

    public static int a(int n) {
        TimerUtil.e();
        int n2 = n;
        switch (agt_1.a.gameSettings.z) {
            case 1: {
                n2 = (int)((double)n2 * 0.5);
            }
            case 3: {
                n2 = (int)((double)n2 * 1.5);
            }
        }
        return n2;
    }
}

