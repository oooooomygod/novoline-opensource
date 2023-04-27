/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.FG;
import net.P8;
import net.PC;
import net.a7r_0;
import net.aQW;
import net.aS0;
import net.aU6;
import net.ad__0;
import net.af3_0;
import net.aha_0;
import net.azu_1;
import net.ck_1;
import net.dz_0;
import net.ki_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.af7
 */
class af7_0
extends af3_0 {
    private ThreadLocal<ck_1> c = aQW.a(ck_1::new);
    private Map<Object[], PC> e;
    private aha_0 d;

    af7_0(Map<Object[], PC> map, aha_0 aha_02) {
        this.e = map;
        this.d = aha_02;
    }

    @Override
    public void a(@NonNull ad__0 ad__02) {
        af3_0.b();
        Iterator iterator = aS0.f(MapInvoker.b(this.e));
        if (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            this.a(ad__02, (Object[])FG.b(entry), 0, ad__02, (PC)FG.a(entry));
        }
    }

    private void a(ad__0 ad__02, Object[] objectArray, int n, ad__0 ad__03, PC pC) {
        af3_0.b();
        int n2 = n;
        if (n2 < objectArray.length) {
            if (objectArray[n2] == a) {
                Object object;
                if (ki_0.q(ad__03)) {
                    int n3 = 0;
                    object = ki_0.h(ad__03);
                    if (n3 < ListInvoker.size((List)object)) {
                        objectArray[n2] = P8.d(n3);
                        this.a(ad__02, objectArray, n2 + 1, (ad__0)ListInvoker.get((List)object, n3), pC);
                        ++n3;
                    }
                    objectArray[n2] = a;
                }
                if (ki_0.i(ad__03)) {
                    object = aS0.f(MapInvoker.b(ki_0.g(ad__03)));
                    if (dz_0.c((Iterator)object)) {
                        Map.Entry entry = (Map.Entry)dz_0.b((Iterator)object);
                        objectArray[n2] = FG.b(entry);
                        this.a(ad__02, objectArray, n2 + 1, (ad__0)FG.a(entry), pC);
                    }
                    objectArray[n2] = a;
                }
                return;
            }
            if (ki_0.p(ad__03 = ki_0.a(ad__03, new Object[]{objectArray[n2]}))) {
                return;
            }
            ++n2;
        }
        ck_1 ck_12 = (ck_1)aQW.a(this.c);
        ck_12.a = objectArray;
        Object[] objectArray2 = aU6.a(pC, ck_12, ad__03);
        if (objectArray2 != null && !a7r_0.a(objectArray, objectArray2)) {
            azu_1.a(this.d, ad__03, ki_0.a(ad__02, objectArray2));
            ki_0.a(ad__03, null);
        }
    }
}

