/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.P8;
import net.Xc;
import net.aoz_1;

/*
 * Renamed from net.lE
 */
public class le_0
extends IllegalArgumentException {
    public le_0(aoz_1 aoz_12, int n) {
        super(StringInvoker.a(Xc.b, new Object[]{P8.d(n), aoz_12}));
    }

    public le_0(aoz_1 aoz_12, String string) {
        super(StringInvoker.a(Xc.c, new Object[]{aoz_12, string}));
    }

    public le_0(aoz_1 aoz_12, Throwable throwable) {
        super(StringInvoker.a(Xc.a, new Object[]{aoz_12}), throwable);
    }
}

