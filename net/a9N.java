/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.qk_0;

public enum a9N {
    SUCCESS_COUNT(0, qk_0.a),
    AFFECTED_BLOCKS(1, qk_0.d),
    AFFECTED_ENTITIES(2, qk_0.f),
    AFFECTED_ITEMS(3, qk_0.h),
    QUERY_RESULT(4, qk_0.g);

    int c;
    String b;

    public static String[] a() {
        String[] stringArray = new String[a9N.values().length];
        int n = 0;
        for (a9N a9N2 : a9N.values()) {
            stringArray[n++] = a9N2.c();
        }
        return stringArray;
    }

    public static a9N a(String string) {
        for (a9N a9N2 : a9N.values()) {
            if (!a9N2.c().equals(string)) continue;
            return a9N2;
        }
        return null;
    }

    public String c() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    private a9N(int n2, String string2) {
        this.c = n2;
        this.b = string2;
    }
}

