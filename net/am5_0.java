/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.am5
 */
public class am5_0 {
    private static int b;

    public static int b() {
        return b;
    }

    public static azh_2 b(av_1 av_12, ItemStack itemStack, Object[] objectArray) {
        return av_12.a(itemStack, objectArray);
    }

    public static void a(av_1 av_12, ItemStack itemStack, Object[] objectArray) {
        av_12.b(itemStack, objectArray);
    }

    public static List a(av_1 av_12) {
        return av_12.a();
    }

    public static av_1 c() {
        return av_1.b();
    }

    public static void b(int n) {
        b = n;
    }

    public static ItemStack b(av_1 av_12, adb_1 adb_12, World world) {
        return av_12.b(adb_12, world);
    }

    static {
        if (am5_0.d() == 0) {
            am5_0.b(123);
        }
    }

    public static ItemStack[] a(av_1 av_12, adb_1 adb_12, World world) {
        return av_12.a(adb_12, world);
    }

    public static int d() {
        am5_0.b();
        return 1;
    }

    public static void a(av_1 av_12, aiy_2 aiy_22) {
        av_12.a(aiy_22);
    }
}

