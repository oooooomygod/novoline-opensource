/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import deobf.NBTBase;
import java.util.concurrent.Callable;
import net.NBTTagCompound;

class V5
implements Callable<String> {
    NBTTagCompound a;
    String b;

    V5(NBTTagCompound nBTTagCompound, String string) {
        this.a = nBTTagCompound;
        this.b = string;
    }

    public String a() throws Exception {
        return NBTBase.a[((NBTBase)MapInvoker.c(NBTTagCompound.b(this.a), this.b)).a()];
    }
}

