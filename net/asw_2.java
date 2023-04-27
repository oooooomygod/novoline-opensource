/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * Renamed from net.asw
 */
public class asw_2 {
    public static boolean a(TreeSet treeSet, Object object) {
        return treeSet.add(object);
    }

    public static Object a(TreeSet treeSet) {
        return treeSet.first();
    }

    public static boolean b(TreeSet treeSet, Object object) {
        return treeSet.remove(object);
    }

    public static int b(TreeSet treeSet) {
        return treeSet.size();
    }

    public static Iterator c(TreeSet treeSet) {
        return treeSet.iterator();
    }
}

