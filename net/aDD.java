/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTBase;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.DI;
import net.K4;
import net.MathHelper;
import net.a5g_0;
import net.aDU;
import net.aL0;
import net.atG;
import net.axx_1;
import net.gy_0;


public class aDD
extends aDU {
    private float b;

    @Override
    public byte b() {
        return (byte)(MathHelper.f(this.b) & 0xFF);
    }

    @Override
    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), DI.b), this.b), DI.a).toString();
    }

    void a(DataOutput dataOutput) throws IOException {
        K4.a(dataOutput, this.b);
    }

    @Override
    public NBTBase d() {
        return new aDD(this.b);
    }

    aDD() {
    }

    @Override
    public double c() {
        return this.b;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            aDD aDD2 = (aDD)object;
            return this.b == aDD2.b;
        }
        return false;
    }

    @Override
    public float a() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ axx_1.b(this.b);
    }

    @Override
    public long f() {
        return (long)this.b;
    }

    void a(DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        a5g_0.a(gy_02, 96L);
        this.b = atG.d(dataInput);
    }

    public aDD(float f) {
        this.b = f;
    }

    @Override
    public short e() {
        return (short)(MathHelper.f(this.b) & 0xFFFF);
    }

    @Override
    public byte a() {
        return 5;
    }

    @Override
    public int d() {
        return MathHelper.f(this.b);
    }
}

