/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import java.util.Map;
import deobf.EnumFacing;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.kL
 */
public class kl_1
extends Enum<kl_1>
implements Predicate,
ab9_0 {
    private static kl_1[] d;
    private static String e = "CL_00002321";
    private static kl_1[] c;
    public static /* enum */ kl_1 Z;
    public static /* enum */ kl_1 X;
    private static Map b;
    public static /* enum */ kl_1 Y;
    private cs_1 a;
    private String f;

    public static kl_1 a(String string) {
        return null;
    }

    public static kl_1 valueOf(String string) {
        return (kl_1)jc_0.a(kl_1.class, string);
    }

    private kl_1(String string2, int n2, String string3, cs_1 cs_12) {
        this.f = string3;
        this.a = cs_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "J\u0017\u0013}b\u001aw;h~|".toCharArray();
        int n2 = 0;
        int n3 = 97;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x68));
            n3 = n3;
        }
    }

    public boolean c() {
        return this.a == cs_1.VERTICAL;
    }

    public boolean a(EnumFacing enumFacing) {
        return SJ.h(enumFacing) == this;
    }

    public cs_1 d() {
        return this.a;
    }

    public boolean apply(Object object) {
        return this.a((EnumFacing)object);
    }

    public String b() {
        return this.f;
    }

    public static kl_1[] values() {
        return (kl_1[])c.clone();
    }

    public String toString() {
        return this.f;
    }

    public boolean a() {
        return this.a == cs_1.HORIZONTAL;
    }

    @Override
    public String a() {
        return this.f;
    }
}

