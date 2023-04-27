/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import net.minecraft.profiler.Profiler;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from net.aRv
 */
public class arv_0 {
    private static int a = 3;
    private List<atR> b = my_0.c();
    private Profiler c;
    private List<atR> d = my_0.c();
    private int e;

    private boolean a(atR atR2, atR atR3) {
        return (au7.e(atR2.b) & au7.e(atR3.b)) == 0;
    }

    public arv_0(Profiler profiler) {
        this.c = profiler;
    }

    public void a() {
        atR atR2;
        Iterator iterator;
        ProfilerInvoker.startSection(this.c, aFV.b);
        if (this.e++ % 3 == 0) {
            iterator = ListInvoker.iterator(this.b);
            while (dz_0.c(iterator)) {
                atR2 = (atR)dz_0.b(iterator);
                ListInvoker.contains(this.d, atR2);
                if (!this.a(atR2) || !au7.b(atR2.b)) continue;
                au7.c(atR2.b);
                ListInvoker.add(this.d, atR2);
            }
        } else {
            iterator = ListInvoker.iterator(this.d);
            while (dz_0.c(iterator)) {
                atR2 = (atR)dz_0.b(iterator);
                if (!this.b(atR2)) continue;
                au7.a(atR2.b);
                dz_0.a(iterator);
            }
        }
        ProfilerInvoker.endSection(this.c);
        ProfilerInvoker.startSection(this.c, aFV.a);
        iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            atR2 = (atR)dz_0.b(iterator);
            au7.g(atR2.b);
        }
        ProfilerInvoker.endSection(this.c);
    }

    private boolean b(atR atR2) {
        return !au7.d(atR2.b);
    }

    public void a(_v_0 _v_02) {
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            atR atR2 = (atR)dz_0.b(iterator);
            _v_0 _v_03 = atR2.b;
            if (_v_03 != _v_02) continue;
            if (ListInvoker.contains(this.d, atR2)) {
                au7.a(_v_03);
                ListInvoker.remove(this.d, atR2);
            }
            dz_0.a(iterator);
        }
    }

    private boolean a(atR atR2) {
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            atR atR3 = (atR)dz_0.b(iterator);
            if (atR3 == atR2 || !(atR2.a >= atR3.a ? !this.a(atR2, atR3) && ListInvoker.contains(this.d, atR3) : !au7.f(atR3.b) && ListInvoker.contains(this.d, atR3))) continue;
            return false;
        }
        return true;
    }

    public void a(int n, _v_0 _v_02) {
        ListInvoker.add(this.b, new atR(n, _v_02));
    }
}

