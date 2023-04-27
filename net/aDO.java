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
import net.atG;
import net.gy_0;
import net.i1_0;


public class aDO
extends NBTBase {
    private int[] b;

    @Override
    public byte a() {
        return 11;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ a7r_0.a(this.b);
    }

    public aDO(int[] nArray) {
        this.b = nArray;
    }

    @Override
    public NBTBase d() {
        int[] nArray = new int[this.b.length];
        SystemInvoker.a(this.b, 0, nArray, 0, this.b.length);
        return new aDO(nArray);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object) && a7r_0.a(this.b, ((aDO)object).b);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    void a(DataOutput dataOutput) throws IOException {
        K4.b(dataOutput, this.b.length);
        for (int n : this.b) {
            K4.b(dataOutput, n);
        }
    }

    aDO() {
    }

    public int[] a() {
        return this.b;
    }

    void a(DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        a5g_0.a(gy_02, 192L);
        int n2 = atG.e(dataInput);
        a5g_0.a(gy_02, 32 * n2);
        this.b = new int[n2];
        for (int i = 0; i < n2; ++i) {
            this.b[i] = atG.e(dataInput);
        }
    }

    @Override
    public String toString() {
        String string = i1_0.c;
        for (int n : this.b) {
            string = aL0.a(aL0.c(aL0.a(new StringBuilder(), string), n), i1_0.a).toString();
        }
        return aL0.a(aL0.a(new StringBuilder(), string), i1_0.b).toString();
    }
}

