/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.b_0;
import net.uz_1;
import net.yl_2;

/*
 * Renamed from net.yc
 */
public class yc_2
extends yl_2 {
    @Override
    public int d(int n) {
        return this.a(n) + 15;
    }

    @Override
    public int a(int n) {
        return n * 10;
    }

    public yc_2(int n, ResourceLocation resourceLocation, int n2) {
        super(n, resourceLocation, n2, b_0.ARMOR_FEET);
        this.a(uz_1.a);
    }

    @Override
    public int c() {
        return 3;
    }
}

