/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.SystemInvoker;
import deobf.NBTBase;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.K4;
import net.a5g_0;
import net.a7r_0;
import net.aL0;
import net.aST;
import net.atG;
import net.gy_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aDh
 */
public class adh_0
extends NBTBase {
    private byte[] b;

    @Override
    public byte a() {
        return 7;
    }

    public byte[] a() {
        return this.b;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object) && a7r_0.a(this.b, ((adh_0)object).b);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ a7r_0.a(this.b);
    }

    public adh_0(byte[] byArray) {
        this.b = byArray;
    }

    void a(DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        a5g_0.a(gy_02, 192L);
        int n2 = atG.e(dataInput);
        a5g_0.a(gy_02, 8 * n2);
        this.b = new byte[n2];
        atG.a(dataInput, this.b);
    }

    @Override
    public String toString() {
        return aL0.a(aL0.c(aL0.a(new StringBuilder(), aST.b), this.b.length), aST.a).toString();
    }

    void a(DataOutput dataOutput) throws IOException {
        K4.b(dataOutput, this.b.length);
        K4.a(dataOutput, this.b);
    }

    @Override
    public NBTBase d() {
        byte[] byArray = new byte[this.b.length];
        SystemInvoker.a(this.b, 0, byArray, 0, this.b.length);
        return new adh_0(byArray);
    }

    adh_0() {
    }
}

