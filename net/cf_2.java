/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.init.Blocks;

/*
 * Renamed from net.cf
 */
public class cf_2
extends cp_1 {
    protected i7_0 M = new ih_1(Blocks.H);

    @Override
    protected void a(il_0 il_02) {
        this.a();
        if (a5_0.a(this.g, 5) == 0) {
            int n = a5_0.a(this.g, 16) + 8;
            int n2 = a5_0.a(this.g, 16) + 8;
            aFI.a(this.M, this.z, this.g, aV8.a(this.z, amv_2.a(this.m, n, 0, n2)));
        }
        if (amv_2.j(this.m) == 0 && amv_2.i(this.m) == 0) {
            ns_2 ns_22 = new ns_2(this.z);
            CH.a(ns_22, 0.0, 128.0, 0.0, a5_0.e(this.g) * 360.0f, 0.0f);
            aV8.b(this.z, ns_22);
        }
    }
}

