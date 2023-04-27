/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import java.util.Map;
import java.util.Random;
import net.FJ;
import net.MathHelper;
import net.a5_0;
import net.aL0;
import net.aLE;
import net.ab9_0;
import net.apc_0;
import net.asz_0;
import net.co_0;
import net.jc_0;
import net.kl_1;
import net.zl_2;


public class EnumFacing
extends Enum<EnumFacing>
implements ab9_0 {
    private static EnumFacing[] c;
    public static /* enum */ EnumFacing EAST;
    public static /* enum */ EnumFacing UP;
    private kl_1 f;
    private static EnumFacing[] a;
    private String h;
    private static Map i;
    private int d;
    private int g;
    private int e;
    public static /* enum */ EnumFacing WEST;
    private static String b;
    public static /* enum */ EnumFacing NORTH;
    public static /* enum */ EnumFacing DOWN;
    public static EnumFacing[] VALUES;
    public static /* enum */ EnumFacing SOUTH;
    private static EnumFacing[] l;
    private asz_0 k;
    private zl_2 j;

    public static EnumFacing valueOf(String string) {
        return (EnumFacing)jc_0.a(EnumFacing.class, string);
    }

    public int h() {
        return this.f == kl_1.X ? apc_0.a(this.k) : 0;
    }

    public asz_0 a() {
        return this.k;
    }

    @Override
    public String a() {
        return this.h;
    }

    public EnumFacing j() {
        switch (aLE.c[this.ordinal()]) {
            case 1: {
                return WEST;
            }
            case 2: {
                return NORTH;
            }
            case 3: {
                return EAST;
            }
            case 4: {
                return SOUTH;
            }
        }
        throw new IllegalStateException(aL0.a(aL0.a(new StringBuilder(), co_0.d), this).toString());
    }

    public zl_2 n() {
        return this.j;
    }

    private EnumFacing(String string2, int n2, int n3, int n4, int n5, String string3, asz_0 asz_02, kl_1 kl_12, zl_2 zl_22) {
        this.d = n3;
        this.g = n5;
        this.e = n4;
        this.h = string3;
        this.f = kl_12;
        this.k = asz_02;
        this.j = zl_22;
    }

    public static EnumFacing a(int n) {
        return VALUES[MathHelper.a(n % VALUES.length)];
    }

    public static EnumFacing a(float f, float f2, float f3) {
        EnumFacing enumFacing = NORTH;
        float f4 = Float.MIN_VALUE;
        for (EnumFacing enumFacing2 : EnumFacing.values()) {
            float f5 = f * (float)FJ.a(enumFacing2.j) + f2 * (float)FJ.b(enumFacing2.j) + f3 * (float)FJ.c(enumFacing2.j);
            if (!(f5 > f4)) continue;
            f4 = f5;
            enumFacing = enumFacing2;
        }
        return enumFacing;
    }

    private EnumFacing d() {
        switch (aLE.c[this.ordinal()]) {
            case 2: {
                return DOWN;
            }
            default: {
                throw new IllegalStateException(aL0.a(aL0.a(new StringBuilder(), co_0.u), this).toString());
            }
            case 4: {
                return UP;
            }
            case 5: {
                return EAST;
            }
            case 6: 
        }
        return WEST;
    }

    public int b() {
        return this.g;
    }

    public EnumFacing f() {
        switch (aLE.c[this.ordinal()]) {
            case 1: {
                return EAST;
            }
            case 2: {
                return SOUTH;
            }
            case 3: {
                return WEST;
            }
            case 4: {
                return NORTH;
            }
        }
        throw new IllegalStateException(aL0.a(aL0.a(new StringBuilder(), co_0.k), this).toString());
    }

    public static EnumFacing b(int n) {
        return c[MathHelper.a(n % c.length)];
    }

    public int g() {
        return this.f == kl_1.Y ? apc_0.a(this.k) : 0;
    }

    public int i() {
        return this.d;
    }

    public int c() {
        return this.f == kl_1.Z ? apc_0.a(this.k) : 0;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public static EnumFacing a(asz_0 asz_02, kl_1 kl_12) {
        for (EnumFacing enumFacing : EnumFacing.values()) {
            if (enumFacing.a() != asz_02 || enumFacing.l() != kl_12) continue;
            return enumFacing;
        }
        throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), co_0.v), (Object)asz_02), co_0.c), kl_12).toString());
    }

    public static EnumFacing a(String string) {
        return null;
    }

    public String m() {
        return this.h;
    }

    public EnumFacing e() {
        return VALUES[this.e];
    }

    public String toString() {
        return this.h;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u000eB\u0011'!d5|<~&".toCharArray();
        int n2 = 0;
        int n3 = 126;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x33));
            n3 = n3;
        }
    }

    public kl_1 l() {
        return this.f;
    }

    public static EnumFacing[] values() {
        return (EnumFacing[])l.clone();
    }

    public EnumFacing a(kl_1 kl_12) {
        switch (aLE.d[kl_12.ordinal()]) {
            case 1: {
                if (this != WEST && this != EAST) {
                    return this.k();
                }
                return this;
            }
            case 2: {
                if (this != UP && this != DOWN) {
                    return this.f();
                }
                return this;
            }
            case 3: {
                if (this != NORTH && this != SOUTH) {
                    return this.d();
                }
                return this;
            }
        }
        throw new IllegalStateException(aL0.a(aL0.a(new StringBuilder(), co_0.l), kl_12).toString());
    }

    private EnumFacing k() {
        switch (aLE.c[this.ordinal()]) {
            case 1: {
                return DOWN;
            }
            default: {
                throw new IllegalStateException(aL0.a(aL0.a(new StringBuilder(), co_0.x), this).toString());
            }
            case 3: {
                return UP;
            }
            case 5: {
                return NORTH;
            }
            case 6: 
        }
        return SOUTH;
    }

    public static EnumFacing a(Random random) {
        return EnumFacing.values()[a5_0.a(random, EnumFacing.values().length)];
    }

    public static EnumFacing a(double d) {
        return EnumFacing.b(MathHelper.floor_double(d / 90.0 + 0.5) & 3);
    }
}

