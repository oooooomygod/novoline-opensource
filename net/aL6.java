/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashFunction
 *  com.google.common.hash.Hashing
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class aL6 {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    static {
        if (aL6.b() != null) {
            aL6.b(new ListInvoker[5]);
        }
    }

    public static HashFunction c() {
        return Hashing.sha1();
    }
}

