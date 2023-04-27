/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.NBTBase;
import deobf.NBTTagList;
import java.util.Iterator;
import java.util.List;
import net.at8;
import net.az3_0;
import net.dz_0;
import net.kv_0;
import net.my_0;

class atS
extends at8 {
    protected List<at8> b = my_0.c();

    public atS(String string) {
        this.a = string;
    }

    @Override
    public NBTBase a() throws az3_0 {
        NBTTagList nBTTagList = new NBTTagList();
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            at8 at82 = (at8)dz_0.b(iterator);
            kv_0.a(nBTTagList, at82.a());
        }
        return nBTTagList;
    }
}

