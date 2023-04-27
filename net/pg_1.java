/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import com.google.gson.JsonObject;
import net.aZN;

/*
 * Renamed from net.pG
 */
public class pg_1 {
    private static boolean b;

    public static aZN a(aZN aZN2, JsonObject jsonObject) {
        return aZN2.a(jsonObject);
    }

    public static void a(aZN aZN2) {
        aZN2.b();
    }

    public static boolean c() {
        pg_1.b();
        return true;
    }

    public static JsonObject b(aZN aZN2) {
        return aZN2.a();
    }

    public static boolean b() {
        return b;
    }

    static {
        if (!pg_1.b()) {
            pg_1.b(true);
        }
    }

    public static void b(boolean bl) {
        b = bl;
    }
}

