/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import deobf.NBTBase;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.K4;
import net.a5g_0;
import net.aL0;
import net.atG;
import net.gy_0;
import net.ye_2;

public class NBTTagString
extends NBTBase {
    private String b;

    @Override
    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), ye_2.b), StringInvoker.a(this.b, (CharSequence)ye_2.d, (CharSequence)ye_2.f)), ye_2.a).toString();
    }

    @Override
    public String c() {
        return this.b;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    void a(DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        a5g_0.a(gy_02, 288L);
        this.b = atG.b(dataInput);
        a5g_0.a(gy_02, 16 * StringInvoker.c(this.b));
    }

    public NBTTagString() {
        this.b = ye_2.c;
    }

    @Override
    public NBTBase d() {
        return new NBTTagString(this.b);
    }

    void a(DataOutput dataOutput) throws IOException {
        K4.a(dataOutput, this.b);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b.hashCode();
    }

    @Override
    public byte a() {
        return 8;
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }
        NBTTagString nBTTagString = (NBTTagString)object;
        return this.b == null && nBTTagString.b == null || this.b != null && this.b.equals(nBTTagString.b);
    }

    public NBTTagString(String string) {
        this.b = string;
        throw new IllegalArgumentException(ye_2.e);
    }

    @Override
    public boolean b() {
        return StringInvoker.g(this.b);
    }
}

