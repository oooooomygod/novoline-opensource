/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTTagList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import net.ChunkCoordIntPair;
import deobf.EnumFacing;

public class aKA
extends aKU {
    private boolean f;
    private Set<ChunkCoordIntPair> e = axe_2.a();

    @Override
    public void a(ChunkCoordIntPair chunkCoordIntPair) {
        super.a(chunkCoordIntPair);
        aS0.b(this.e, chunkCoordIntPair);
    }

    @Override
    public void a(World world, Random random, HF hF) {
        if (!this.f) {
            aky_1.e(this.c);
            this.b(world, random, this.c(), this.d());
        }
        super.a(world, random, hF);
    }

    @Override
    public boolean b(ChunkCoordIntPair chunkCoordIntPair) {
        return !aS0.c(this.e, chunkCoordIntPair) && super.b(chunkCoordIntPair);
    }

    public aKA() {
    }

    public aKA(World world, Random random, int n, int n2) {
        super(n, n2);
        this.b(world, random, n, n2);
    }

    private void b(World world, Random random, int n, int n2) {
        a5_0.a(random, aV8.w(world));
        long l4 = a5_0.b(random);
        long l5 = a5_0.b(random);
        long l6 = (long)n * l4;
        long l7 = (long)n2 * l5;
        a5_0.a(random, l6 ^ l7 ^ aV8.w(world));
        int n3 = n * 16 + 8 - 29;
        int n4 = n2 * 16 + 8 - 29;
        EnumFacing enumFacing = abw_2.a(cs_1.HORIZONTAL, random);
        aky_1.a(this.c, new ZU(random, n3, n4, enumFacing));
        this.b();
        this.f = true;
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        if (tn_0.a(nBTTagCompound, aot_2.c, 9)) {
            NBTTagList nBTTagList = tn_0.c(nBTTagCompound, aot_2.e, 10);
            for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                NBTTagCompound nBTTagCompound2 = kv_0.g(nBTTagList, i);
                aS0.b(this.e, new ChunkCoordIntPair(tn_0.g(nBTTagCompound2, aot_2.g), tn_0.g(nBTTagCompound2, aot_2.d)));
            }
        }
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        NBTTagList nBTTagList = new NBTTagList();
        Iterator iterator = aS0.f(this.e);
        while (dz_0.c(iterator)) {
            ChunkCoordIntPair chunkCoordIntPair = (ChunkCoordIntPair)dz_0.b(iterator);
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            tn_0.b(nBTTagCompound2, aot_2.b, chunkCoordIntPair.b);
            tn_0.b(nBTTagCompound2, aot_2.a, chunkCoordIntPair.a);
            kv_0.a(nBTTagList, nBTTagCompound2);
        }
        tn_0.a(nBTTagCompound, aot_2.f, nBTTagList);
    }
}

