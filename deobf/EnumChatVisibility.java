/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import net.aDV;

public enum EnumChatVisibility {
    FULL(0, aDV.c),
    SYSTEM(1, aDV.e),
    HIDDEN(2, aDV.b);

    private int d;
    private static EnumChatVisibility[] b;
    private String a;

    public String b() {
        return this.a;
    }

    public static EnumChatVisibility a(int n) {
        return b[n % b.length];
    }

    private EnumChatVisibility(int n2, String string2) {
        this.d = n2;
        this.a = string2;
    }

    public int a() {
        return this.d;
    }

    static {
        b = new EnumChatVisibility[EnumChatVisibility.values().length];
        EnumChatVisibility[] enumChatVisibilityArray = EnumChatVisibility.values();
        int n = enumChatVisibilityArray.length;
        for (int i = 0; i < n; ++i) {
            EnumChatVisibility enumChatVisibility;
            EnumChatVisibility.b[enumChatVisibility.d] = enumChatVisibility = enumChatVisibilityArray[i];
        }
    }
}

