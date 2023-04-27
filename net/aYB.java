/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import com.google.gson.JsonObject;
import net.skidunion.aP;
import net.skidunion.aj;

public class aYB {
    private static String[] b;

    static {
        if (aYB.b() == null) {
            aYB.b(new String[3]);
        }
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void a(aj aj10, aP aP10, JsonObject jsonObject) {
        aj10.a(aP10, jsonObject);
    }

    public static Long a(aj aj10) {
        return aj10.e();
    }

    public static void a(aj aj10, Long l4) {
        aj10.a(l4);
    }

    public static String[] b() {
        return b;
    }
}

