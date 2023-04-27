/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultiset
 *  com.google.common.collect.Multiset
 *  com.google.common.collect.Multisets
 */
package net;

import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;

public class a5A {
    public static ImmutableMultiset a(Multiset multiset) {
        return Multisets.copyHighestCountFirst((Multiset)multiset);
    }
}

