/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package deobf;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import deobf.NBTBase;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.EK;
import net.K4;
import net.NBTTagCompound;
import net.a5g_0;
import net.aD5;
import net.aDD;
import net.aDE;
import net.aDO;
import net.aL0;
import net.aph_0;
import net.atG;
import net.ayv_2;
import net.dz_0;
import net.gy_0;
import net.my_0;
import net.yq_0;
import org.apache.logging.log4j.Logger;


public class NBTTagList
extends NBTBase {
    private byte c = 0;
    private static Logger d = LogManagerInvoker.c();
    private List<NBTBase> b = my_0.c();

    public int a() {
        return ListInvoker.size(this.b);
    }

    public float e(int n) {
        if (n < ListInvoker.size(this.b)) {
            NBTBase nBTBase = (NBTBase)ListInvoker.get(this.b, n);
            return nBTBase.a() == 5 ? yq_0.a((aDD)nBTBase) : 0.0f;
        }
        return 0.0f;
    }

    @Override
    public byte a() {
        return 9;
    }

    public String d(int n) {
        if (n < ListInvoker.size(this.b)) {
            NBTBase nBTBase = (NBTBase)ListInvoker.get(this.b, n);
            return nBTBase.a() == 8 ? nBTBase.c() : nBTBase.toString();
        }
        return aph_0.d;
    }

    public void a(NBTBase nBTBase) {
        if (nBTBase.a() == 0) {
            LoggerInvoker.warn(d, aph_0.a);
        } else {
            if (this.c == 0) {
                this.c = nBTBase.a();
            } else if (this.c != nBTBase.a()) {
                LoggerInvoker.warn(d, aph_0.h);
                return;
            }
            ListInvoker.add(this.b, nBTBase);
        }
    }

    public NBTBase f(int n) {
        return n < ListInvoker.size(this.b) ? (NBTBase)ListInvoker.get(this.b, n) : new aDE();
    }

    public NBTBase g(int n) {
        return (NBTBase)ListInvoker.remove(this.b, n);
    }

    @Override
    public boolean b() {
        return ListInvoker.isEmpty(this.b);
    }

    public NBTTagCompound a(int n) {
        if (n < ListInvoker.size(this.b)) {
            NBTBase nBTBase = (NBTBase)ListInvoker.get(this.b, n);
            return nBTBase.a() == 10 ? (NBTTagCompound)nBTBase : new NBTTagCompound();
        }
        return new NBTTagCompound();
    }

    public int b() {
        return this.c;
    }

    public void a(int n, NBTBase nBTBase) {
        if (nBTBase.a() == 0) {
            LoggerInvoker.warn(d, aph_0.e);
        } else if (n < ListInvoker.size(this.b)) {
            if (this.c == 0) {
                this.c = nBTBase.a();
            } else if (this.c != nBTBase.a()) {
                LoggerInvoker.warn(d, aph_0.i);
                return;
            }
            ListInvoker.set(this.b, n, nBTBase);
        } else {
            LoggerInvoker.warn(d, aph_0.c);
        }
    }

    public double c(int n) {
        if (n < ListInvoker.size(this.b)) {
            NBTBase nBTBase = (NBTBase)ListInvoker.get(this.b, n);
            return nBTBase.a() == 6 ? EK.a((aD5)nBTBase) : 0.0;
        }
        return 0.0;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            NBTTagList nBTTagList = (NBTTagList)object;
            if (this.c == nBTTagList.c) {
                return this.b.equals(nBTTagList.b);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(aph_0.g);
        for (int i = 0; i < ListInvoker.size(this.b); ++i) {
            aL0.a(stringBuilder, ',');
            aL0.a(aL0.a(aL0.c(stringBuilder, i), ':'), ListInvoker.get(this.b, i));
        }
        return aL0.a(stringBuilder, ']').toString();
    }

    public int[] b(int n) {
        if (n < ListInvoker.size(this.b)) {
            NBTBase nBTBase = (NBTBase)ListInvoker.get(this.b, n);
            return nBTBase.a() == 11 ? ayv_2.a((aDO)nBTBase) : new int[]{};
        }
        return new int[0];
    }

    @Override
    void a(DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        a5g_0.a(gy_02, 296L);
        if (n > 512) {
            throw new RuntimeException(aph_0.f);
        }
        this.c = atG.g(dataInput);
        int n2 = atG.e(dataInput);
        if (this.c == 0) {
            throw new RuntimeException(aph_0.b);
        }
        a5g_0.a(gy_02, 32L * (long)n2);
        this.b = my_0.b(n2);
        for (int i = 0; i < n2; ++i) {
            NBTBase nBTBase = NBTBase.a(this.c);
            nBTBase.a(dataInput, n + 1, gy_02);
            ListInvoker.add(this.b, nBTBase);
        }
    }

    @Override
    public NBTBase d() {
        NBTTagList nBTTagList = new NBTTagList();
        nBTTagList.c = this.c;
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            NBTBase nBTBase = (NBTBase)dz_0.b(iterator);
            NBTBase nBTBase2 = nBTBase.d();
            ListInvoker.add(nBTTagList.b, nBTBase2);
        }
        return nBTTagList;
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        this.c = !ListInvoker.isEmpty(this.b) ? ((NBTBase)ListInvoker.get(this.b, 0)).a() : (byte)0;
        K4.a(dataOutput, this.c);
        K4.b(dataOutput, ListInvoker.size(this.b));
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            NBTBase nBTBase = (NBTBase)dz_0.b(iterator);
            nBTBase.a(dataOutput);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

