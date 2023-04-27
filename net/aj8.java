/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.BlockPos;
import net.ChunkCoordIntPair;

public class aj8
extends ajt_0 {
    private int h = 3;
    private boolean g;
    private ChunkCoordIntPair[] k = new ChunkCoordIntPair[3];
    private List<il_0> i = my_0.c();
    private double j = 32.0;

    @Override
    protected aKU a(int n, int n2) {
        aKD aKD2 = new aKD(this.b, this.a, n, n2);
        while (aky_1.c(mc_0.a(aKD2)) || ((ze_0)aky_1.a((LinkedList)mc_0.a((aKD)aKD2), (int)0)).f == null) {
            aKD2 = new aKD(this.b, this.a, n, n2);
        }
        return aKD2;
    }

    public aj8(Map<String, String> map) {
        this();
        Iterator iterator = aS0.f(MapInvoker.b(map));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (((String)FG.b(entry)).equals(aAF.c)) {
                this.j = MathHelper.a((String)FG.a(entry), this.j, 1.0);
                continue;
            }
            if (((String)FG.b(entry)).equals(aAF.a)) {
                this.k = new ChunkCoordIntPair[MathHelper.a((String)FG.a(entry), this.k.length, 1)];
                continue;
            }
            if (!((String)FG.b(entry)).equals(aAF.b)) continue;
            this.h = MathHelper.a((String)FG.a(entry), this.h, 1);
        }
    }

    public aj8() {
        for (il_0 il_02 : hw_0.d()) {
            if (!(il_02.d > 0.0f)) continue;
            ListInvoker.add(this.i, il_02);
        }
    }

    @Override
    protected boolean b(int n, int n2) {
        if (!this.g) {
            Random object = new Random();
            a5_0.a(object, aV8.w(this.b));
            double d = a5_0.c(object) * Math.PI * 2.0;
            int chunkCoordIntPair = 1;
            for (int i = 0; i < this.k.length; ++i) {
                double d2 = (1.25 * (double)chunkCoordIntPair + a5_0.c(object)) * this.j * (double)chunkCoordIntPair;
                int n3 = (int)MathInvoker.f((double)MathHelper.b(d) * d2);
                int n4 = (int)MathInvoker.f((double)MathHelper.h(d) * d2);
                BlockPos blockPos = aqo_0.a(aV8.q(this.b), (n3 << 4) + 8, (n4 << 4) + 8, 112, this.i, object);
                n3 = amv_2.j(blockPos) >> 4;
                n4 = amv_2.i(blockPos) >> 4;
                this.k[i] = new ChunkCoordIntPair(n3, n4);
                d += Math.PI * 2 * (double)chunkCoordIntPair / (double)this.h;
                if (i != this.h) continue;
                chunkCoordIntPair += 2 + a5_0.a(object, 5);
                this.h += 1 + a5_0.a(object, 2);
            }
            this.g = true;
        }
        for (ChunkCoordIntPair chunkCoordIntPair : this.k) {
            if (n != chunkCoordIntPair.b || n2 != chunkCoordIntPair.a) continue;
            return true;
        }
        return false;
    }

    @Override
    protected List<BlockPos> a() {
        ArrayList arrayList = my_0.c();
        for (ChunkCoordIntPair chunkCoordIntPair : this.k) {
            ListInvoker.add(arrayList, aV0.a(chunkCoordIntPair, 64));
        }
        return arrayList;
    }

    @Override
    public String b() {
        return aAF.d;
    }
}

