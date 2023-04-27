/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTTagList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import net.ChunkCoordIntPair;
import net.HF;
import net.NBTTagCompound;
import net.World;
import net.Y_;
import net.a5_0;
import net.aN2;
import net.aV8;
import net.aky_1;
import net.any_2;
import net.aqu_2;
import net.azx_1;
import net.dz_0;
import net.kv_0;
import net.tn_0;

public abstract class aKU {
    private int b;
    private int a;
    protected HF d;
    protected LinkedList<Y_> c = new LinkedList();

    public HF a() {
        return this.d;
    }

    public void a(World world, Random random, HF hF) {
        Iterator iterator = aky_1.f(this.c);
        while (dz_0.c(iterator)) {
            Y_ y_ = (Y_)dz_0.b(iterator);
            if (!aqu_2.b(y_.d(), hF) || any_2.a(y_, world, random, hF)) continue;
            dz_0.a(iterator);
        }
    }

    public void a(ChunkCoordIntPair chunkCoordIntPair) {
    }

    public aKU(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public void b(NBTTagCompound nBTTagCompound) {
    }

    protected void a(World world, Random random, int n, int n2) {
        int n3 = n2 - n + 1 - aqu_2.c(this.d);
        int n4 = 1;
        n4 = n3 > 1 ? n + a5_0.a(random, n3) : n;
        int n5 = n4 - this.d.c;
        aqu_2.a(this.d, 0, n5, 0);
        Iterator iterator = aky_1.f(this.c);
        while (dz_0.c(iterator)) {
            Y_ y_ = (Y_)dz_0.b(iterator);
            any_2.a(y_, 0, n5, 0);
        }
    }

    public boolean b(ChunkCoordIntPair chunkCoordIntPair) {
        return true;
    }

    public int d() {
        return this.b;
    }

    public aKU() {
    }

    public void a(World world, NBTTagCompound nBTTagCompound) {
        this.a = tn_0.g(nBTTagCompound, aN2.d);
        this.b = tn_0.g(nBTTagCompound, aN2.a);
        if (tn_0.b(nBTTagCompound, aN2.g)) {
            this.d = new HF(tn_0.i(nBTTagCompound, aN2.e));
        }
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, aN2.i, 10);
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            aky_1.a(this.c, azx_1.a(kv_0.g(nBTTagList, i), world));
        }
        this.a(nBTTagCompound);
    }

    public LinkedList<Y_> e() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public NBTTagCompound a(int n, int n2) {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        tn_0.a(nBTTagCompound, aN2.f, azx_1.a(this));
        tn_0.b(nBTTagCompound, aN2.h, n);
        tn_0.b(nBTTagCompound, aN2.b, n2);
        tn_0.a(nBTTagCompound, aN2.j, aqu_2.a(this.d));
        NBTTagList nBTTagList = new NBTTagList();
        Iterator iterator = aky_1.f(this.c);
        while (dz_0.c(iterator)) {
            Y_ y_ = (Y_)dz_0.b(iterator);
            kv_0.a(nBTTagList, any_2.b(y_));
        }
        tn_0.a(nBTTagCompound, aN2.c, nBTTagList);
        this.b(nBTTagCompound);
        return nBTTagCompound;
    }

    protected void b() {
        this.d = aqu_2.a();
        Iterator iterator = aky_1.f(this.c);
        while (dz_0.c(iterator)) {
            Y_ y_ = (Y_)dz_0.b(iterator);
            aqu_2.a(this.d, y_.d());
        }
    }

    public boolean f() {
        return true;
    }

    protected void a(World world, Random random, int n) {
        int n2 = aV8.c(world) - n;
        int n3 = aqu_2.c(this.d) + 1;
        if (n3 < n2) {
            n3 += a5_0.a(random, n2 - n3);
        }
        int n4 = n3 - this.d.a;
        aqu_2.a(this.d, 0, n4, 0);
        Iterator iterator = aky_1.f(this.c);
        while (dz_0.c(iterator)) {
            Y_ y_ = (Y_)dz_0.b(iterator);
            any_2.a(y_, 0, n4, 0);
        }
    }

    public void a(NBTTagCompound nBTTagCompound) {
    }
}

