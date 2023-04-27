/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

public class K9
extends KM {
    private static String E = "CL_00001070";
    private double F;
    private double G;

    public K9(String string) {
        super(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "=$@>Yg\u0004OX(>".toCharArray();
        int n2 = 0;
        int n3 = 92;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x22));
            n3 = n3;
        }
    }

    @Override
    public void h() {
        if (!ListInvoker.isEmpty(this.e)) {
            double d;
            Minecraft minecraft = MCInvoker.f();
            double d2 = 0.0;
            if (minecraft.world != null && minecraft.player != null) {
                d2 = BlockInvoker.d(minecraft.world, 1.0f);
                if (!qq_2.d(minecraft.world.d)) {
                    d2 = MathInvoker.a();
                }
            }
            for (d = d2 - this.F; d < -0.5; d += 1.0) {
            }
            while (d >= 0.5) {
                d -= 1.0;
            }
            d = MathHelper.b(d, -1.0, 1.0);
            this.G += d * 0.1;
            this.G *= 0.8;
            this.F += this.G;
            int n = (int)((this.F + 1.0) * (double)ListInvoker.size(this.e)) % ListInvoker.size(this.e);
            while (true) {
                n = (n + ListInvoker.size(this.e)) % ListInvoker.size(this.e);
            }
        }
    }
}

