/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;

/*
 * Renamed from net.z6
 */
public class z6_0
extends BlockPos {
    private int n;
    private int o;
    private int p;

    public z6_0(int n, int n2, int n3) {
        super(0, 0, 0);
        this.o = n;
        this.p = n2;
        this.n = n3;
    }

    @Override
    public int a() {
        return this.o;
    }

    static int a(z6_0 z6_02, int n) {
        z6_02.p = n;
        return z6_02.p;
    }

    @Override
    public int c() {
        return this.p;
    }

    @Override
    public z6_0 a(int n, int n2, int n3) {
        this.o = n;
        this.p = n2;
        this.n = n3;
        return this;
    }

    static int c(z6_0 z6_02, int n) {
        z6_02.o = n;
        return z6_02.o;
    }

    public z6_0() {
        this(0, 0, 0);
    }

    static int b(z6_0 z6_02, int n) {
        z6_02.n = n;
        return z6_02.n;
    }

    @Override
    public int b() {
        return this.n;
    }
}

