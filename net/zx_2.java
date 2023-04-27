/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.internal.Intrinsics
 */
package net;

import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from net.zx
 */
public class zx_2 {
    private static String[] b;

    public static boolean a(Object object, Object object2) {
        return Intrinsics.areEqual((Object)object, (Object)object2);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void a(Object object, String string) {
        Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)string);
    }

    public static void a(int n, String string) {
        Intrinsics.reifiedOperationMarker((int)n, (String)string);
    }

    public static void b(Object object, String string) {
        Intrinsics.checkParameterIsNotNull((Object)object, (String)string);
    }

    public static void a(String string) {
        Intrinsics.throwUninitializedPropertyAccessException((String)string);
    }

    public static void c() {
        Intrinsics.throwNpe();
    }

    static {
        if (zx_2.b() == null) {
            zx_2.b(new String[4]);
        }
    }

    public static String[] b() {
        return b;
    }
}

