/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.Comparator;
import net.aP2;
import net.ajx_0;

/*
 * Renamed from net.pv
 */
class pv_2
implements Comparator {
    pv_2() {
    }

    public int compare(Object object, Object object2) {
        aP2.b();
        ajx_0 ajx_02 = (ajx_0)object;
        ajx_0 ajx_03 = (ajx_0)object2;
        return ajx_02.e != ajx_03.e ? ajx_02.e - ajx_03.e : (ajx_02.D != ajx_03.D ? ajx_03.D - ajx_02.D : (!ajx_02.o.equals(ajx_03.o) ? StringInvoker.i(ajx_02.o, ajx_03.o) : StringInvoker.i(ajx_02.z, ajx_03.z)));
    }
}

