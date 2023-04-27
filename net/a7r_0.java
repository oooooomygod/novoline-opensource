/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/*
 * Renamed from net.a7r
 */
public class a7r_0 {
    private static ListInvoker[] b;

    public static void a(Object[] objectArray, Comparator comparator) {
        Arrays.sort(objectArray, comparator);
    }

    public static Object[] a(Object[] objectArray, int n, Class clazz) {
        return Arrays.copyOf(objectArray, n, clazz);
    }

    public static List a(Object[] objectArray) {
        return Arrays.asList(objectArray);
    }

    public static void a(boolean[] blArray, boolean bl) {
        Arrays.fill(blArray, bl);
    }

    public static int c(int[] nArray, int n) {
        return Arrays.binarySearch(nArray, n);
    }

    public static boolean a(int[] nArray, int[] nArray2) {
        return Arrays.equals(nArray, nArray2);
    }

    public static int a(byte[] byArray) {
        return Arrays.hashCode(byArray);
    }

    public static void a(int[] nArray, int n) {
        Arrays.fill(nArray, n);
    }

    public static void a(boolean[] blArray, int n, int n2, boolean bl) {
        Arrays.fill(blArray, n, n2, bl);
    }

    public static void a(float[] fArray, float f) {
        Arrays.fill(fArray, f);
    }

    public static boolean a(byte[] byArray, byte[] byArray2) {
        return Arrays.equals(byArray, byArray2);
    }

    public static void a(int[] nArray, int n, int n2, int n3) {
        Arrays.fill(nArray, n, n2, n3);
    }

    public static Object[] a(Object[] objectArray, int n, int n2) {
        return Arrays.copyOfRange(objectArray, n, n2);
    }

    public static Stream e(Object[] objectArray) {
        return Arrays.stream(objectArray);
    }

    public static void a(byte[] byArray, byte by) {
        Arrays.fill(byArray, by);
    }

    public static void a(Object[] objectArray, int n, int n2, Object object) {
        Arrays.fill(objectArray, n, n2, object);
    }

    public static boolean a(float[] fArray, float[] fArray2) {
        return Arrays.equals(fArray, fArray2);
    }

    public static Object[] a(Object[] objectArray, int n) {
        return Arrays.copyOf(objectArray, n);
    }

    public static boolean a(Object[] objectArray, Object[] objectArray2) {
        return Arrays.equals(objectArray, objectArray2);
    }

    public static String b(Object[] objectArray) {
        return Arrays.toString(objectArray);
    }

    public static int[] b(int[] nArray, int n) {
        return Arrays.copyOf(nArray, n);
    }

    public static boolean a(boolean[] blArray, boolean[] blArray2) {
        return Arrays.equals(blArray, blArray2);
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(Object[] objectArray, Object object) {
        Arrays.fill(objectArray, object);
    }

    public static void a(float[] fArray, int n, int n2, float f) {
        Arrays.fill(fArray, n, n2, f);
    }

    public static void d(Object[] objectArray) {
        Arrays.sort(objectArray);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (a7r_0.b() == null) {
            a7r_0.b(new ListInvoker[3]);
        }
    }

    public static int a(Object[] objectArray, Object object) {
        return Arrays.binarySearch(objectArray, object);
    }

    public static int a(int[] nArray) {
        return Arrays.hashCode(nArray);
    }

    public static int c(Object[] objectArray) {
        return Arrays.hashCode(objectArray);
    }
}

