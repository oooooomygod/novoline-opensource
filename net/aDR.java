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
import net.aQB;
import net.atG;
import net.gy_0;


public class aDR
extends aDU {
    private long b;

    @Override
    public int d() {
        return (int)this.b;
    }

    @Override
    public byte b() {
        return (byte)(this.b & 0xFFL);
    }

    @Override
    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), aQB.a), this.b), aQB.b).toString();
    }

    aDR() {
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            aDR aDR2 = (aDR)object;
            return this.b == aDR2.b;
        }
        return false;
    }

    @Override
    public byte a() {
        return 4;
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
    public NBTBase d() {
        return new aDR(this.b);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ (int)(this.b ^ this.b >>> 32);
    }

    @Override
    public short e() {
        return (short)(this.b & 0xFFFFL);
    }

    @Override
    public float a() {
        return this.b;
    }

    void a(DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        a5g_0.a(gy_02, 128L);
        this.b = atG.c(dataInput);
    }

    public aDR(long l4) {
        this.b = l4;
    }

    void a(DataOutput dataOutput) throws IOException {
        K4.a(dataOutput, this.b);
    }
}

