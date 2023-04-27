/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTBase;
import java.util.concurrent.Callable;
import net.NBTTagCompound;

/*
 * Renamed from net.aDe
 */
class ade_0
implements Callable<String> {
    NBTTagCompound a;
    int b;

    public String a() throws Exception {
        return NBTBase.a[this.b];
    }

    ade_0(NBTTagCompound nBTTagCompound, int n) {
        this.a = nBTTagCompound;
        this.b = n;
    }
}

