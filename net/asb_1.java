/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import deobf.EntityPlayer;
import java.util.List;
import net.PL;
import net.aL0;
import net.aOA;
import net.anw_0;
import net.tc_0;

/*
 * Renamed from net.asb
 */
public class asb_1
implements aOA {
    private String j;

    @Override
    public PL b() {
        return PL.INTEGER;
    }

    public asb_1(String string, anw_0 anw_02) {
        this.j = aL0.a(aL0.a(new StringBuilder(), string), tc_0.b(anw_02)).toString();
        MapInvoker.c(aOA.c, this.j, this);
    }

    @Override
    public int a(List<EntityPlayer> list) {
        return 0;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public String a() {
        return this.j;
    }
}

