/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.NBTBase;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.K4;
import net.MathHelper;
import net.a5g_0;
import net.aDU;
import net.aL0;
import net.afl_1;
import net.atG;
import net.db_0;
import net.gy_0;


public class aD5
extends aDU {
    private double b;

    @Override
    public NBTBase d() {
        return new aD5(this.b);
    }

    aD5() {
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            aD5 aD52 = (aD5)object;
            return this.b == aD52.b;
        }
        return false;
    }

    @Override
    public long f() {
        return (long)MathInvoker.n(this.b);
    }

    void a(DataOutput dataOutput) throws IOException {
        K4.a(dataOutput, this.b);
    }

    @Override
    public float a() {
        return (float)this.b;
    }

    @Override
    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), afl_1.a), this.b), afl_1.b).toString();
    }

    @Override
    public double c() {
        return this.b;
    }

    @Override
    public byte a() {
        return 6;
    }

    @Override
    public short e() {
        return (short)(MathHelper.floor_double(this.b) & 0xFFFF);
    }

    @Override
    public int d() {
        return MathHelper.floor_double(this.b);
    }

    void a(DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        a5g_0.a(gy_02, 128L);
        this.b = atG.a(dataInput);
    }

    @Override
    public byte b() {
        return (byte)(MathHelper.floor_double(this.b) & 0xFF);
    }

    @Override
    public int hashCode() {
        long l4 = db_0.d(this.b);
        return super.hashCode() ^ (int)(l4 ^ l4 >>> 32);
    }

    public aD5(double d) {
        this.b = d;
    }
}

