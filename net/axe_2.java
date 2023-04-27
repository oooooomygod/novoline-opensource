/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Renamed from net.axe
 */
public class axe_2 {
    private static boolean b;

    public static HashSet a(Object[] objectArray) {
        return Sets.newHashSet((Object[])objectArray);
    }

    public static boolean e() {
        axe_2.c();
        return true;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean c() {
        return b;
    }

    static {
        if (!axe_2.c()) {
            axe_2.b(true);
        }
    }

    public static Set d() {
        return Sets.newIdentityHashSet();
    }

    public static HashSet a(int n) {
        return Sets.newHashSetWithExpectedSize((int)n);
    }

    public static LinkedHashSet b() {
        return Sets.newLinkedHashSet();
    }

    public static HashSet a() {
        return Sets.newHashSet();
    }

    public static HashSet b(Iterable iterable) {
        return Sets.newHashSet((Iterable)iterable);
    }

    public static TreeSet a(Iterable iterable) {
        return Sets.newTreeSet((Iterable)iterable);
    }
}

