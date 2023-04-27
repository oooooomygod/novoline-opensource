/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multiset
 */
package net;

import com.google.common.collect.Multiset;

public class JO {
    public static boolean a(Multiset multiset, Object object) {
        return multiset.add(object);
    }

    public static int a(Multiset multiset, Object object, int n) {
        return multiset.add(object, n);
    }
}

