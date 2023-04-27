/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.aqq_0;
import net.b_0;
import net.yl_2;

/*
 * Renamed from net.y7
 */
public class y7_0
extends yl_2 {
    @Override
    public int c() {
        return 3;
    }

    @Override
    public int a(int n) {
        return 10 * n;
    }

    @Override
    public int d(int n) {
        return this.a(n) + 30;
    }

    public y7_0(int n, ResourceLocation resourceLocation, int n2) {
        super(n, resourceLocation, n2, b_0.ARMOR_HEAD);
        this.a(aqq_0.a);
    }
}

