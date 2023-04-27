/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package net;

import com.google.common.collect.ComparisonChain;

/*
 * Renamed from net.v9
 */
public class v9_0 {
    public static ComparisonChain a(ComparisonChain comparisonChain, boolean bl, boolean bl2) {
        return comparisonChain.compareTrueFirst(bl, bl2);
    }

    public static int a(ComparisonChain comparisonChain) {
        return comparisonChain.result();
    }

    public static ComparisonChain a(ComparisonChain comparisonChain, int n, int n2) {
        return comparisonChain.compare(n, n2);
    }

    public static ComparisonChain a() {
        return ComparisonChain.start();
    }

    public static ComparisonChain a(ComparisonChain comparisonChain, Comparable comparable, Comparable comparable2) {
        return comparisonChain.compare(comparable, comparable2);
    }

    public static ComparisonChain a(ComparisonChain comparisonChain, double d, double d2) {
        return comparisonChain.compare(d, d2);
    }
}

