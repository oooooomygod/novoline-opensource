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
import net.agb_0;
import net.atG;
import net.gy_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aDa
 */
public class ada_0
extends aDU {
    private int b;

    @Override
    public short e() {
        return (short)(this.b & 0xFFFF);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b;
    }

    @Override
    public NBTBase d() {
        return new ada_0(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            ada_0 ada_02 = (ada_0)object;
            return this.b == ada_02.b;
        }
        return false;
    }

    @Override
    public byte a() {
        return 3;
    }

    @Override
    public long f() {
        return this.b;
    }

    @Override
    public String toString() {
        return aL0.c(aL0.a(new StringBuilder(), agb_0.a), this.b).toString();
    }

    @Override
    public double c() {
        return this.b;
    }

    ada_0() {
    }

    public ada_0(int n) {
        this.b = n;
    }

    @Override
    public float a() {
        return this.b;
    }

    void a(DataOutput dataOutput) throws IOException {
        K4.b(dataOutput, this.b);
    }

    @Override
    public byte b() {
        return (byte)(this.b & 0xFF);
    }

    void a(DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        a5g_0.a(gy_02, 96L);
        this.b = atG.e(dataInput);
    }

    @Override
    public int d() {
        return this.b;
    }
}

