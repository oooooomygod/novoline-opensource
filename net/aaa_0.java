/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.Comparator;
import net.QU;

/*
 * Renamed from net.aAa
 */
class aaa_0
implements Comparator<QU> {
    public int a(QU qU, QU qU2) {
        return qU.a() > qU2.a() ? 1 : (qU.a() < qU2.a() ? -1 : StringInvoker.h(qU2.d(), qU.d()));
    }

    aaa_0() {
    }
}

