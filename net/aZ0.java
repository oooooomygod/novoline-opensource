/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.Comparator;
import net.aP2;
import net.ajx_0;
import net.ys_2;

public class aZ0
implements Comparator {
    public int compare(Object object, Object object2) {
        ajx_0 ajx_02 = (ajx_0)object;
        aP2.b();
        ajx_0 ajx_03 = (ajx_0)object2;
        return ajx_02.D != ajx_03.D ? ajx_03.D - ajx_02.D : (!ys_2.a((Object)ajx_02.o, (Object)ajx_03.o) ? StringInvoker.i(ajx_02.o, ajx_03.o) : StringInvoker.i(ajx_02.z, ajx_03.z));
    }
}

