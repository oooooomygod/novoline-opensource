/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import deobf.Entity;
import java.util.List;
import net.CG;
import net.N8;
import net.my_0;
import net.nl_1;

/*
 * Renamed from net.anA
 */
public class ana_1 {
    List<Entity> c = my_0.c();
    List<Entity> b = my_0.c();
    nl_1 a;

    public boolean a(Entity entity) {
        if (ListInvoker.contains(this.c, entity)) {
            return true;
        }
        if (ListInvoker.contains(this.b, entity)) {
            return false;
        }
        ProfilerInvoker.startSection(this.a.worldObj.A, N8.a);
        boolean bl = CG.b(this.a, entity);
        ProfilerInvoker.endSection(this.a.worldObj.A);
        ListInvoker.add(this.c, entity);
        return bl;
    }

    public void a() {
        ListInvoker.clear(this.c);
        ListInvoker.clear(this.b);
    }

    public ana_1(nl_1 nl_12) {
        this.a = nl_12;
    }
}

