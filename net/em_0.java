/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.concurrent.Callable;
import net.il_0;

/*
 * Renamed from net.Em
 */
class em_0
implements Callable<String> {
    il_0 a;

    em_0(il_0 il_02) {
        this.a = il_02;
    }

    public String a() throws Exception {
        return StringInvoker.a(this.a);
    }
}

