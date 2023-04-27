/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
package net;

import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from net.aoe
 */
public class aoe_2 {
    public static Object[] c(Object[] objectArray) {
        return ArrayUtils.clone((Object[])objectArray);
    }

    public static boolean c(Object[] objectArray, Object object) {
        return ArrayUtils.contains((Object[])objectArray, (Object)object);
    }

    public static int a(Object[] objectArray, Object object) {
        return ArrayUtils.indexOf((Object[])objectArray, (Object)object);
    }

    public static Object[] b(Object[] objectArray, Object object) {
        return ArrayUtils.add((Object[])objectArray, (Object)object);
    }

    public static Object[] a(Object[] objectArray, Object[] objectArray2) {
        return ArrayUtils.addAll((Object[])objectArray, (Object[])objectArray2);
    }

    public static Object[] a(Object[] objectArray, int n, Object object) {
        return ArrayUtils.add((Object[])objectArray, (int)n, (Object)object);
    }

    public static boolean a(Object[] objectArray) {
        return ArrayUtils.isEmpty((Object[])objectArray);
    }

    public static Object[] a(Object[] objectArray, int n, int n2) {
        return ArrayUtils.subarray((Object[])objectArray, (int)n, (int)n2);
    }

    public static boolean b(Object[] objectArray) {
        return ArrayUtils.isNotEmpty((Object[])objectArray);
    }
}

