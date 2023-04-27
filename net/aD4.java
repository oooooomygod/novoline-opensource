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
import net.aud_1;
import net.gy_0;


public class aD4
extends aDU {
    private byte b;

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            aD4 aD42 = (aD4)object;
            return this.b == aD42.b;
        }
        return false;
    }

    @Override
    public float a() {
        return this.b;
    }

    @Override
    public byte b() {
        return this.b;
    }

    @Override
    public short e() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b;
    }

    aD4() {
    }

    @Override
    public byte a() {
        return 1;
    }

    @Override
    public double c() {
        return this.b;
    }

    void a(DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        a5g_0.a(gy_02, 72L);
        this.b = atG.g(dataInput);
    }

    @Override
    public NBTBase d() {
        return new aD4(this.b);
    }

    @Override
    public int d() {
        return this.b;
    }

    void a(DataOutput dataOutput) throws IOException {
        K4.a(dataOutput, this.b);
    }

    @Override
    public long f() {
        return this.b;
    }

    @Override
    public String toString() {
        return aL0.a(aL0.c(aL0.a(new StringBuilder(), aud_1.b), this.b), aud_1.a).toString();
    }

    public aD4(byte by) {
        this.b = by;
    }
}

