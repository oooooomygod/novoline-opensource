/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTBase;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.a5g_0;
import net.aGY;
import net.gy_0;

public class aDE
extends NBTBase {
    void a(DataOutput dataOutput) throws IOException {
    }

    @Override
    public String toString() {
        return aGY.a;
    }

    void a(DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        a5g_0.a(gy_02, 64L);
    }

    @Override
    public NBTBase d() {
        return new aDE();
    }

    @Override
    public byte a() {
        return 0;
    }
}

