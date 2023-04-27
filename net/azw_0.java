/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.aZw
 */
public class azw_0 {
    private static ListInvoker[] b;
    private double d;
    private double c;
    public Minecraft f = MCInvoker.f();
    private int e;

    public void a(Minecraft minecraft) {
        azw_0.b();
        if (this.e != minecraft.gameSettings.z || this.d != (double)minecraft.displayWidth || this.c != (double)minecraft.displayHeight) {
            this.c();
        }
        this.d = minecraft.displayWidth;
        this.c = minecraft.displayHeight;
        this.e = minecraft.gameSettings.z;
    }

    public static ListInvoker[] b() {
        return b;
    }

    public void c() {
    }

    static {
        if (azw_0.b() != null) {
            azw_0.b(new ListInvoker[3]);
        }
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }
}

