/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.NBTBase;
import java.util.Iterator;
import java.util.List;
import net.NBTTagCompound;
import net.at8;
import net.az3_0;
import net.dz_0;
import net.my_0;
import net.tn_0;

class atX
extends at8 {
    protected List<at8> b = my_0.c();

    public atX(String string) {
        this.a = string;
    }

    @Override
    public NBTBase a() throws az3_0 {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            at8 at82 = (at8)dz_0.b(iterator);
            tn_0.a(nBTTagCompound, at82.a, at82.a());
        }
        return nBTTagCompound;
    }
}

