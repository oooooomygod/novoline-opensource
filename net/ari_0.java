/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import java.util.Map;
import java.util.Set;
import net.AttributeModifier;
import net.Potion;
import net.VO;
import net.a2l_0;

/*
 * Renamed from net.aRi
 */
public class ari_0 {
    private static int[] b;

    public static int[] b() {
        return b;
    }

    public static boolean b(Potion potion) {
        return potion.j();
    }

    public static double a(Potion potion, int n, AttributeModifier attributeModifier) {
        return potion.a(n, attributeModifier);
    }

    public static double j(Potion potion) {
        return potion.g();
    }

    public static int i(Potion potion) {
        return potion.d();
    }

    public static void a(Potion potion, Entity entity, Entity entity2, EntityLivingBase entityLivingBase, int n, double d) {
        potion.a(entity, entity2, entityLivingBase, n, d);
    }

    public static int f(Potion potion) {
        return potion.a();
    }

    public static boolean e(Potion potion) {
        return potion.k();
    }

    public static Map a(Potion potion) {
        return potion.i();
    }

    public static String a(a2l_0 a2l_02) {
        return Potion.a(a2l_02);
    }

    public static int c(Potion potion) {
        return potion.e();
    }

    public static void a(Potion potion, EntityLivingBase entityLivingBase, int n) {
        potion.a(entityLivingBase, n);
    }

    public static Potion a(String string) {
        return Potion.b(string);
    }

    public static boolean h(Potion potion) {
        return potion.c();
    }

    static {
        if (ari_0.b() != null) {
            ari_0.b(new int[2]);
        }
    }

    public static void a(Potion potion, EntityLivingBase entityLivingBase, VO vO, int n) {
        potion.b(entityLivingBase, vO, n);
    }

    public static String d(Potion potion) {
        return potion.h();
    }

    public static boolean g(Potion potion) {
        return potion.b();
    }

    public static Set c() {
        return Potion.f();
    }

    public static void b(Potion potion, EntityLivingBase entityLivingBase, VO vO, int n) {
        potion.a(entityLivingBase, vO, n);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static boolean a(Potion potion, int n, int n2) {
        return potion.b(n, n2);
    }
}

