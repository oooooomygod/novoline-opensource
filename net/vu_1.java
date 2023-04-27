/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import java.util.Iterator;
import java.util.Map;
import net.FG;
import net.a68;
import net.a9j_0;
import net.aS0;
import net.ac2;
import net.ad__0;
import net.akc_2;
import net.dz_0;
import net.ki_0;

/*
 * Renamed from net.vu
 */
public class vu_1 {
    private T a;
    a9j_0 b;

    private static a68 a(a68 a682) {
        return a682;
    }

    public T a(ad__0 ad__02) throws a68 {
        a68.b();
        Iterator iterator = aS0.f(MapInvoker.b(a9j_0.a(this.b)));
        if (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            ad__0 ad__03 = ki_0.a(ad__02, new Object[]{FG.b(entry)});
            ac2.b((akc_2)FG.a(entry), this.a, ad__03);
        }
        return this.a;
    }

    public T a() {
        return this.a;
    }

    public void b(ad__0 ad__02) throws a68 {
        a68.b();
        Iterator iterator = aS0.f(MapInvoker.b(a9j_0.a(this.b)));
        if (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            ad__0 ad__03 = ki_0.a(ad__02, new Object[]{FG.b(entry)});
            ac2.a((akc_2)FG.a(entry), this.a, ad__03);
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    protected vu_1(a9j_0 a9j_02, Object object) {
        this.b = a9j_02;
        this.a = object;
    }
}

