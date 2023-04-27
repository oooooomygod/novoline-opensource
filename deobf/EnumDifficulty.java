/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import net.azj_1;

public enum EnumDifficulty {
    PEACEFUL(0, azj_1.b),
    EASY(1, azj_1.f),
    NORMAL(2, azj_1.g),
    HARD(3, azj_1.d);

    private String d;
    private static EnumDifficulty[] b;
    private int c;

    public int b() {
        return this.c;
    }

    public String a() {
        return this.d;
    }

    private EnumDifficulty(int n2, String string2) {
        this.c = n2;
        this.d = string2;
    }

    public static EnumDifficulty a(int n) {
        return b[n % b.length];
    }

    static {
        b = new EnumDifficulty[EnumDifficulty.values().length];
        EnumDifficulty[] enumDifficultyArray = EnumDifficulty.values();
        int n = enumDifficultyArray.length;
        for (int i = 0; i < n; ++i) {
            EnumDifficulty enumDifficulty;
            EnumDifficulty.b[enumDifficulty.c] = enumDifficulty = enumDifficultyArray[i];
        }
    }
}

