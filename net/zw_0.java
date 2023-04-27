/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.Zw
 */
public class zw_0
extends ZC {
    public int k;
    public ct_2 h;
    public List<aDW> g;
    public aDW j;
    public boolean m;
    public List<Y_> i = my_0.c();
    public List<Y_> l = my_0.c();

    public zw_0(ct_2 ct_22, int n, Random random, int n2, int n3, List<aDW> list, int n4) {
        super(null, 0, random, n2, n3);
        this.h = ct_22;
        this.g = list;
        this.k = n4;
        il_0 il_02 = aqo_0.a(ct_22, new BlockPos(n2, 0, n3), il_0.as);
        this.m = il_02 == il_0.V || il_02 == il_0.c;
        this.a(this.m);
    }

    public ct_2 a() {
        return this.h;
    }

    public zw_0() {
    }
}

