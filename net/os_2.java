/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Iterator;
import java.util.List;
import deobf.EnumFacing;

/*
 * Renamed from net.os
 */
public class os_2 {
    private List<List<a9Z>> c;
    private boolean b;
    private HL f;
    private boolean d;
    private KM e;
    private List<a9Z> a = my_0.c();

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private os_2(boolean bl, boolean bl2, HL hL) {
        this.c = my_0.b(6);
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        for (int i = 0; i < n; ++i) {
            EnumFacing cfr_ignored_0 = enumFacingArray[i];
            ListInvoker.add(this.c, my_0.c());
        }
        this.b = bl;
        this.d = bl2;
        this.f = hL;
    }

    public os_2 a(a9Z a9Z2) {
        ListInvoker.add(this.a, a9Z2);
        return this;
    }

    public os_2 a(EnumFacing enumFacing, a9Z a9Z2) {
        ListInvoker.add((List)ListInvoker.get(this.c, enumFacing.ordinal()), a9Z2);
        return this;
    }

    public os_2 a(KM kM) {
        this.e = kM;
        return this;
    }

    public os_2(JE jE, KM kM) {
        this(aND.b(jE), aND.e(jE), aND.a(jE));
        this.e = aND.f(jE);
        for (EnumFacing enumFacing : EnumFacing.values()) {
            this.a(jE, kM, enumFacing);
        }
        this.a(jE, kM);
    }

    private void a(JE jE, KM kM, EnumFacing enumFacing) {
        Iterator iterator = ListInvoker.iterator(aND.a(jE, enumFacing));
        while (dz_0.c(iterator)) {
            a9Z a9Z2 = (a9Z)dz_0.b(iterator);
            this.a(enumFacing, new a9P(a9Z2, kM));
        }
    }

    private void a(JE jE, KM kM) {
        Iterator iterator = ListInvoker.iterator(aND.d(jE));
        while (dz_0.c(iterator)) {
            a9Z a9Z2 = (a9Z)dz_0.b(iterator);
            this.a(new a9P(a9Z2, kM));
        }
    }

    public os_2(aBU aBU2) {
        this(ayl_0.e(aBU2), ayl_0.f(aBU2), ayl_0.a(aBU2));
    }

    public JE a() {
        if (this.e == null) {
            throw new RuntimeException(du_0.a);
        }
        return new aks_2(this.a, this.c, this.b, this.d, this.e, this.f);
    }
}

