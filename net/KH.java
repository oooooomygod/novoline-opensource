/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.MCInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.client.Minecraft;

public class KH
extends KM {
    private static String F = "CL_00001071";
    public double G;
    public static String E;
    public double H;

    public KH(String string) {
        super(string);
        E = string;
    }

    public void a(World world, double d, double d2, double d3, boolean bl, boolean bl2) {
        if (!ListInvoker.isEmpty(this.e)) {
            double d4 = 0.0;
            BlockPos blockPos = aV8.m(world);
            double d5 = (double)amv_2.j(blockPos) - d;
            double d6 = (double)amv_2.i(blockPos) - d2;
            d4 = -(((d3 %= 360.0) - 90.0) * Math.PI / 180.0 - MathInvoker.c(d6, d5));
            if (!qq_2.d(world.d)) {
                d4 = MathInvoker.a() * Math.PI * 2.0;
            }
            this.H = d4;
            int n = (int)((this.H / (Math.PI * 2) + 1.0) * (double)ListInvoker.size(this.e)) % ListInvoker.size(this.e);
            while (true) {
                n = (n + ListInvoker.size(this.e)) % ListInvoker.size(this.e);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "r\u000eb\u0010^?\r\u0000r\n\u0011".toCharArray();
        int n2 = 0;
        int n3 = 56;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 9));
            n3 = n3;
        }
    }

    @Override
    public void h() {
        Minecraft minecraft = MCInvoker.f();
        if (minecraft.world != null && minecraft.player != null) {
            this.a(minecraft.world, minecraft.player.posX, minecraft.player.posZ, minecraft.player.rotationYaw, false, false);
        } else {
            this.a(null, 0.0, 0.0, 0.0, true, false);
        }
    }
}

