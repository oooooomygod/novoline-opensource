/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTBase;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.K4;
import net.a5g_0;
import net.aDU;
import net.aL0;
import net.atG;
import net.gy_0;
import net.lq_0;


public class aDA
extends aDU {
    private short b;

    @Override
    public byte a() {
        return 2;
    }

    public aDA() {
    }

    void a(DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        a5g_0.a(gy_02, 80L);
        this.b = atG.f(dataInput);
    }

    @Override
    public int d() {
        return this.b;
    }

    @Override
    public NBTBase d() {
        return new aDA(this.b);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            aDA aDA2 = (aDA)object;
            return this.b == aDA2.b;
        }
        return false;
    }

    @Override
    public short e() {
        return this.b;
    }

    public aDA(short s) {
        this.b = s;
    }

    @Override
    public byte b() {
        return (byte)(this.b & 0xFF);
    }

    @Override
    public long f() {
        return this.b;
    }

    @Override
    public double c() {
        return this.b;
    }

    @Override
    public String toString() {
        return aL0.a(aL0.c(aL0.a(new StringBuilder(), lq_0.b), this.b), lq_0.a).toString();
    }

    void a(DataOutput dataOutput) throws IOException {
        K4.c(dataOutput, this.b);
    }

    @Override
    public float a() {
        return this.b;
    }
}

