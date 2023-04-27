/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IChatComponent;
import net.GuiIngame;
import net.QK;
import net.ScaledResolution;
import net.acl_0;
import net.ao3_0;
import net.qs_0;
import net.sg_0;

public class GW {
    private static int[] b;

    public static int a(GuiIngame guiIngame) {
        return guiIngame.l();
    }

    public static sg_0 b(GuiIngame guiIngame) {
        return guiIngame.h();
    }

    public static void a(GuiIngame guiIngame, ScaledResolution scaledResolution) {
        guiIngame.c(scaledResolution);
    }

    public static void a(GuiIngame guiIngame, String string, boolean bl) {
        guiIngame.a(string, bl);
    }

    public static acl_0 d(GuiIngame guiIngame) {
        return guiIngame.d();
    }

    public static qs_0 f(GuiIngame guiIngame) {
        return guiIngame.a();
    }

    public static void g(GuiIngame guiIngame) {
        guiIngame.c();
    }

    public static void a(GuiIngame guiIngame, IChatComponent iChatComponent, boolean bl) {
        guiIngame.a(iChatComponent, bl);
    }

    public static void a(GuiIngame guiIngame, String string) {
        guiIngame.a(string);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void a(GuiIngame guiIngame, ao3_0 ao3_02) {
        guiIngame.a(ao3_02);
    }

    public static void c(GuiIngame guiIngame) {
        guiIngame.g();
    }

    public static void a(GuiIngame guiIngame, String string, String string2, int n, int n2, int n3) {
        guiIngame.a(string, string2, n, n2, n3);
    }

    public static QK e(GuiIngame guiIngame) {
        return guiIngame.m();
    }

    public static void a(GuiIngame guiIngame, float f) {
        guiIngame.a(f);
    }

    public static void a(GuiIngame guiIngame, int n, int n2, int n3, int n4, int n5) {
        guiIngame.a(n, n2, n3, n4, n5);
    }

    public static int[] b() {
        return b;
    }

    public static void h(GuiIngame guiIngame) {
        guiIngame.k();
    }

    static {
        if (GW.b() == null) {
            GW.b(new int[1]);
        }
    }
}

