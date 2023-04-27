/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import deobf.EntityPlayer;
import java.util.List;
import net.PL;
import net.aOA;

/*
 * Renamed from net.Ye
 */
public class ye_0
implements aOA {
    private String j;

    public ye_0(String string) {
        this.j = string;
        MapInvoker.c(aOA.c, string, this);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public String a() {
        return this.j;
    }

    @Override
    public int a(List<EntityPlayer> list) {
        return 0;
    }

    @Override
    public PL b() {
        return PL.INTEGER;
    }
}

