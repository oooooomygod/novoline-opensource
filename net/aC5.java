/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.exception.CancelEncoderException
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.viaversion.viaversion.exception.CancelEncoderException;

public class aC5 {
    private static ListInvoker[] b;

    public static ListInvoker[] b() {
        return b;
    }

    public static CancelEncoderException a(Throwable throwable) {
        return CancelEncoderException.generate((Throwable)throwable);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (aC5.b() != null) {
            aC5.b(new ListInvoker[2]);
        }
    }
}

