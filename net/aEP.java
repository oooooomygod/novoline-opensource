/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 */
package net;

import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.util.List;

public class aEP {
    public static List a(Ordering ordering, Iterable iterable) {
        return ordering.sortedCopy(iterable);
    }

    public static Ordering a(Comparator comparator) {
        return Ordering.from((Comparator)comparator);
    }
}

